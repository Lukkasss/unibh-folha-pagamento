import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Lucas Vilela
 * Date: 06/11/2018
 * Time: 20:47
 * To change this template use File | Settings | File and Code Templates.
 */
public abstract class Funcionarios implements Funcionarios_interface {

    //Atributos
    private String matricula = null, nome = null, cpf = null;
    private Double salario = null, vale_refeicao = null, valorINSS = null, valorIRRF = null;
    private ArrayList<Dependentes> dependentes = null;

    public Funcionarios() {
    }

    public Funcionarios(String matricula, String nome, String cpf, Double vale_refeicao) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.vale_refeicao = vale_refeicao;
    }

    public Funcionarios(String matricula, String nome, String cpf, Double salario, Double vale_refeicao) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.vale_refeicao = vale_refeicao;
    }

    public Funcionarios(String matricula, String nome, String cpf, Double vale_refeicao, ArrayList<Dependentes> dependentes) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.vale_refeicao = vale_refeicao;
        this.dependentes = dependentes;
    }

    public Funcionarios(String matricula, String nome, String cpf, Double salario, Double valorINSS, Double valorIRRF, Double vale_refeicao) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.valorINSS = valorINSS;
        this.valorIRRF = valorIRRF;
        this.vale_refeicao = vale_refeicao;
    }

    public Funcionarios(String matricula, String nome, String cpf, Double salario, Double vale_refeicao, ArrayList<Dependentes> dependentes) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.vale_refeicao = vale_refeicao;
        this.dependentes = dependentes;
    }

    public Funcionarios(String matricula, String nome, String cpf, Double salario, Double vale_refeicao, Double inss, ArrayList<Dependentes> dependentes) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.vale_refeicao = vale_refeicao;
        this.dependentes = dependentes;
        this.valorINSS = inss;
    }

    public Funcionarios(String matricula, String nome, String cpf, Double salario, Double vale_refeicao, Double valorINSS, Double valorIRRF, ArrayList<Dependentes> dependentes) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.vale_refeicao = vale_refeicao;
        this.valorINSS = valorINSS;
        this.valorIRRF = valorIRRF;
        this.dependentes = dependentes;
    }

    @Override
    public String getMatricula() {
        return this.matricula;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getCPF() {
        return this.cpf;
    }

    @Override
    public Double getSalario() {
        return this.salario;
    }

    @Override
    public Double getValeRefeicao() {
        return this.vale_refeicao;
    }

    @Override
    public ArrayList<Dependentes> getDependentes() {
        return this.dependentes;
    }

    @Override
    public Double getInss() {
        return this.valorINSS;
}

    @Override
    public Double getIrrf() {
        return this.valorIRRF;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void setSalario(Double vendas, Double comissao){
        this.salario = vendas * comissao / 100;
    }

    @Override
    public void setValeRefeicao(Double vale) {
        this.vale_refeicao = vale;
    }

    @Override
    public void setDependentes(ArrayList<Dependentes> dep) {
        this.dependentes = dep;
    }

    @Override
    public void setInss(Double inss) {
        this.valorINSS = inss;
    }

    @Override
    public void setIrrf(Double irrf) {
        this.valorIRRF = irrf;
    }

    public Double descontarINSS(){
        return this.getSalario() - this.valorINSS;
    }

    public Double calcularDescontoVR(){
        return 1.00;
    }

    public Double calcularDescontoVR(Double percentual){
        return this.getValeRefeicao() * percentual / 100;
    }

    public Double calcularDescontoVT(){
        return this.getSalario() * 6.0 / 100;
    }

    public Double calcularDescontoVT(Double percentual){
        return this.getSalario() * percentual / 100;
    }
}
