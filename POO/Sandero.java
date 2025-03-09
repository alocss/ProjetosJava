package POO;
public class Sandero implements Carro {

    final int limiteDeVelocidade = 150;

    public int velocidadeAtual = 0;

    @Override // Sobrescrevendo o que vem da interface + implementação 
    public void acelerar(){
        
        this.velocidadeAtual += 10;
        System.out.println("Acelerando");
        System.out.println("Velocidade atual ");

    }

    @Override
    public void freiar(){
        
    }

    @Override
    public void parar(){
        
    }



    
}