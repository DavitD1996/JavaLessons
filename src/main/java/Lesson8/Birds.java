package Lesson8;

 public class Birds extends Animal{
    private int flyHeight;
    public int getFlyHeight() {
        return flyHeight;
    }

    public void setFlyHeight(int flyHeight) {
        this.flyHeight = flyHeight;
    }


    public Birds(String type, String meal, int age, int motionSpeed, String groan,int flyHeight) {
        super(type, meal, age, motionSpeed, groan);
        this.setFlyHeight(flyHeight);
    }
    @Override
    public void moveTpe() {
        System.out.println("Mainly I fly");
    }

     @Override
     public void inject() {
         System.out.println("some data");
     }
 }
