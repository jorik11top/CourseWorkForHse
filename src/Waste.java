public class Waste {
    private final int sum;
    private final String name;
    private final String type;

    public Waste(int sum,String name,String type){
        this.sum = sum;
        this.name = name;
        this.type = type;
    }

    public int getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
