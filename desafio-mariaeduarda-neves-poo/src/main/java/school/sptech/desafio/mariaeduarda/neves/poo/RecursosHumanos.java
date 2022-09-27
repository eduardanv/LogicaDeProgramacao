package school.sptech.desafio.mariaeduarda.neves.poo;

public class RecursosHumanos {

  


    private Integer quantidadePromovidos = 0;
    private Integer quantidadeReajustes = 0;

    Colaborador colaborador1 = new Colaborador("João", "Auxiliar Administrativo", 1_254.0);

    public RecursosHumanos(String nome,String cargo, Double salario) {
        colaborador1.getNome();
        colaborador1.getCargo();
        colaborador1.getSalario();
    }

    
    
    public void setQuantidadePromovidos(Integer quantidadePromovidos) {
        this.quantidadePromovidos = quantidadePromovidos;
    }

    public void setQuantidadeReajustes(Integer quantidadeReajustes) {
        this.quantidadeReajustes = quantidadeReajustes;
    }

    public Integer reajustarSalario(String colaborador, Double porcentagem){
        if(colaborador.equals("") || porcentagem == null){
            return null;
        }
        else{
            Double salarioReajuste = colaborador1.getSalario() + (colaborador1.getSalario() * porcentagem);
            System.out.println("Reajuste realizado com sucesso! Novo salário: " + salarioReajuste);
            quantidadeReajustes++;
            System.out.println("Quantidade de reajustes: ");
            return quantidadeReajustes;
        }
    }

    public Integer promoverColaborador(String colaborador, String novoCargo, Double novoSalario) {
        if(colaborador.equals("") || novoCargo.equals("") || novoSalario == null){
           return null;
        }
        else{
            
            if(novoSalario > colaborador1.getSalario()){
                colaborador1.setSalario(novoSalario);
                colaborador1.getNome();
                colaborador1.setCargo(novoCargo);
                quantidadePromovidos++;
                System.out.println("Quantidade de funcionários promovidos: ");
            }
            else{
                return null;
            }
            
            
            
            return quantidadePromovidos;
        }
    }
}
