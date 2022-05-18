package Lesson7;

public class BankChange {
    private String name;
    private User [] accounts;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User[] getAccounts() {
        return accounts;
    }

    public void setAccounts(User[] accounts) {
        accounts = accounts;
    }
    public BankChange(String name,User[]users){
        this.setName(name);
       this.accounts=users;
    }

    @Override
    public String toString() {
       return  this.getName();
    }
}
