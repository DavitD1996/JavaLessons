package Lesson8;

public class Predator extends Animal{
    private int jumpDistance;
    public int getJumpDistance() {
        return jumpDistance;
    }

    public void setJumpDistance(int jumpDistance) {
        this.jumpDistance = jumpDistance;
    }

    public Predator(String type, String meal,int age,int motionSpeed,String groan,int jumpDistance) {
        super(type, meal,age,motionSpeed,groan);
        this.setJumpDistance(jumpDistance);
    }
    @Override
    public void moveTpe(){
    System.out.println("Mainly I run");
    }

    @Override
    public void inject() {

    }
}
