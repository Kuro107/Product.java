package task3.product;

import java.util.Arrays;

public class Product {
    protected String name;
    protected double price;
    protected Composition [] composition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Composition[] getComposition() {
        return composition;
    }

    public void setComposition(Composition[] composition) {
        this.composition = composition;
    }

    public String toString() {
        return "Название продукта " + name + "\n" +
                "Цена " + price + "\n" +
                "Состав продукта " + Arrays.toString(composition);

    }
}
class Composition{
    String nameOfProduct;

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }
}
class Milk extends Product{
    private String shelfLife;

    public String getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String toString(){
        return  "Срок годности " + shelfLife + "\n";
    }

}
