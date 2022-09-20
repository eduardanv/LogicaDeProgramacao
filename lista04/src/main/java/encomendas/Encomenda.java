package encomendas;

public class Encomenda {
    
    private String tamanho;
    private String enderecoRemetente;
    private String enderecoDestinatario;
    private Double distancia;
    private Double valorEncomenda;

    public Encomenda(String tamanho, String enderecoRemetente, String enderecoDestinatario, Double distancia, Double valorEncomenda) {
        this.tamanho = tamanho;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(String enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getValorEncomenda() {
        return valorEncomenda;
    }

    public void setValorEncomenda(Double valorEncomenda) {
        this.valorEncomenda = valorEncomenda;
    }
    
    public Double calcularFrete(String tamanho, Double distancia, Double valorEncomenda){
        Double jurosTamanho = 0.0;
        Double frete = 0.0;
        
        switch (tamanho) {
            case "P":
                jurosTamanho = valorEncomenda * 0.1;
                break;
            case "M":
                jurosTamanho = valorEncomenda * 0.3;
            case "G":
                jurosTamanho = valorEncomenda * 0.5;
        }
        
        if(distancia <=50){
            frete = 3.00;
        }
        
        if(distancia >50 && distancia <=200){
            frete = 5.00;
        }
        
        else{
            frete = 7.00;
        }
        
        return jurosTamanho + frete;
    }
    
    public void emitirEtiqueta(){
        
        tamanho = getTamanho();
        String remetente = this.enderecoRemetente;
        String destinatario = this.enderecoDestinatario;
        Double valorFrete = calcularFrete(tamanho, distancia, valorEncomenda);
        Double valorTotal = valorFrete + valorEncomenda;
        
        System.out.printf("***** ETIQUETA PARA ENVIO ***** \n Endereço do remetente: %s \n Endereço do destinatário: %s \n Tamanho: %s \n -------------------------------------------------- \n Valor encomenda: R$ %.2f \n Valor frete: R$ %.2f -------------------------------------------------- \n Valor total: R$ %.2f \n", remetente, destinatario, tamanho, valorEncomenda, valorFrete, valorTotal);
    }

}
