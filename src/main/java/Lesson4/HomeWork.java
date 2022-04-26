package Lesson4;

public class HomeWork {
    public static void main(String[]args) {
       printUpperCases("stRIng");
       int[][]arg={{1,45,6},{3,2,56},{2,56,5}};
       System.out.println(sumOfOddNumbers(arg));
    }
    public static void printUpperCases(String data){
        data=data.trim();
        char[] letters=data.toCharArray();
        String result="";
        for(int i=0;i<letters.length;i++){
            if((int) letters[i]>=97&&(int) letters[i]<=122){
                letters[i]= (char) (letters[i]-32);
            }
            result+=letters[i];
        }
        System.out.println(result);
    }
    public static int sumOfOddNumbers(int [][] matrix){
        int result=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]%2!=0){
                    result+=matrix[i][j];
                }
            }
        }
        return result;
    }
}
