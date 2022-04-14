package Lesson2;

import java.lang.invoke.SwitchPoint;

public class Base {
    public static void main(String[]args) {
       /* int a=12;
        int b=5;
        int[]ages=new int[4];
        int[]ages2={12,3,7,3};*/
        int userage=15;
        if(userage<18){
            System.out.println("forbidden");
        }
        else if(userage==18){
            System.out.println("only beer");
        }
        else{
            System.out.println("welcome");
        }
    }
}
