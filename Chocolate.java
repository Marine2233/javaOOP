// класс наследник
public class Chocolate extends Product {
    private int gramm;
    private String taste;

    public Chocolate(String name, String brand, double price, int gramm, String taste) {
        super();
        this.gramm = gramm;
        this.taste = taste;
    }

    @Override
    public String toString() {
        
        return super.toString() +  "gramm: " + gramm +" " + " taste: " + " " + taste;
    }

    public int getGramm() {
        return gramm;
    }

    public String getTaste() {
        return taste;
    }
    
}