package Object;

import java.util.ArrayList;

public class FruitList {
    ArrayList<Fruit> FList = new ArrayList<Fruit>();

    public FruitList() {
        this.FList = new ArrayList<Fruit>();
    }

    public FruitList(ArrayList<Fruit> FList) {
        this.FList = FList;
    }

    public void add(Fruit f) {
        this.FList.add(f);
    }

    public void show() {
        if (this.FList.size() == 0)
            System.out.println("Chua co Fruit nao.");
        for (int i = 0; i < this.FList.size(); i++)
            System.out.println(this.FList.get(i).toString());
    }

    public void priceForSaleGreater20() {
        boolean flag = true;
        for (int i = 0; i < this.FList.size(); i++)
            if (this.FList.get(i).priceForSale() > 20) {
                System.out.println(this.FList.get(i).toString());
                flag = false;
            }
        if (flag)
            System.out.println("Khong co Fruit nao co PriceForSale lon hon 20.");       
    }

    public int NumberOfFruit() {
        return this.FList.size();
    }

    public void setFList(ArrayList<Fruit> FList) {
        this.FList = FList;
    }

    public ArrayList<Fruit> getFlist() {
        return this.FList;
    }
}
