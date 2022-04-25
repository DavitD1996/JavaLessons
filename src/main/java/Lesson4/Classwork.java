package Lesson4;

public class Classwork {
    public static void main(String[]args) {
       int [] array={1,200,45};
        int res=highestInArray(array);
        System.out.println(res);
    }
   static int highestInArray(int[]array){
      int result=array[0];
        for(int i=1;i<array.length;i++)
            if(result<array[i]){
                result=array[i];
        }
        return  result;
   }
}
