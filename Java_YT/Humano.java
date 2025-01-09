public class Humano extends SerVivo {
    public Humano(int idade){
        super(idade);
        System.out.printf("Idade: %d \n", idade);
    }

//    @Override
    public void Respirar() {
        System.out.println("Inalando e Espirando");
    }
}
