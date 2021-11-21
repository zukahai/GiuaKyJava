package Object;

import java.util.Scanner;

public class FruitOut extends Fruit{
    String orgin;
    double extraOut;

    public FruitOut() {
        super();
        this.orgin = "";
        this.extraOut = 0;
    }

    public FruitOut(int id, String name, double price, String orgin, double extraOut) {
        super(id, name, price);
        this.orgin = orgin;
        this.extraOut = extraOut;
    }

    public String toString() {
        return "FruitOut [ID=" + this.id + ", Name=" + this.name + ", Price=" + this.price + ", PriceForSale=" + this.priceForSale() + ", Orgin=" + this.orgin + ", ExtraIn=" + this.extraOut + "]";
    }

    public double priceForSale() {
        return this.price + this.extraOut + 0.1 * this.extraOut;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap Orgin: ");
        this.orgin = sc.nextLine();
        System.out.print("Nhap ExtraOut: ");
        this.extraOut = sc.nextDouble();
    }

    public String getOrgin() {
        return this.orgin;
    }

    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }

    public double getExtraOut() {
        return this.extraOut;
    }

    public void setExtraOut(double extraOut) {
        this.extraOut = extraOut;
    }

}
