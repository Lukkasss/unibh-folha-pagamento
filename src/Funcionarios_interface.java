import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Lucas Vilela
 * Date: 06/11/2018
 * Time: 21:05
 * To change this template use File | Settings | File and Code Templates.
 */
public interface Funcionarios_interface {
    //Gets
    String getMatricula();
    String getNome();
    String getCPF();
    Double getSalario();
    Double getValeRefeicao();
    ArrayList<Dependentes> getDependentes();
    Double getInss();
    Double getIrrf();

    //Sets
    void setMatricula(String matricula);
    void setNome(String nome);
    void setCPF(String cpf);
    void setSalario(Double salario);
    void setSalario(Double vendas, Double comissao);
    void setValeRefeicao(Double vale);
    void setDependentes(ArrayList<Dependentes> dependentes);
    void setInss(Double inss);
    void setIrrf(Double irrf);

    //Métodos
    Double calcularDescontoVT();
    Double calcularDescontoVT(Double percentual);
    Double calcularDescontoVR(Double percentual);
    Double calcularSalario(String tipo);




}
