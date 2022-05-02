package Lesson5;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Classwork {
    public static void main(String[]args) {
        String name;
        String lastName;
        int age;
        String gender;
        Scanner indata=new Scanner(System.in);
        name=indata.next();
        lastName=indata.next();
        age=indata.nextInt();
        gender=indata.next();
        Human a=new Human(name,lastName,gender,age);

    }
    public static Human[] sortByAge(Human[]data){
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length-1-i;j++){
                if(data[j].age>data[j+1].age){
                    Human perm=data[j];
                    data[j]=data[j+1];
                    data[j+1]=perm;
                }
            }
        }
        return data;
    }
    public  static Human[]sortByName(Human[]data){
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length-1-i;j++){
                int index=0;
                while(data[j].name.charAt(index)==data[j+1].name.charAt(index)){
                    index++;
                }
                if(data[j].name.charAt(index)>data[j+1].name.charAt(index)){
                    Human perm=data[j];
                    data[j]=data[j+1];
                    data[j+1]=perm;
                }
            }
        }
        return data;
    }
    public static void printNames(Human[]data){
        for(int i =0;i<data.length;i++){
            System.out.printf("%s %s is %d years old and %s",data[i].name,data[i].surname,data[i].age,data[i].gender);
            System.out.println();
        }
    }
}
