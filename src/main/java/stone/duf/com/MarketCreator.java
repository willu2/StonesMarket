package stone.duf.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MarketCreator {

   private String[] stonesArray = {"Diamond", "Ruby", "Sapphire", "Emerald", "Amazonite",
            "Pietersite", "Amethyst", "Rubellite", "Hessonite", "Charoite"};

    public List<StoneItem> getStouncDB() {
        return stouncDB;
    }

    private List<StoneItem> stouncDB = new ArrayList<>();
    private StoneItem stoneItem;

    private int tempPrice = 0;

    public MarketCreator() {
        pushdataToDB();
    }

    private String randStoneName(String[] stArray){
        Random random = new Random();
        int index = random.nextInt(stArray.length - 1);
        String stone = stonesArray[index];
        return stone;
    }

    private int randStoneMass(){
        Random random = new Random();
        int mass = random.nextInt(100) + 12;
        tempPrice = mass;
        return mass;
    }

    private int randStonePrice(){
        Random random = new Random();
        int price = random.nextInt(20000) + tempPrice/2;
        return price;
    }

    private StoneItem createItemPositin(){
        String stoneName = randStoneName(stonesArray);
        int mass = randStoneMass();
        StoneItem.StoneType stoneType = StoneItem.StoneType.getRandomType();
        StoneItem.StoneClarity clarity = StoneItem.StoneClarity.getStoneClatityRandom();
        int price = randStonePrice();

       return stoneItem = new StoneItem(stoneName, mass, stoneType, clarity, price);
    }

    private void pushdataToDB(){
        for (int i = 0; i < 50; i++ ){
            stouncDB.add(createItemPositin());
        }
    }
}
