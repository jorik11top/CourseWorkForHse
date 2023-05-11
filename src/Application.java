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
        User us = new User("Жора","Чайкин","Максимович","Мужчина",LocalDate.of(2003,5,1),"jorik","1234","kakha-1979@mail.ru");
        connect.addUser(us);
        User user = new User();
        user.setLogin("Jorik");
        user.setPassword("1234");
        connect.inputUser(user);
        ArrayList<String> list = connect.selectType();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        connect.addWaste(user,new Waste(5000,"кроссовки adidas", list.get(5)));
        ArrayList<Waste> list1 = new ArrayList<>();
        connect.getWasteAll(user,list1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).getName() +" "+ list1.get(i).getType() +" "+ list1.get(i).getSum()+" "+ list1.get(i).getDate().toLocalDateTime());
        }



    }
}
