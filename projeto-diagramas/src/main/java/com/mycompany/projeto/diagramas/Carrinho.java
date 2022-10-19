
package com.mycompany.projeto.diagramas;

import java.util.List;


public class Carrinho {
    
    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }
    
    public Integer getQuantidade(Produto produto){
        Integer quantidade = 0;
        for (int i = 0; i < produtos.size(); i++) {
           quantidade++;
        }
        
        return quantidade;
    }
    
    public void adicionar(Produto produto){
        produtos.add(produto);
    }
    
    public Boolean existsPorNome(String nome){
        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getNome().equals(nome)){
                return true;
            }
        }
        
        return false;
    }
    
    public Integer getQuantidadePorCategoria(String nome){
        Integer quantidade = 0;
        
        for (Produto produto : produtos) {
            if(produto.getCategoria().equals(nome)){
             quantidade++;
            }
        }
        
        return quantidade;
        
    }
    
    public void limpar(){
        for (int i = 0; i < produtos.size(); i++) {
                produtos.remove(i);
        }
    }
    
    public void removerPorNome(String nome){
         for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getNome().equals(nome)){
                produtos.remove(i);
            }
        }
    }
    
    public Produto(String nome){
        
    }
    
    
    
    
}
