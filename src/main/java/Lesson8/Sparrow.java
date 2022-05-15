package Lesson8;

public class Sparrow extends Birds{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Sparrow(String type, String meal, int age, int motionSpeed, String groan, int flyHeight,String name) {
        super(type, meal, age, motionSpeed, groan, flyHeight);
        this.setName(name);
    }
    public Sparrow(Birds bird, String name){
        super(bird.getType(),bird.getMeal(),bird.getAge(),bird.getMotionSpeed(),bird.getGroan(),bird.getFlyHeight());
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
