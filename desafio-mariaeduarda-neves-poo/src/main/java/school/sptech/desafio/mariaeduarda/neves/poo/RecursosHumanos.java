package school.sptech.desafio.mariaeduarda.neves.poo;

public class RecursosHumanos {

    private Integer quantidadePromovidos;
    private Integer quantidadeReajustes;

    public RecursosHumanos() {
        quantidadePromovidos = 0;
        quantidadeReajustes = 0;
    }

    public Integer getQuantidadePromovidos() {
        return quantidadePromovidos;
    }

    public Integer getQuantidadeReajustes() {
        return quantidadeReajustes;
    }

    public void setQuantidadePromovidos(Integer quantidadePromovidos) {
        this.quantidadePromovidos = quantidadePromovidos;
    }

    public void setQuantidadeReajustes(Integer quantidadeReajustes) {
        this.quantidadeReajustes = quantidadeReajustes;
    }

    public void reajustarSalario(Colaborador colaborador, Double porcentagem) {
        if (colaborador != null && porcentagem != null) {
            if (porcentagem > 0) {
                Double salarioReajuste = colaborador.getSalario() + ((colaborador.getSalario() / 100) * porcentagem);
                System.out.println("Reajuste realizado com sucesso! Novo salário: " + salarioReajuste);
                colaborador.setSalario(salarioReajuste);
                quantidadeReajustes++;
                System.out.println("Quantidade de reajustes: " + quantidadeReajustes);
            }
        }

    }

    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario) {
        if (colaborador != null && novoCargo != null && novoSalario != null) {

            if (novoSalario > colaborador.getSalario()) {
                colaborador.setSalario(novoSalario);
                colaborador.getNome();
                colaborador.setCargo(novoCargo);
                quantidadePromovidos++;
                System.out.println("Quantidade de funcionários promovidos: " + quantidadePromovidos);

            } else {
                System.out.println("O novo salário deve ser maior que o anterior.");
            }
        }

    }
}
