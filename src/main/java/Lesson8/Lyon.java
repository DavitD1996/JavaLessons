package Lesson8;

import javax.lang.model.element.Name;

public class Lyon extends Predator{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lyon(String type, String meal, int age, int motionSpeed, String groan, int jumpDistance, String name) {
        super(type, meal, age, motionSpeed, groan, jumpDistance);
        this.setName(name);
    }
    public Lyon(Predator predator, String name){
        super(predator.getType(), predator.getMeal(),predator.getAge(), predator.getMotionSpeed(), predator.getGroan(), predator.getJumpDistance());
        this.setName(name);

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
