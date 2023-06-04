package models;
//*Класс-модель User*/
public class User {
    private Role role;
    private String name;
    
    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    private int balance;
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private byte films;

    public byte getFilms() {
        return films;
    }

    public void setFilms(byte films) {
        this.films = films;
    }
//*Конструктор класса, собирает имя, роль, баланс, фильмы*/
    public User(String name, Role role, int balance, byte films) {
        this.name = name;
        this.role = role;
        this.balance = balance;
        this.films = films;
    }

    
}
