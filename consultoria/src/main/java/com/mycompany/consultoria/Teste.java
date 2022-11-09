package com.mycompany.consultoria;

public class Teste {

    public static void main(String[] args) {

        Consultoria consul = new Consultoria("SPTech Solutions", 20);

        Desenvolvedor dev1 = new Desenvolvedor("Ricardo", 2, 4.50);
        Desenvolvedor dev2 = new Desenvolvedor("Matheus", 8, 6.50);

        DesenvolvedorMobile dev3 = new DesenvolvedorMobile("Lucia", 8, 6.50, 2, 3.65);

        
        consul.contratar(dev1);
        consul.contratar(dev2);
        consul.contratar(dev3);
        
        
        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println(dev3);
        
        System.out.println("Total de desenvolvedores: " + consul.getQuantidadeDesenvolvedores());
        System.out.println("Total de desenvolvedores mobile: " + consul.getQuantidadeDesenvolvedoresMobile());
        
        System.out.println("Total dos salários: " + consul.getTotalSalarios());
        
        System.out.println("Existe por nome: " + consul.existePorNome("Vini"));
        
        System.out.println("Vagas restantes: " + consul.getVagas());
    }

}
