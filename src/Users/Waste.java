package Users;

import java.sql.Date;
import java.time.LocalDate;

public class Waste {
    private int sum;
    private String name;
    private String type;
    private Date date;


    public Waste(int sum, String name, String type,Date date){
        this.sum = sum;
        this.name = name;
        this.type = type;
        this.date = date;
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
    public void setName(String name){
        this.name = name;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Date getDate() {
        return date;
    }

    public void setType(String type) {
        this.type = type;
    }

}
