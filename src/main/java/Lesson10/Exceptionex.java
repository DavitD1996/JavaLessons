package Lesson10;

public class Exceptionex extends  Exception{
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
    public Exceptionex(String message){
        this.setMessage(message);
    }
}
