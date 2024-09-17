public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("lion","salim",3,true);
        Zoo myZoo = new Zoo(lion,"MY ZOOO","tunis",25);

            System.out.println(myZoo.animal.name);
            System.out.println(myZoo.animal.family);
            System.out.println(myZoo.animal.age);
            System.out.println(myZoo.animal.isMammal);
            System.out.println(myZoo.name);



    }
}
