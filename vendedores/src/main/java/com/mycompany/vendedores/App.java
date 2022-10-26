package com.mycompany.vendedores;

public class App {

    public static void main(String[] args) {
        
        
        VendedorComissao vendedor1 = new VendedorComissao(12, "Vinicius", 10.000, 0.25);

        Double calcularSalarioVendedorComissao = vendedor1.calcularSalario();

        VendedorComissaoMaisFixo vendedor2 = new VendedorComissaoMaisFixo(11, "Vitor", 7.000, 0.15, 3.500);

        Double calcularSalarioVendedorComissaoMaisFixo = vendedor2.calcularSalario();
        
        System.out.println(calcularSalarioVendedorComissao);
        System.out.println(calcularSalarioVendedorComissaoMaisFixo);
        
    }

}
