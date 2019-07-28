/**
 * Created by IntelliJ IDEA.
 * User: Lucas Vilela
 * Date: 06/11/2018
 * Time: 21:06
 * To change this template use File | Settings | File and Code Templates.
 */
public interface Dependentes_interface {

    //Gets
    String getCpf();
    String getNome();
    Integer getIdade();

    //Sets
    void setCpf();
    void setNome();
    void setIdade();

    //Métodos
    String toString();
}