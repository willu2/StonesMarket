import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DBHelper {

    MarketCreator marketCreator ;
    List<StoneItem> stouncDB = new ArrayList<>();

    public DBHelper() {
        marketCreator = new MarketCreator();
        stouncDB = marketCreator.getStouncDB();
    }

    public void sortItemList(){
        Collections.sort(stouncDB);
        iterationPrint(stouncDB);
    }

    public void sortReverseItemList(){
        Collections.sort(stouncDB, Collections.reverseOrder());
        iterationPrint(stouncDB);
    }

    public void showAllData(){
        for (Iterator<StoneItem> it = stouncDB.iterator(); it.hasNext(); ) {
            StoneItem stoneItem = it.next();
            printItemList(stoneItem);
        }
    }

    public void findByClarity(int clnum){
        StoneItem.StoneClarity cl = clarityChecker(clnum);
        for (Iterator<StoneItem> it = stouncDB.iterator(); it.hasNext(); ) {
            StoneItem stoneItem = it.next();
                if(cl == stoneItem.getClarity()){
                    printItemList(stoneItem);
                }
        }
    }

    public void findByType(int clnum){
        StoneItem.StoneType cl = typeChecker(clnum);
        for (Iterator<StoneItem> it = stouncDB.iterator(); it.hasNext(); ) {
            StoneItem stoneItem = it.next();
                if(cl == stoneItem.getStoneType()){
                    printItemList(stoneItem);
                }
        }
    }

    public void findByPriceBucket(int clnum){
        for (Iterator<StoneItem> it = stouncDB.iterator(); it.hasNext(); ) {
            StoneItem stoneItem = it.next();
                if(clnum >= stoneItem.getPrice()){
                    printItemList(stoneItem);
                    clnum -= stoneItem.getPrice();
                }
        }
    }

    private void printItemList(StoneItem stoneItem){
        System.out.print("Stone name:  > " + stoneItem.getStoneName());
        System.out.print(" ||_Mass:  > " + stoneItem.getMass());
        System.out.print(" ||_Clarity: > " + stoneItem.getClarity());
        System.out.print(" ||_type: > " + stoneItem.getStoneType());
        System.out.print(" ||_price: > " + stoneItem.getPrice() + " $");
        System.out.println();
    }

    public void iterationPrint(List<StoneItem> stouncDB){
        for (Iterator<StoneItem> it = stouncDB.iterator(); it.hasNext(); ) {
            StoneItem stoneItem = it.next();
            printItemList(stoneItem);
        }
    }

    public  StoneItem.StoneClarity clarityChecker(int pos){
        StoneItem.StoneClarity cl = StoneItem.StoneClarity.I;
        try {
            switch (pos) {
                case 1:
                    cl = StoneItem.StoneClarity.I;
                    break;
                case 2:
                    cl = StoneItem.StoneClarity.IF;
                    break;
                case 3:
                    cl = StoneItem.StoneClarity.SI;
                    break;
                case 4:
                    cl = StoneItem.StoneClarity.VS;
                    break;
                case 5:
                    cl = StoneItem.StoneClarity.VVS;
                    break;
                default:
                    System.out.println("Try again...");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cl;
    }

    public  StoneItem.StoneType typeChecker(int pos){
        StoneItem.StoneType cl = StoneItem.StoneType.PRECIOS;
        try {
            switch (pos) {
                case 1:
                    cl = StoneItem.StoneType.PRECIOS;
                    break;
                case 2:
                    cl = StoneItem.StoneType.HALFPRECIOUS;
                    break;
                default:
                    System.out.println("Try again...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cl;
    }
}
