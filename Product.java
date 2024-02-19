// класс родитель
public class Product{
    protected static String name;
    protected static String brand;
    protected static double price;

private void processPrice(double price){
    if ( price < 100 ){
        price = 100;
    }
    else{
        this.price = price;
    }
}

public void setPrice(double price){
    processPrice(price);
}
    
public double getPrice(){
    return price;
}

public void inicialName(String name){
    if ( name == null || name.length() < 3){
        name = "[Product]";
    }
    else{
        this.name = name;
    }
}

public String getName(String name){
    return name;
}

public void inicialBrand(String brand){
    if (brand == null){
        brand = "[brand]";
    }
    else{
        this.brand = brand;
    }
}

public String getBrand(String brand){
    return brand;
}

@Override
public String toString() {
   
    return "Name= " + name + ";" +" Brand= " +  brand + ";" + " Price= " + price ;
}

public  Product(){
    // вызов конструктора с 2-мя параметрами использует статические поля класса родителя
    this(name, price);
}


public Product(String name, String brand, double price ){
    

    inicialName(name);
    processPrice(price);
    inicialBrand(brand);

}

public Product(String name, double price){
    // вызов конструктора с 3-мя параметрами использует статические поля родителя
    this(name, brand, price);

    inicialName(name);
    processPrice(price);

    this.brand = "[brand]"  ;

}

}