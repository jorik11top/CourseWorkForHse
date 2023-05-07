package Users;

import java.time.LocalDate;

public class User {
    private String name;
    private String surname;
    private String patronymic;
    private String gender;
    private LocalDate brithDate;
    private String login;
    private String password;
    private String email;


    public User(String name, String surname, String patronymic, String gender, LocalDate brithDate, String login, String password, String email){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.brithDate = brithDate;
        this.login = login;
        this.password = password;
        this.email = email;
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
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getGender() {
        return gender;
    }
    public String getLogin() {
        return login;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBrithDate(LocalDate brithDate) {
        this.brithDate = brithDate;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
