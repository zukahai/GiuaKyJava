import java.util.Scanner;

import Object.Fruit;
import Object.FruitIn;
import Object.FruitList;
import Object.FruitOut;

public class Main {

    public static void displayMenu() {
        System.out.println("+---------------------------- Menu --------------------------------+");
        System.out.println("| 1) Them Fruit vao danh sach gom FruitIn và FruitOut              |");
        System.out.println("| 2) In ra danh sach Fruit                                         |");
        System.out.println("| 3) In danh sach FruitIn va FruitOut có priceForSale lon hon 20   |");
        System.out.println("| 4) Tinh tong số Fruit co trong danh sach                         |");
        System.out.println("| 5) Thoat                                                         |");
        System.out.println("+------------------------------------------------------------------+");
    }

    public static void main(String[] args) throws Exception {
        FruitList F = new FruitList();
        Scanner sc = new Scanner(System.in);
        boolean Menu = true;
        int choice = 0, choice2 = 0;
        String temp;
        while (Menu) {
            displayMenu();
            System.out.print("Nhap lua chon cua ban: ");
            temp = sc.nextLine();
            try {
                choice = Integer.parseInt(temp);
            } catch (Exception e) {
                System.out.println("Lua chon khong dung");
                continue;
            }
            switch(choice) {
                case 1:
                    System.out.println("+---------------------------- Menu --------------------------------+");
                    System.out.println("| 1) Them FruitIn                                                  |");
                    System.out.println("| 2) Them FruitOut                                                 |");
                    System.out.println("+------------------------------------------------------------------+");
                    System.out.print("Nhap lua chon cua ban: ");    
                    temp = sc.nextLine();
                    try {
                        choice2 = Integer.parseInt(temp);
                    } catch (Exception e) {
                        System.out.println("Lua chon khong dung");
                        continue;
                    }
                    Fruit f = new Fruit();
                    switch (choice2) {
                        case 1:
                            f = new FruitIn();
                            f.input();
                            F.add(f);
                            break;
                        case 2:
                            f = new FruitOut();
                            f.input();
                            F.add(f);
                            break;
                        default:
                            System.out.println("Lua chon khong dung");
                            break;
                    }
                    break;

                case 2:
                    F.show();
                    break;
                case 3:
                    F.priceForSaleGreater20();
                    break;
                case 4:
                    System.out.println("Number of fruit: " + F.NumberOfFruit());
                    break;
                case 5:
                    Menu = false;
                    break;
                default:
                    System.out.println("Lua chon khong dung");
                    break;
            }
        }
        System.out.println("Ket Thuc");
    }
}