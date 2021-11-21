package Object;

import java.util.Scanner;

public class FruitIn extends Fruit {
    double extraIn;

    public FruitIn() {
        super();
        this.extraIn = 0;
    }

    public FruitIn(int id, String name, double price, double extraIn) {
        super(id, name, price);
        this.extraIn = extraIn;
    }

    public String toString() {
        return "FruitIn  [ID=" + this.id + ", Name=" + this.name + ", Price=" + this.price + ", PriceForSale=" + this.priceForSale() + ", ExtraIn=" + this.extraIn + "]";
    }

    public double priceForSale() {
        return this.price + this.extraIn;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap ExtraIn: ");
        this.extraIn = sc.nextDouble();
    }

    public double getExtraIn() {
        return this.extraIn;
    }

    public void setExtraIn(double extraIn) {
        this.extraIn = extraIn;
    }
}
