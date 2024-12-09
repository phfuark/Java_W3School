import java.util.ArrayList; // import the ArrayList class

public class BillCalculator {
    static void Bill_Calculator(){
        ArrayList<String> Comidas = new ArrayList<String>(); // Create an ArrayList object
        Comidas.add("BANANA");
        Comidas.add("MAÇA");
        Comidas.add("PÊSSEGO");
        Comidas.add("MARACUJÁ");  

        ArrayList<Double> Preco = new ArrayList<Double>(); // Create an ArrayList object
        Preco.add(4.90);
        Preco.add(5.90);
        Preco.add(11.90);
        Preco.add(8.90); 
        
        for (int i = 0; i < Comidas.size(); i++){
            System.out.printf("%d. O Produto %s tem o preço: R$ %,.2f\n", i + 1, Comidas.get(i), Preco.get(i));
        }
    }

   
    public static void main(String[] args){
        Bill_Calculator();
    }
}
