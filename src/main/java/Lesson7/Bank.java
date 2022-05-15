package Lesson7;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Bank {
    private User [] accounts;
    public Scanner data=new Scanner(System.in);
    private int count=0;
    public User[] getAccounts() {
        return accounts;
    }
    public void setAccounts(User[] accounts) {
        this.accounts = accounts;
    }
    public Bank(){
        System.out.println("You have created a bank with 10 customers");
        setAccounts(new User[10]);
    }
    public Bank(User[]accounts){
        setAccounts(accounts);
    }
    public void prinAccountsIndexes() {
       for(int i=0;i<count;i++){
           int j=i+1;
           System.out.println("The customer under index "+j+accounts[i].toString());
    }
    }
    public void removeUser() {
       System.out.println("Choose the User index");
        prinAccountsIndexes();
       int index=data.nextInt();
        if(index-1<0||index-1>=accounts.length){
            System.out.println("Incorrect index");
            return;
        }
        else if(index==accounts.length){
            accounts[accounts.length-1]=null;
        }
        for(int i=index;i<accounts.length-1;i++){
            accounts[i]=accounts[i+1];
        }
        count--;
    }
    public void addUser(User user){
        if(count>=accounts.length){
            User[]longAccounts=new User[accounts.length*2];
            System.arraycopy(accounts,0,longAccounts,0,accounts.length);
            accounts=longAccounts;
        }
        accounts[count]=user;
        count++;
    }
    public  void putMoney(){
        System.out.println("Choose the User index");
        prinAccountsIndexes();
        int index=data.nextInt();
        System.out.println("Choose the amount of money");
        int money=data.nextInt();
        if(index>count||index<=0){
            System.out.println("The user does not exist");
        }
        else {
            accounts[index-1].putMoney(money);
        }
    }
    public  void withDraw(){
        System.out.println("Choose the User index");
        prinAccountsIndexes();
        int index=data.nextInt();
        System.out.println("Choose the amount of money");
        int money=data.nextInt();
        if(index>count||index<=0){
            System.out.println("The user does not exist");
        }
        else {
            accounts[index-1].withdrawMoney(money);
        }
    }
    public void transact(){
        System.out.println("Choose the User who transfer the money");
        prinAccountsIndexes();
        int index=data.nextInt();
        if(index>count||index<=0){
            System.out.println("The user does not exist");
            return;
        }
        System.out.println("Choose the user who will receive");
        int index2=data.nextInt();
        if(index2>count||index2<=0){
            System.out.println("The user does not exist");
            return;
        }
        System.out.println("Type the transferring amount of money");
        int money=data.nextInt();
        accounts[index-1].transfer(money,accounts[index2-1]);
    }
}

