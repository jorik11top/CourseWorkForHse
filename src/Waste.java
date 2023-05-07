import java.time.LocalDate;

public class Waste {
    private int sum;
    private String name;
    private String type;
    private LocalDate date;

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
    public LocalDate getDate(){
        return date;
    }
    public void setName(String name){
        this.name = name;
    }
}
