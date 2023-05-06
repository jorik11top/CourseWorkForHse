import DataBase.DataBaseConnect;
import Users.User;
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

        User user = new User("Жора","Чайкин","Максимович","Мужчина",day,"J35forik","1234","13fkakha-1979@mail.ru");
        connect.signUpUser(user);
//        Scanner in = new Scanner(System.in);
//        System.out.println("Name");
//        String Name = in.nextLine();
//        System.out.println("SurName");
//        String SurName = in.nextLine();
//        System.out.println("Patronymic");
//        String Patronymic = in.nextLine();
//        System.out.println("Men 1 Woman 2");
//        int GenderVar = in.nextInt();
//        String Gender;
//        if (GenderVar == 1){
//            Gender = "Мужчина";
//        }
//        else {
//            Gender = "Женщина";
//        }
//        System.out.println("Name");
//        String Name = in.nextLine();
//        System.out.println("Name");
//        String Name = in.nextLine();
//        System.out.println("Name");
//        String Name = in.nextLine();


    }
}
