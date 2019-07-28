/**
 * Created by IntelliJ IDEA.
 * User: Lucas Vilela
 * Date: 06/11/2018
 * Time: 22:13
 * To change this template use File | Settings | File and Code Templates.
 */
public interface IRRF_interface {

    static Double getAliquotaIRRF(Double salario){
        Double aliquota = null;
        if(!atingiuTeto(salario)) {
            for (IRRF_enum faixa : IRRF_enum.values()) {
                if (salario >= faixa.getMinimo() && salario <= faixa.getMaximo())
                    aliquota =faixa.getAliquota();
            }
        }
        else
            aliquota = IRRF_enum.quinta_faixa.getAliquota();

        return aliquota;

    }

    static Double getDeducaoIRRF(Double aliquota){
        Double deducao = null;
        for(IRRF_enum faixa : IRRF_enum.values()){
            if(faixa.getAliquota().equals(aliquota))
                deducao = faixa.getDeducao();
        }
        return deducao;
    }

    static Double calculaValorIRRF(Double salario, Integer qtdDependentes){
        Double total = null;
        if(!atingiuTeto(salario)) {
            total = salario - INSS_interface.calculaValorINSS(salario) - (qtdDependentes * 189.59);
            total = total * getAliquotaIRRF(total) / 100 - getDeducaoIRRF(getAliquotaIRRF(total));
            return total;
        }
        else {
            total = salario - INSS_interface.calculaValorINSS(salario) - (qtdDependentes * 189.59);
            total = total * 27.5 / 100 - getDeducaoIRRF(getAliquotaIRRF(total));
            return total;

        }
    }

    static Boolean atingiuTeto(Double salario) {
        if ((salario - INSS_interface.calculaValorINSS(salario)) <= IRRF_enum.quinta_faixa.getMinimo())
            return false;
        else
            return true;
    }
}
