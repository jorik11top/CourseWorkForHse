package Users;

import java.time.LocalDate;

public class User {
    private final String name;
    private final String surname;
    private final String patronymic;
    private final String gender;
    private final LocalDate brithDate;
    private final String login;
    private final String password;
    private static int id;

    public User(String name, String surname, String patronymic, String gender, LocalDate brithDate, String login, String password){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.brithDate = brithDate;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBrithDate() {
        return brithDate;
    }

    public String getPatronymic() {
        return patronymic;
    }
}
