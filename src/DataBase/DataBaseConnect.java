package DataBase;
import Users.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseConnect extends ConfigsDB {
    Connection DBConnect;

    public Connection getDBConnect() throws ClassNotFoundException, SQLException{
        String connectSting = "jdbc:mysql://" + DBHost + ":" + DBPort + "/" + DBName;
        DBConnect = DriverManager.getConnection(connectSting,DBUser,DBPassword);
        return DBConnect;
    }
    private boolean checkUser(User user) throws SQLException, ClassNotFoundException {
        String check = "SELECT * FROM" + ConstUsers.USER_TABLE + "WHERE" +
                "";
        PreparedStatement res = getDBConnect().prepareStatement(check);

    }
    public void signUpUser(User user) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO " + ConstUsers.USER_TABLE + "(" +
                ConstUsers.USERS_NAME +","+ ConstUsers.USERS_SURNAME +","+ ConstUsers.USERS_PATRONYMIC +","+ ConstUsers.USERS_BRITHDATE +","+ ConstUsers.USERS_GENDER
                +","+ ConstUsers.USERS_LOGIN +","+ ConstUsers.USERS_PASSWORD +","+ ConstUsers.USERS_EMAIL +")" +
                "VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement pST = getDBConnect().prepareStatement(insert);
        pST.setString(1,user.getName());
        pST.setString(2,user.getSurname());
        pST.setString(3,user.getPatronymic());
        pST.setString(4,user.getBrithDate().toString());
        pST.setString(5,user.getGender());
        pST.setString(6,user.getLogin());
        pST.setString(7,user.getPassword());
        pST.setString(8,user.getEmail());
        pST.executeUpdate();
    }


}
