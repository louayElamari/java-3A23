public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("lion","lion 1",7,true);
        Zoo myZoo = new Zoo("frigia","tunis",25);
        myZoo.animals[0]=lion;
        System.out.println(myZoo.name);
        System.out.println(myZoo.city);
        System.out.println(myZoo.nbrCages);

        System.out.println(lion.toString());





    }
}
