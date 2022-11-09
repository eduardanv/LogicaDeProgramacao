package com.mycompany.vendedores;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nome;
    private List<VendedorComissao> vendedores;

    public Departamento(String nome) {
        this.nome = nome;
        this.vendedores = new ArrayList();
    }

    public void adicionaVendedor(VendedorComissao vendedor) {
        this.vendedores.add(vendedor);
    }

    public Integer getQuantidadeVendedores() {
        return vendedores.size();
    }

    public Double calcularTotalSalario() {
        Double total = 0.0;

        for (VendedorComissao vendedor : vendedores) {
            total += vendedor.calcularSalario();
        }

        return total;
    }

    public Integer getQuantidadeFixos() {
        Integer total = 0;

        for (VendedorComissao vendedor : vendedores) {
            
                if (vendedor instanceof VendedorComissaoMaisFixo) {
                total++;
            }
        }

        return total;
    }

}
