public abstract class SerVivo{


    protected int idade;
    public SerVivo(int idade){
        this.idade =idade;
    }

    public abstract void respirar();//Metodo

    public void dormir(){
        System.out.println("Dormindo...."); //Metodos com implementação
    }

}