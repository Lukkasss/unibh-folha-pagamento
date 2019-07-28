/**
 * Created by IntelliJ IDEA.
 * User: Lucas Vilela
 * Date: 07/11/2018
 * Time: 13:34
 * To change this template use File | Settings | File and Code Templates.
 */
public enum IRRF_enum {
    primeira_faixa(0.0, 1903.98, 0.0, 0.0),
    segunda_faixa(1903.99, 2826.65, 7.5, 142.8),
    terceira_faixa(2826.66, 3751.05, 15.0, 354.8),
    quarta_faixa(3751.06, 4664.66, 22.5, 636.13),
    quinta_faixa(4664.69, 999999.9, 27.5, 869.36);

    private Double minimo = null, maximo = null, aliquota = null, deducao = null;

    private IRRF_enum(Double minimo, Double maximo, Double aliquota, Double deducao){
        this.minimo = minimo;
        this.maximo = maximo;
        this.aliquota = aliquota;
        this.deducao = deducao;
    }

    public Double getMinimo() {
        return minimo;
    }

    public Double getMaximo() {
        return maximo;
    }

    public Double getAliquota() {
        return aliquota;
    }

    public Double getDeducao() {
        return deducao;
    }
}
