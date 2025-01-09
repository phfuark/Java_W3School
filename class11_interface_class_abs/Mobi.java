package class11_interface_class_abs;

public class Mobi implements Car{

    @Override
    public void acelerar() {
        System.out.printf("Acelerando o carro a 40km/h");
    }

    @Override
    public void frear() {
        System.out.printf("Freando o carro");
    }
    
}
