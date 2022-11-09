package com.mycompany.vendedores;

public class App {

    public static void main(String[] args) {
        
        Departamento dept = new Departamento("Eletrônicos");
        
        
        VendedorComissao vendedor1 = new VendedorComissao(12, "Vinicius", 1_000.0, 10.0);

        VendedorComissaoMaisFixo vendedor2 = new VendedorComissaoMaisFixo(11, "Vitor", 3000.0, 1.0, 3500.0);

        
        dept.adicionaVendedor(vendedor1);
        dept.adicionaVendedor(vendedor2);
        System.out.println("Total: " + dept.getQuantidadeVendedores());
        
        
        System.out.println(vendedor1);
        System.out.println(vendedor2);
        
        System.out.println("Total dos salários: " + dept.calcularTotalSalario());
        System.out.println("Total de vendedores com salário fixo: " + dept.getQuantidadeFixos());
        
    }

}
