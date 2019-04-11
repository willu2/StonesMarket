package stone.duf.com;

import java.util.Random;

public class StoneItem implements Comparable<StoneItem> {

    enum StoneType{
        PRECIOS,
        HALFPRECIOUS;

        public static StoneType getRandomType() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }
    enum StoneClarity{
        I, IF, SI, VS, VVS;
        public static StoneClarity getStoneClatityRandom() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }

    }
    private StoneClarity stoneClarity;
    private StoneType stoneType;
    private String stoneName;
    private int mass;
    private Integer price;

    public StoneItem() {
    }

    public StoneItem(String name, int mass, StoneType type, StoneClarity clatity, int price) {
        stoneName = name;
        this.mass = mass;
        this.stoneType = type;
        this.stoneClarity = clatity;
        this.price = price;
    }

    public String getStoneName() {
        return stoneName;
    }

    public StoneType getStoneType() {
        return stoneType;
    }

    public Integer getPrice() {
        return price;
    }

    public int getMass() {
        return mass;
    }

    public StoneClarity getClarity() {
        return stoneClarity;
    }


    @Override
    public String toString() {
        return "Stone [price=" + price + "]";
    }

    @Override
    public int compareTo(StoneItem o) {
        return this.getPrice().compareTo(o.getPrice());
    }

}
