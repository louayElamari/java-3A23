import java.util.Scanner;

public class ZooManagement2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();


        System.out.print("Entrez le nombre de cages : ");
        int nbrCages = Integer.parseInt(scanner.nextLine());


        System.out.println(zooName + " comporte " + nbrCages + " cages.");
        scanner.close();
    }
}
