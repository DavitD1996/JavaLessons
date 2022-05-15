package Lesson8;

public class Zoo {
    private Animal[]zoo;
    private String name;
    public Animal[] getZoo() {
        return zoo;
    }

    public void setZoo(Animal[] zoo) {
        this.zoo = zoo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Zoo(String name){
        this.setName(name);
        this.setZoo(new Animal[10]);
    }
    public Zoo(String name,Animal[]zoo){
        this.setName(name);
        this.setZoo(new Animal[10]);
    }
}
