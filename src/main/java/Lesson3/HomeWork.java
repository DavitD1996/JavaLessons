package Lesson3;

public class HomeWork {
    public static void main(String[]args) {
        int count=-12;
        int result=0;
        //First method
        if(count<0) {
            for(int i=count;i<0;i+=2){
                System.out.println(i);
            }
        }
        else {
            for(int i=0;i<count;i+=2){
                System.out.println(i);
            }
        }

        //second method
        for(int j=count;j<0;j++){
            if(Math.abs(j)%2==0){
                System.out.println(j);
            }
        }

        //the second task first solution
        int []arrays={89,0,7,1,20,5};
        for(int i=0;i<arrays.length;i++){
            for(int j=0;j<arrays.length-1-i;j++){
                if(arrays[j]>arrays[j+1]){
                    int perm=arrays[j];
                    arrays[j+1]=arrays[j];
                    arrays[j]=perm;
                }
            }
        }
        System.out.println(arrays[arrays.length-1]);

        //The Second solution
        int compare=Integer.MIN_VALUE;
        for(int i=0;i<arrays.length;i++){
            compare=Math.max(arrays[i],compare);
        }
        System.out.println(compare);
    }
}
