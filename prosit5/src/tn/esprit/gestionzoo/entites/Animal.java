package tn.esprit.gestionzoo.entites;

public class Animal {
    public String family;
    public String  name;
    public int age;
    public boolean isMammal;
    public Animal() {}

    public Animal(String name, int age, boolean isMammal) {
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;

    }


    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getName() { return name;    }
    public void setName(String name) {if (name != null && !name.trim().isEmpty()) {this.name = name;
    } else {throw new IllegalArgumentException("Animal name cannot be empty.");}
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {if (age >= 0) {this.age = age;
    } else {throw new IllegalArgumentException("Age cannot be negative.");}
    }
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }


    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;

    }
    @Override
    public String toString() {
        return family + " " + name + " " + age + " " + isMammal;
    }
}
