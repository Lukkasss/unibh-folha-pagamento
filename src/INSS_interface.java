/**
 * Created by IntelliJ IDEA.
 * User: Lucas Vilela
 * Date: 06/11/2018
 * Time: 22:13
 * To change this template use File | Settings | File and Code Templates.
 */
public interface INSS_interface {

    static Double getAliquotaINSS(Double salario){
        Double aliquota = null;

        if(!atingiuTeto(salario)) {
            for (INSS_enum faixa : INSS_enum.values()) {
                if (salario >= faixa.getMinimo() && salario <= faixa.getMaximo())
                    aliquota = faixa.getAliquota();
            }
        }
        else
            aliquota = INSS_enum.terceira_faixa.getAliquota();


        return aliquota;

    }

    static Double calculaValorINSS(Double salario){
        if(!atingiuTeto(salario))
            return salario * getAliquotaINSS(salario) / 100;
        else
            return 5645.8 * 11.0 / 100;
    }

    static Boolean atingiuTeto(Double salario) {
        if (salario <= 5645.8)
            return false;
        else
            return true;
    }

}
