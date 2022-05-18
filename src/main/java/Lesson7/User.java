package Lesson7;

import java.util.Locale;

public class User {
    private String name;
    private String surName;
    private int currentCash;
    public User(String name,String surName, int currentCash){
        setName(name);
        setSurName(surName);
        setCurrentCash(currentCash);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        boolean checker=true;
        String checked=name.toLowerCase(Locale.ROOT);
        while(checker){
            for(int i=0;i<checked.length();i++){
                    if(name.charAt(i)<97||name.charAt(i)>122){
                        System.out.println("incorrect character in name");
                        break;
                    }
            }
            checker=false;
        }
        this.name = name;

    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        boolean checker=true;
        String checked=surName.toLowerCase(Locale.ROOT);
        while(checker){
            for(int i=0;i<checked.length();i++){
                if(name.charAt(i)<97||name.charAt(i)>122){
                    System.out.println("incorrect character in Surname");
                    break;
                }
            }
            checker=false;
        }
        this.surName=surName;
    }

    public int getCurrentCash() {
        return currentCash;
    }

    public void setCurrentCash(int currentCash) {
        if(currentCash<0){
            currentCash=0;
        }
        this.currentCash = currentCash;
    }
    public void putMoney(int money){
        if(money<0){
           System.out.println("Incorrect data");
        }
        else{
            currentCash+=money;
            System.out.println("The amount was successfully added ");
        }
    }
    public void withdrawMoney(int money){
        if(money<0||money>currentCash){
            System.out.println("Incorrect action");
        }
        else {
            currentCash-=money;
        }
    }
    public void  transfer(int money, User user){
        if(money<0||money>this.currentCash){
            System.out.println("Incorrect action");
        }
        else{
            this.withdrawMoney(money);
            user.putMoney(money);
        }
    }

    @Override
    public String toString() {
        return " User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", currentCash=" + currentCash +
                '}';
    }
}
