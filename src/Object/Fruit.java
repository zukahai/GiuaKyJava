package Object;

import java.util.Scanner;

import Interface.IFruit;

public class Fruit implements IFruit{
    int id;
    String name;
    double price;

    public Fruit() {
        this.id = 0;
        this.name = "";
        this.price = 0;
    }

    public Fruit(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "[ID=" + this.id + ", name=" + this.name + " Price=" + this.price + "]";
    }

    public void input(FruitList F) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print("Nhap ID: ");
            this.id = sc.nextInt();
            check = checkID(this.id, F);
            if (check == false)
                System.out.println("ID da ton tai, vui long nhap ID khac");
        } while (check == false);
        sc.nextLine();
        System.out.print("Nhap Name: ");
        this.name = sc.nextLine();
        System.out.print("Nhap Price: ");
        this.price = sc.nextDouble();
    }

    public boolean checkID(int id, FruitList F) {
        for (int i = 0; i < F.FList.size(); i++)
            if (F.FList.get(i).getId() == id)
                return false;
        return true;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public double priceForSale() {
        // TODO Auto-generated method stub
        return 0;
    }
}
