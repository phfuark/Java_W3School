package class11_interface_class_abs;

public class Sandero implements Car {

    @Override
    public void acelerar() {
        System.out.printf("Acelerando o carro a 20km/h");
    }

    @Override
    public void frear() {
        System.out.printf("Freando o carro");
    }
}


