/**
 * Created by IntelliJ IDEA.
 * User: Lucas Vilela
 * Date: 06/11/2018
 * Time: 22:19
 * To change this template use File | Settings | File and Code Templates.
 */
public enum INSS_enum {
    primeira_faixa(0.0, 1693.72, 8.0),
    segunda_faixa(1693.73, 2822.9, 9.0),
    terceira_faixa(2822.91, 5645.8, 11.0);

    private Double minimo = null, maximo = null, aliquota = null;

    private INSS_enum(Double minimo, Double maximo, Double aliquota){
        this.minimo = minimo;
        this.maximo = maximo;
        this.aliquota = aliquota;
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
}
