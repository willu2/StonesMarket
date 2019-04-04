import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DBHelper {

    MarketCreator marketCreator ;
    List<StoneItem> stouncDB = new ArrayList<>();

    public DBHelper() {
        marketCreator = new MarketCreator();
       // stouncDB = new ArrayList<>();
        stouncDB = marketCreator.getStouncDB();
    }

    public void showAllData(){
        for (Iterator<StoneItem> it = stouncDB.iterator(); it.hasNext(); ) {
            StoneItem stoneItem = it.next();
            printItemList(stoneItem);
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

    public void sortItemList(){
        Collections.sort(stouncDB);

        for (Iterator<StoneItem> it = stouncDB.iterator(); it.hasNext(); ) {
            StoneItem stoneItem = it.next();
            printItemList(stoneItem);
        }
    }

    public void sortReverseItemList(){
        Collections.sort(stouncDB, Collections.reverseOrder());

        for (Iterator<StoneItem> it = stouncDB.iterator(); it.hasNext(); ) {
            StoneItem stoneItem = it.next();
            printItemList(stoneItem);
        }
    }
}
