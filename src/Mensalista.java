import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: Lucas Vilela
 * Date: 06/11/2018
 * Time: 20:47
 * To change this template use File | Settings | File and Code Templates.
 */
public class Mensalista extends Funcionarios{
    private final Double descontoVR = 15.0, descontoVT = 6.0;

    public Mensalista(String matricula, String nome, String cpf, Double salario, Double vr){
        super(matricula, nome, cpf, salario, vr, INSS_interface.calculaValorINSS(salario), IRRF_interface.calculaValorIRRF(salario, 0));
    }

    public Mensalista(String matricula, String nome, String cpf, Double salario, Double vr, ArrayList<Dependentes> dep){
        super(matricula, nome, cpf, salario, vr, INSS_interface.calculaValorINSS(salario), IRRF_interface.calculaValorIRRF(salario, dep.size()), dep);
    }

    @Override
    public Double calcularSalario(String tipo){
        Double salario = null;
        if(tipo.equalsIgnoreCase("b") || tipo.equalsIgnoreCase("bruto")){
            salario = super.getSalario();
        }
        else if(tipo.equalsIgnoreCase("l") || tipo.equalsIgnoreCase("liquido")){
            salario = super.getSalario() - super.getInss() - super.calcularDescontoVR(this.descontoVR) - super.calcularDescontoVT(this.descontoVT) - (IRRF_interface.calculaValorIRRF(super.getSalario(), super.getDependentes().size()));
        }
        return salario;
    }

    public String montaDependentes() {

        String dados = "";
        if(this.getDependentes().size() != 0){

            for(int i = 0; i < this.getDependentes().size(); i++)
                dados += this.getDependentes().get(i).toString();
            return dados;

        } else
            dados = "\nNenhum dependente cadastrado para este cliente.";
        return dados;
    }

    public String montarRelatorio(){
        return String.format("Matrícula: %s\nNome: %s\nCPF: %s\nAlíquota do INSS: %.0f%%\nDesconto INSS: %.2f\nAlíquota IRRF: %.1f%%\nDesconto IRRF: %.2f\nVale-Refeição: %.2f\nDesconto Vale-Refeição: %.2f\nDesconto Vale-Transporte: %.2f\nSalário Bruto: %.2f\nSalário Líquido: %.2f\nQuantidade de Dependentes Cadastrados: %d\nLista de Dependentes: %s",
                super.getMatricula(), super.getNome(), super.getCPF(), INSS_interface.getAliquotaINSS(super.getSalario()), super.getInss(), IRRF_interface.getAliquotaIRRF(super.getSalario()), IRRF_interface.calculaValorIRRF(super.getSalario(), super.getDependentes().size()), super.getValeRefeicao(), super.calcularDescontoVR(this.descontoVR), super.calcularDescontoVT(), this.calcularSalario("b"),
                this.calcularSalario("l"), (super.getDependentes().size() > 0) ? super.getDependentes().size() : 0, montaDependentes());
    }
}
