package se.lexicon;

public class SuperHero implements Comparable<SuperHero>{
    //3. Create a new class and call it SuperHero. Add fields for Id,Name and Age + getters and
    //setters. Have the class implement the Comparable interface. Implement the override method
    //and have it compare the AGE of the superhero. Next, create a new arrayList of type
    //SuperHero. Sort the list by age and print out each element.

    private int Id;
    private String Name;
    private int age;

    //Constructor

    public SuperHero(int id, String name, int age) {
        Id = id;
        Name = name;
        this.age = age;
    }

    //Getters & Setters


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(SuperHero superHero){
        if (age == superHero.age){
            return 0;
        } else if (age> superHero.age) {
            return 1;
        }else {
            return -1;
        }
    }
}

