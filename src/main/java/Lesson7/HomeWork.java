package Lesson7;

public class HomeWork {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.addUser(new User("aram","aram",100));
        b.addUser(new User("armen","armen",200));
        b.transact();
        b.prinAccountsIndexes();
    }
}
