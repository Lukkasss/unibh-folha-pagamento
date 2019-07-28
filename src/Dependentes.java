/**
 * Created by IntelliJ IDEA.
 * User: Lucas Vilela
 * Date: 06/11/2018
 * Time: 20:48
 * To change this template use File | Settings | File and Code Templates.
 */
public class Dependentes {
    //Atributos
    String cpf = null, nome = null;
    Integer idade = null;

    public Dependentes() {
    }

    public Dependentes(String cpf, String nome, Integer idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String toString(){
        return String.format("\n{Nome: %s - CPF: %s - Idade: %d}", this.getNome(), this.getCpf(), this.getIdade());
    }


}
