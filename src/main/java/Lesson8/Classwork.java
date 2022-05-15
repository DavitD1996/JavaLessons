package Lesson8;

import java.util.Scanner;

public class Classwork {
    static Scanner data=new Scanner(System.in);
    static  String[]listOfPredators={"Lyon","Tiger"};
    static String[]listOfBirds={"Sparrow","Dove"};
    public static Zoo zooInstance=new Zoo("Candy");
    public static void main(String[] args) {
        System.out.println("Welcome to our zoo park");
        boolean switcher=true;
        while(switcher){
            System.out.println("Type 1 to add a new specie");
            System.out.println("Type 2 to feed all animals");
            System.out.println("Type 3 to see animals' speed");
            System.out.println("Type 4 to see all animals");
            System.out.println("Type 5 to understand is the animal hunter or not");
            System.out.println("Type anything else to leave this zoo");

            int checker=data.nextInt();
            switch(checker){
                case 1:
                    animalChoice();
                    break;
                case 2:
                    allZooEats(zooInstance);
                    break;
                case 3:
                    allZooMove(zooInstance);
                    break;
                case 4:
                    printAllAnimals(zooInstance.getZoo());
                    break;
                case 5:
                    huntInfo(zooInstance.getZoo());
                    break;
                default:
                    switcher=false;
                    break;
            }

        }

    }
    public static Animal createAnimal(String type,String meal){
        System.out.println("Type the age of the animal");
        int age=data.nextInt();
        System.out.println("Type the speed of the animal");
        int speed=data.nextInt();
        System.out.println("Type the groaning sound of the animal");
        String groan=data.next();
        if(type.equals("predator")){
            System.out.println("Type the average jumping area");
            int unique=data.nextInt();
            return new Predator(type,meal,age,speed,groan,unique);
        }
       else {
            System.out.println("Type the average flying height");
            int unique=data.nextInt();
           return new Birds(type,meal,age,speed,groan,unique);
        }
    }
    public static  void indexOfSpecies(String[]species){
        for(int i=0;i<species.length;i++){
            int j=i+1;
            System.out.println("The index of "+ species[i]+" is " +j);
        }
    }
    public static void createSpecie(int index, Animal animal){
       System.out.println("Choose the name of specie");
       String name= data.next();
        switch (index){
           //we could also choose the animal type by switch case instead if statement
            case 1:
               if(animal.getType().equals("predator")){
                   Lyon lyon=new Lyon((Predator)animal,name);
                   addInZoo(zooInstance,lyon);
               }
               else {
                   Sparrow sparrow=new Sparrow((Birds) animal,name);
                   addInZoo(zooInstance,sparrow);
               }
               break;
            case 2:
                if(animal.getType().equals("predator")){
                    Tiger tiger=new Tiger((Predator)animal,name);
                    addInZoo(zooInstance,tiger);
                }
                else {
                    Dove dove=new Dove((Birds) animal,name);
                    addInZoo(zooInstance,dove);
                }
                break;
    }

    }
    public static void animalChoice(){
        String type;
        String meal;
        System.out.println("Please Type 1 for predators and 2 for birds");
        int checker=data.nextInt();
        switch (checker){
            case 1:
                type="predator";
                meal="meat";
               Predator rootPredator= (Predator) createAnimal(type,meal);
               System.out.println("Choose the specie in predators' family");
               indexOfSpecies(listOfPredators);
                int specieIndex=data.nextInt();
                createSpecie(specieIndex,rootPredator);
                break;
            case 2:
                type="bird";
                meal="cereals";
              Birds rootBirds=(Birds) createAnimal(type,meal);
              System.out.println("Choose the specie in the birds' family");
                indexOfSpecies(listOfBirds);
                specieIndex=data.nextInt();
                createSpecie(specieIndex,rootBirds);
                break;
            default:
                System.out.println("Incorrect data");
                break;
        }
    }
    public static void addInZoo(Zoo zoo,Animal animal){
        for(int i=0;i<zoo.getZoo().length;i++){
            if(zoo.getZoo()[i]!=null){
                System.out.println(zoo.getZoo()[i].toString());
            }
            else{
                zoo.getZoo()[i]=animal;
                System.out.println("the new specie has been added");
                break;
            }
        }
    }
    public static void allZooEats(Zoo zoo){
        for(int i=0;i<zoo.getZoo().length;i++){
            if(zoo.getZoo()[i]!=null)
            zoo.getZoo()[i].feed();
        }
    }
    public static void allZooMove(Zoo zoo){
        for(int i=0;i<zoo.getZoo().length;i++){
            if(zoo.getZoo()[i]!=null)
            zoo.getZoo()[i].move();
        }
    }
    static void printAllAnimals(Animal[]animals){
        for(int i=0;i<animals.length;i++){
            if(animals[i]!=null)
            System.out.println(animals[i].toString());
        }

    }
    static void huntInfo(Animal[]animals){
        for(int i=0;i<animals.length;i++){
            if(animals[i]==null){
                break;
            }
            if(animals[i] instanceof Tiger){
                System.out.println("Type the speed of the alleged prey for "+((Tiger) animals[i]).getName());
                int temp=data.nextInt();
                ((Tiger) animals[i]).huntBegin(temp);
            }
            else if(animals[i] instanceof Sparrow){
                System.out.println("Type the age of powerful sparrow "+((Sparrow) animals[i]).getName());
                int temp=data.nextInt();
                ((Sparrow) animals[i]).huntBegin(temp);
            }
            else {
                System.out.println("this animal is not hunter");
            }
        }
    }
}
