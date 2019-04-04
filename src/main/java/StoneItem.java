import java.util.Random;

public class StoneItem {

    enum StoneType{
        PRECIOS,
        HALFPRECIOUS;
        //public void setStoneType(StoneType type){stoneType = type;        }
        public static StoneType getRandomType() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }
    enum StoneClatity{
        I, IF, SI, VS, VVS;

        public static StoneClatity getStoneClatityRandom() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    private StoneType stoneType;
    private String stoneName;
    private int mass;
    private int clarity;
    private int price;

    public StoneItem(String name, int mass, int transparency, int price) {
        stoneName = name;
        this.mass = mass;
        this.clarity = transparency;
        this.price = price;
    }

    public String getStoneName() {
        return stoneName;
    }

    public void setStoneName(String stoneName) {
        this.stoneName = stoneName;
    }

    public StoneType getStoneType() {
        return stoneType;
    }

    public void setStoneType(StoneType stoneType) {
        this.stoneType = stoneType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getClarity() {
        return clarity;
    }

    public void setClarity(int clarity) {
        this.clarity = clarity;
    }
}
