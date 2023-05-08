import DataBase.DataBaseConnect;
import Users.User;
import Users.Waste;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
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

        User user = new User("Жора","Чайкин","Максимович","Мужчина",day,"Jorik","1234","kakha-1979@mail.ru");
        connect.inputUser(user);
//        connect.signUpUser(user);



    }
}
