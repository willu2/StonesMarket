package stone.duf.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuBuild {

    public void mainManu(){
        System.out.println("Menu :> ");
        System.out.println(" 1 :> Show all stotes ");
        System.out.println(" 2 :> Show by clarity  >>> ");
        System.out.println(" 3 :> Show by price >>> ");
        System.out.println(" 4 :> Show hierarchy >>> ");
        System.out.println(" 5 :> Sort by price >>> ");
        System.out.println(" 8 :> Exit ");

        System.out.println("Enter position :> ");
    }

    public void clarityShow(){
        System.out.println("Enter clarity: ");
        System.out.print(" 1 :> I |*|");
        System.out.print(" 2 :> IF |*|");
        System.out.print(" 3 :> SI |*|");
        System.out.print(" 4 :> VS |*|");
        System.out.println(" 5 :> VVS ");
    }

    public void typeShow(){
        System.out.println("Enter value: ");
        System.out.print(" 1 :> PRECIOS |*|");
        System.out.println(" 2 :> HALFPRECIOUS |*|");
    }

    public void sortShow(){
        System.out.println("Sort by price:");
    }

    public int menuTotalPriceEnter(){
        int visitorPrice = 0;

        try {
            while (visitorPrice <= 0 ){
                System.out.println("Enter your money count (int number) ? : ");
                try {
                    BufferedReader inPrice = new BufferedReader(new InputStreamReader(System.in));
                    visitorPrice = Integer.parseInt(inPrice.readLine());
                }catch (NumberFormatException c){}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return visitorPrice;
    }
}
