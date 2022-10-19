package com.mycompany.exemplo.agregacao;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        
        Grupo grupo1 = new Grupo("Grupo LP");
        
        Contato c1 = new Contato("Diego", "(11) 99999-9999");
        Contato c2 = new Contato("Ricardo", "(11) 99999-9999");
        Contato c3 = new Contato("Eduarda", "(11) 99999-9999");
        
         grupo1.adiciona(c1);
        grupo1.adiciona(c2);
        grupo1.adiciona(c3);
        
        List<Contato> teste = new ArrayList<>();
        
        teste.add(c1);
        teste.add(c2);
        teste.add(c3);
        
        Grupo grupo2 = new Grupo("Exemplo passando lista", teste);
    }
}
