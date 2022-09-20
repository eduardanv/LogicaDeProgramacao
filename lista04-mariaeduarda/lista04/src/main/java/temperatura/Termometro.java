package temperatura;

public class Termometro {

    Double temperaturaAtual = 0.0;
    Double temperaturaMax = 0.0;
    Double temperaturaMin = 0.0;
    
    
    public Termometro(Double temperaturaAtual, Double temperaturaMax, Double temperaturaMin) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }

 

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Double getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(Double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public Double getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(Double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public void aumentaTemperatura(Double temperaturaAtual) {
        Double temperatura = getTemperaturaAtual(); 
        Double  tempMax = this.temperaturaMax;
        Double tempAtual = this.temperaturaAtual;
        
        if(temperatura > tempMax){
            tempMax = temperatura;
            System.out.printf("Temperatura Max em Cº: %.2f \n", temperaturaAtual);
        }else{
            
            System.out.printf("Temperatura Max em Cº: %.2f \n", temperaturaAtual);
        }
        
    }
    
    public void diminuiTemperatura(Double temperaturaAtual) {
        Double temperatura = getTemperaturaAtual(); 
        Double  tempMin = this.temperaturaMin;
        Double tempAtual = this.temperaturaAtual;
        
        if(temperatura < tempMin){
            tempMin = temperatura;
            
        System.out.printf("Temperatura Min em Cº: %.2f \n", temperaturaAtual);
        }else{
        System.out.printf("Temperatura Min em Cº: %.2f \n", temperaturaAtual);
        }
         
    }
    
    public void exibeFahreinheit(Double fahreinheit){
        Double temperatura = getTemperaturaAtual();
        Double tempFahreinheit = (temperatura * 1.8) + 32;
        
        System.out.printf("Temperatura em Fº: %.2f", tempFahreinheit);
    }
    
    
}
