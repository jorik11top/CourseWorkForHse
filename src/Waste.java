import java.time.LocalDate;

public class Waste {
    private final int sum;
    private final String name;
    private final String type;
    private final LocalDate date;

    public Waste(int sum, String name, String type){
        this.sum = sum;
        this.name = name;
        this.type = type;
        this.date = LocalDate.now();
    }

    public int getSum() {
        return sum;
    }

    public String getName(){
        return name;
    }

    public String getType() {
        return type;
    }
    public LocalDate date(){
        return date;
    }

}
