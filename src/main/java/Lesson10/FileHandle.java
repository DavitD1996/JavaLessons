package Lesson10;

import java.io.FileReader;
import java.io.FileWriter;

public class FileHandle {
    public static void writeInFile(User[]users){
        try(FileWriter file=new FileWriter("C:\\Users\\windowstest\\Desktop\\text.txt",false)){
            for(int i=0;i<users.length;i++){
                if(users[i]!=null){
                    file.write("/"+users[i].getUsername()+"/");
                    file.write(System.getProperty( "line.separator" ));
                    file.write("*"+users[i].getUsername()+"*");
                    file.write(System.getProperty( "line.separator" ));
                    for(int j=0;j<users[i].getPosts().length;j++){
                        if(users[i].getPosts()[j]!=null){
                            file.write(users[i].getPosts()[j]+",");
                            file.write(System.getProperty( "line.separator" ));
                        }
                    }
                    file.write("//");
                    file.write(System.getProperty( "line.separator" ));
                }
                else{
                    return;
                }
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static String readFromFile(){
        String data="";
        try(FileReader file=new FileReader("C:\\Users\\windowstest\\Desktop\\text.txt")){
            int c;
            while((c=file.read())!=-1){
                data+=(char)c;
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return data;
    }
    public  static String[] convertFromStringToUser(String data){
        User[] users = new User[10];
        if(data!=null) {
            String[] preResult = data.split("//");
            for (int i = 0; i < preResult.length; i++) {
                if(preResult[i]!=null){
                    String name=preResult[i].substring(preResult[i].indexOf('/')+1,preResult[i].lastIndexOf('/'));
                    String password=preResult[i].substring(preResult[i].indexOf('*')+1,preResult[i].lastIndexOf('*'));
                    String commentText=preResult[i].substring(preResult[i].lastIndexOf('*'),preResult[i].indexOf("//"));
                    String[]comments=commentText.split(",");
                    users[i]=new User(name,password);
                    users[i].setPosts(comments);
                }

            }
        }
        return null;
    }
}
