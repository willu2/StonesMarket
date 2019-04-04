import java.util.ArrayList;
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
            //printItemList(color);
            System.out.println(stoneItem.getStoneName());
            System.out.println(stoneItem.getMass());
            System.out.println(stoneItem.getClarity());
            System.out.println(stoneItem.getStoneType());
            System.out.println(stoneItem.getPrice());
            System.out.println("<<<------------------------------>>>");


      //  StoneItem item = new StoneItem();
        }
    }
}
