// класс наследник
public class BottleOfWater extends Product{
    private double volume;

// конструктор
    public BottleOfWater(String name, String brand, double price, double volume) {
        super(name, brand, price);
        this.volume = volume;
    }
// метод возвращает значение
    public double getVolume() {
        return volume;
    }
// метод изменяет значение
    public void setVolume(int volume) {
        this.volume = volume;
    }
    // метод вывода информации с модификатором супер класса
    @Override
    public String toString() {
        return super.toString() +"; "+ "Volume=" + volume ;
    
    }
    

}