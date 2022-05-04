package Lesson2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[]args) {
        String []countries ={" Armenia"," Russia"," Georgia"," Portugal"," Brazil"};
        int []prices={150,250,500,200,400};
        boolean repeatindicator=false;
        Scanner in=new Scanner(System.in);
        while (!repeatindicator){
            System.out.println("Please type the number of the chosen country");
            for(int i=0;i<countries.length;i++){
                System.out.println((i+1)+countries[i]);
            }
            int country=in.nextInt();
            if(country<=0||country>5) {
                System.out.println("Unfortunately we offer only those 5 countries");
            }
            else {
                System.out.println("Type your budget");
                int budget=in.nextInt();
                if(budget<prices[country-1]){
                    System.out.println("Your budget is not enough");
                }
                else {
                    System.out.println("We will organize your vacation");
                    repeatindicator=true;
                }
            }
        }

    }
}
