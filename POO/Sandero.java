package POO;
public class Sandero implements Carro {

    final int limiteDeVelocidade = 150;

    public int velocidadeAtual = 0;

    @Override // Sobrescrevendo o que vem da interface + implementação 
    public void acelerar(){
        if (this.velocidadeAtual < this.limiteDeVelocidade){
            this.velocidadeAtual += 50;
            System.out.println("Acelerando");
        } else {
            System.out.println("Você atingiu o limite de velocidade");
        }
        
        System.out.println("Velocidade atual " + this.velocidadeAtual);

    }

    @Override
    public void freiar(){
        
    }

    @Override
    public void parar(){
        
    }



    
}