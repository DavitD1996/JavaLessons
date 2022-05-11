package Lesson6;

import Lesson5.Human;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
   static int count=0;
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        System.out.println("Welcome to our new app");
        User[]dataBase=new User[10];
        boolean closeTrigger=true;
        while(closeTrigger){
            System.out.println("Click 1 if you want to add User");
            System.out.println("Click 2 if you want to remove Use");
            System.out.println("Click 3 if you want to see all users");
            System.out.println("Click 4 if you want to close the app");
            int check=data.nextInt();
            switch (check){
                case 1:
                    System.out.println("Please type the name");
                    String name=data.next();
                    System.out.println("Please type the Surname");
                    String surName=data.next();
                    System.out.println("Please type the age");
                    int age=data.nextInt();
                    addUser(dataBase,name,surName,age);
                    break;
                case 2:
                    if(!isEmpty(dataBase)){
                        break;
                    }
                    printUsers(dataBase);
                    System.out.println("Select the index of user who you want to remove");
                    int removedIndex=data.nextInt();
                    removeUser(dataBase,removedIndex);
                    break;
                case 3:
                    if(!isEmpty(dataBase)){
                        break;
                    }
                    sortByName(dataBase);
                    printUsers(dataBase);
                    break;
                case 4:
                    closeTrigger=false;
                    break;
                default:
                    System.out.println("Sorry you typedincorrect number we close the program");
                    closeTrigger=false;
                    break;

            }
        }
    }
    public static  void addUser(User[] database, String name,String surName, int age){
        User user=new User(name,surName,age);
        for(int i=0;i<database.length;i++){
            if(database[i]==null){
                database[i]=user;
                break;
            }
        }
        count++;
    }
    public static void printUsers(User[] users){
        int index=1;
        for(int i=0;i<count;i++){
                System.out.println("the index of "+users[i].getName()+" is "+index);
                index++;
        }
    }
    public static void removeUser(User[] users,int index){
        index--;
        if(index>=users.length){
            System.out.println("incorrect index");
            return;
        }
        else {
            if(index==users.length-1){
                users[users.length-1]=null;
            }
            else {
                for(int i=index;i<users.length-1;i++){
                    users[i]=users[i+1];
                }
            }
            count--;
        }
    }
    public static User[]sortByName(User[]data){
        for(int i=0;i<count;i++){
            for(int j=0;j<count-i-1;j++){
                int index=0;
                while(data[j].getName().charAt(index)==data[j+1].getName().charAt(index)){
                    index++;
                }
                if(data[j].getSurName().charAt(index)>data[j+1].getName().charAt(index)){
                    User perm=data[j];
                    data[j]=data[j+1];
                    data[j+1]=perm;
                }
            }
        }
        return data;
    }
    public static boolean isEmpty(User[]users){
        if(users[0]==null){
            return  false;
        }
        return  true;
    }
}
