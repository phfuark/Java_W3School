public class Classes{
    public static void main(String[] args) {
        Carro carro = new Carro("Celta");

        carro.acelerar();
    }
}
class Carro {
    String nome;

    public Carro(String nome){
        this.nome = nome;
        System.out.printf("Carro %s Criado! \n", nome);
    }

    public void acelerar(){
        System.out.printf("Acelerando o carro %s", this.nome);
    }
}