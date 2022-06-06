package task1;

public class Product {
    String name;
    double price;
    String shelfLife;
    public String toString(){
        return "Название продукта " + name + "\n" +
                "Цена " + price + "\n" +
                "Срок годности " + shelfLife;
    }

    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product);
    }
}
