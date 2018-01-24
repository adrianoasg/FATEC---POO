package prjfuncionarios;

public class Funcionario {
    //Atributos
    private String nome;
    private String departamento;
    private double salario;
    private String rg;
    private boolean estaNaEmpresa;
    
    //Par de gets e sets
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }
    
    public void bonificar(double aumento){
        salario += aumento;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        if(estaNaEmpresa){
            System.out.println("Funcionáiro Ativo na Empresa");
        }else{
            System.out.println("Funcionário desligado");
        }
        System.out.println("Documento RG: "+ rg);
    }
    
}
