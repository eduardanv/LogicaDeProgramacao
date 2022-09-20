
package empregados;


public class Empregado {

   
    String nome;
    Double salario = 0.0;
    String cargo;
    
     public Empregado(String nome, String cargo, Double salario) {
     this.nome = nome;
     this.cargo = cargo;
     this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
     
  public void reajustarSalario(Double porcentagem){
        Double salario = getSalario();
        Double reajusteSalario = salario + (salario* (porcentagem/100));
 
        String nome = this.nome;
        String cargo = this.cargo;
        
        System.out.printf("\n Nome: %s \n Cargo: %s \n Salário: %.2f \n", nome, cargo, reajusteSalario);
    }
}
