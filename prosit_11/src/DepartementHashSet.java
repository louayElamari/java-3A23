import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement d) {
        if (departements.add(d)) {
            System.out.println("bien  ajouté : " + d);
        } else {
            System.out.println("Le département existe déjà : " + d);
        }
    }

    @Override

    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        if (departements.remove(d)) {
            System.out.println("Département supprimé : " + d);
        } else {
            System.out.println("erreur : " + d);
        }
    }

    @Override
    public void displayDepartement() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département disponible.");
        } else {
            for (Departement d : departements) {
                System.out.println(d.toString());
            }
        }
    }


    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sorted = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        sorted.addAll(departements);
        return sorted;
    }
}
