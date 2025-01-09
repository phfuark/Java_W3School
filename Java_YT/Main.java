public class Main implements Car{
    public static void main(String[] args){
        Car car1 = new Sandero();
        car1.acelerar();

        SerVivo Paulo = new Humano(18);
        Humano PauloP = new Humano(22);


        PauloP.Respirar();
        Paulo.Dormir();
    }

    @Override
    public void acelerar() {

    }

    @Override
    public void freiar() {

    }
}