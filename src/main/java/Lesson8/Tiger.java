package Lesson8;

public class Tiger extends  Predator{
    private String name;
    public Tiger(String type, String meal, int age, int motionSpeed, String groan, int jumpDistance,String name) {
        super(type, meal, age, motionSpeed, groan, jumpDistance);
        this.setName(name);
    }
    public Tiger(Predator predator, String name){
        super(predator.getType(), predator.getMeal(),predator.getAge(), predator.getMotionSpeed(), predator.getGroan(), predator.getJumpDistance());
        this.setName(name);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return this.getName()+ " is" +this.getAge()+ " years old";
    }

    @Override
    public void feed() {
        System.out.println(this.getName()+" is eating "+this.getMeal());
    }
    @Override
    public void move() {
        System.out.println(this.getName()+" is moving by "+this.getMotionSpeed()+" speed");
    }

}
