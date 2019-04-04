import java.util.ArrayList;
import java.util.Random;

public class MarketCreator {

    String[] stonesArray = {"Diamond", "Ruby", "Sapphire", "Emerald", "Amazonite",
            "Pietersite", "Amethyst", "Rubellite", "Hessonite", "Charoite"};

    ArrayList <StoneItem> stouncDB = new ArrayList<>();

    StoneItem stoneItem;
    private int tempPrice = 0;

    public MarketCreator() {
    }

    public String randStoneName(String[] stArray){
        Random random = new Random();
        int index = random.nextInt(stArray.length - 1);
        String stone = stonesArray[index];
        return stone;
    }

    public int randStoneMass(){
        Random random = new Random();
        int mass = random.nextInt(100) + 12;
        tempPrice = mass;
        return mass;
    }

    public int randStonePrice(){
        Random random = new Random();
        int price = random.nextInt(20000) + tempPrice/2;
        return price;
    }
}
