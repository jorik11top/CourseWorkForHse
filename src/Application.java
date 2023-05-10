import DataBase.DataBaseConnect;
import Users.User;
import Users.Waste;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DataBaseConnect connect = new DataBaseConnect();
        Test();
    }
    public static void Test() throws SQLException, ClassNotFoundException {
        System.out.println("Test");
        DataBaseConnect connect = new DataBaseConnect();
        LocalDate day = LocalDate.of(2003,5,1);

        User user = new User();
        user.setLogin("Jorik");
        user.setPassword("1234");
        connect.inputUser(user);
        ArrayList<Waste> list = new ArrayList<>();
        connect.getWaste(user,list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() +" "+ list.get(i).getType() +" "+ list.get(i).getSum() + " " + list.get(i).getDate()  );
        }



    }
}
