package Lesson8;

public abstract class Animal {
    private String type;
    private String meal;
    private int age;
    private int motionSpeed;
    private String groan;
    public String getGroan() {
        return groan;
    }

    public void setGroan(String groan) {
        this.groan = groan;
    }


    public int getMotionSpeed() {
        return motionSpeed;
    }

    public void setMotionSpeed(int motionSpeed) {
        this.motionSpeed = motionSpeed;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Animal(String type,String meal, int age,int motionSpeed,String groan){
        this.setType(type);
        this.setMeal(meal);
        this.setAge(age);
        this.setMotionSpeed(motionSpeed);
        this.setGroan(groan);
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public void feed(){
       System.out.println(this.getType()+" is eating "+this.getMeal());
    }
    public void move(){
        System.out.println(this.getType()+" is moving by "+this.getMotionSpeed()+" speed");
    }
    public void groan(){
        System.out.println(this.getGroan());
    }

    public abstract void moveTpe();
}
