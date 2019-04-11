package stone.duf.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StonesMarket {

    public static void main(String[] args) {

        MenuBuild menu = new MenuBuild();
        DBHelper dbHelper = new DBHelper();

        boolean exit = false;

        do {
            int pos = 0;
            int price = 0;

            menu.mainManu();

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            try {
                switch (Integer.parseInt(in.readLine())) {
                    case 1:
                        dbHelper.showAllData();
                        break;
                    case 2:
                        menu.clarityShow();
                        pos = Integer.parseInt(in.readLine());
                        dbHelper.findByClarity(pos);
                        break;
                    case 3:
                        price = menu.menuTotalPriceEnter();
                        dbHelper.findByPriceBucket(price);
                        break;
                    case 4:
                        menu.typeShow();
                        pos = Integer.parseInt(in.readLine());
                        dbHelper.findByType(pos);
                        break;
                    case 5:
                        menu.sortShow();
                        dbHelper.sortItemList();
                        break;
                    case 8:
                        exit = true;
                        break;
                    default:
                        System.out.println("Try again...");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }while (!exit);
    }
    }

