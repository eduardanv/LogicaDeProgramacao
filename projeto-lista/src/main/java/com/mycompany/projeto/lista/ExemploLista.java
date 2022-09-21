
package com.mycompany.projeto.lista;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        
        
//        //Object
//        List listaLoka = new ArrayList();
//        
//        listaLoka.add("Richard");
//        listaLoka.add(29);
//        listaLoka.add(true);
//        listaLoka.add(1.83);
//        
//        for (int i = 0; i < listaLoka.size(); i++) {
//            System.out.println(listaLoka.get(i));
//            System.out.println("");
//        }

           //Tipo genérico ou generic type
           //Diamond operator <>
          List<String> nomes = new ArrayList();
          
          //nomes.add(29);
          //DÁ RUIM!!!!!
          
          nomes.add("Diego");//0
          nomes.add("Frizza");//1
          nomes.add("Gerson");//2
          nomes.add("Duda");//3

          //for (int i = 0; i < nomes.size(); i++) {
             // System.out.println("Nome: " + nomes.get(i));
             // System.out.println("");
          //}
          //EMPPURRAR E TROCAR POSIÇAO
          nomes.add(0,"Marise");
          
         //for (int i = 0; i < nomes.size(); i++) {
             // System.out.println("Nome: " + nomes.get(i));
          //}
         //TROCAR
         nomes.set(0,"Ari");
                 
         //for (int i = 0; i < nomes.size(); i++) {
             // System.out.println("Nome: " + nomes.get(i));
          //}       
           
         nomes.remove(0);
         
         int numero = 2;
         
         nomes.remove(numero);
         
         for (int i = 0; i < nomes.size(); i++) {
              System.out.println("Nome: " + nomes.get(i));
          }  
         
         nomes.clear();
         
         System.out.println("Tamanho depois do clear :" + nomes.size());
          
         
         if(nomes.isEmpty()){
             System.out.println("Vazia :(");
         } 
         
         else{
             System.out.println("Não está vazia :)");
         }
    }
}
