package Lesson7;

import java.util.Scanner;

public class HomeWork {
    static BankChange[]banks={new BankChange("HSBC",new User[10]),new BankChange("VTB",new User[10]),new BankChange("ABB",new User[10])};
    static Scanner data=new Scanner(System.in);
    public static void main(String[] args) {
        boolean switcher=true;
        while(switcher){
            logMenu();
            int chooser=data.nextInt();
            switch (chooser){
                case 1:
                    addUser();
                    break;
                case 2:
                    removerUser();
                    break;
                case 3:
                    System.out.println("type the money amount which will be put");
                    int amount=data.nextInt();
                    putMoney(amount);
                    break;
                case 4:
                    System.out.println("type the amount which will be withdrawn");
                    amount=data.nextInt();
                    getMoney(amount);
                    break;
                case 5:
                    System.out.println("type the amount which you will transfer");
                    amount=data.nextInt();
                   transferMoney(amount);
                    break;
                case 6:
                    printAllUsers();
                    break;
                default:
                    switcher=false;
                    break;
            }
        }

    }

    private static void removerUser() {
       printBanks();
        System.out.println("Choose the bank");
        int bank=data.nextInt();
        BankChange intance= getBank(bank);
       if(intance!=null){
          System.out.println("choose the user");
           printUserNames(intance);
           int user= data.nextInt();
           intance.getAccounts()[user-1]=null;
           System.out.println("The user was removed");
       }
       else{
           System.out.println("The bank with this number does not exist");
           return;
       }
    }

    private static void logMenu() {
        System.out.println("Type 1 if you want to add User");
        System.out.println("Type 2 if you want to remove User");
        System.out.println("Type 3 if you want to cash-in");
        System.out.println("Type 4 if you want to cash-out");
        System.out.println("Type 5 if you want to transfer money");
        System.out.println("Type 6 if you want to print all users");
        System.out.println("Type anything else to exit");
    }
    static  void addUser(){
        printBanks();
        System.out.println("Choose the bank");
        int bank=data.nextInt();
       BankChange intance= getBank(bank);
       if(intance!=null){
              User user=getuser();
              for(int i=0;i<intance.getAccounts().length;i++){
                  if(intance.getAccounts()[i]==null){
                      intance.getAccounts()[i]=user;
                      System.out.println("The user was successfully added");
                      break;
                  }
              }
       }
       else{
           System.out.println("The bank with this number does not exist");
           return;
       }
    }
    static  void printBanks(){
        for(int i =0;i<banks.length;i++){
            System.out.println("the index of "+banks[i].toString()+" "+ (i+1));
        }
    }
    static  BankChange getBank(int id){
        if(id>banks.length){
            System.out.println("the bank with this code does not exist");
            return null;
        }
        else{
            return banks[id-1];
        }
    }
    static User getuser(){
        System.out.println("Type the user's name");
        String name=data.next();
        System.out.println("Type the user's surname");
        String surName=data.next();
        System.out.println("type the initial sum");
        int sum=data.nextInt();
        return new User(name,surName,sum);
    }
    static void printUserNames(BankChange b){
        for(int i=0;i<b.getAccounts().length;i++){
            if(b.getAccounts()[i]!=null){
                System.out.println(b.getAccounts()[i].getName()+" is"+(i+1));
            }
        }
    }
    static void putMoney(int amount){
        printBanks();
        System.out.println("Choose the bank");
        int bank=data.nextInt();
        BankChange intance= getBank(bank);
        if(intance!=null){
            System.out.println("choose the user");
            printUserNames(intance);
            int user= data.nextInt();
            intance.getAccounts()[user-1].putMoney(amount);
          }
        else{
            System.out.println("The bank with this number does not exist");
            return;
        }
    }
    static  void getMoney(int amount){
        printBanks();
        System.out.println("Choose the bank");
        int bank=data.nextInt();
        BankChange intance= getBank(bank);
        if(intance!=null){
            System.out.println("choose the user");
            printUserNames(intance);
            int user= data.nextInt();
            intance.getAccounts()[user-1].withdrawMoney(amount);
        }
        else{
            System.out.println("The bank with this number does not exist");
            return;
        }
    }
    static  void printAllUsers(){
        for(int i=0;i<banks.length;i++){
            for(int j=0;j<banks[i].getAccounts().length;j++){
                if(banks[i].getAccounts()[j]!=null){
                    System.out.println(banks[i].getAccounts()[j].getName()+" has "+banks[i].getAccounts()[j].getCurrentCash()+" dollars "+" in "+banks[i].getName());
                }
            }
        }
    }
    static void transferMoney(int amount){
        printBanks();
        System.out.println("Choose the bank of sender");
        int bank=data.nextInt();
        BankChange intanceOfSender = getBank(bank);
        if(intanceOfSender !=null){
            System.out.println("choose the user who is transferring");
            printUserNames(intanceOfSender);
            int user= data.nextInt();
            intanceOfSender.getAccounts()[user-1].withdrawMoney(amount);
        }
        printBanks();
        System.out.println("Choose the bank of recipient");
        bank=data.nextInt();
        BankChange intanceOfRecipient = getBank(bank);
        if(intanceOfRecipient !=null){
            System.out.println("choose the user who is transferring");
            printUserNames(intanceOfRecipient);
            int user= data.nextInt();
            intanceOfRecipient.getAccounts()[user-1].putMoney(amount);
        }
    }
}
