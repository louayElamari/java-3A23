import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e)) {
            System.out.println("L'employé " + e.getNom() + " est déjà affecté à un département !");
        } else {
            affectations.put(e, d);
            System.out.println("Employé ajouté : " + e + " au département " + d);
        }
    }

    public void afficherEmployesEtDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation.");
        } else {
            Iterator<Map.Entry<Employe, Departement>> iterator = affectations.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Employe, Departement> entry = iterator.next();
                System.out.println("Employé : " + entry.getKey() + ", Département : " + entry.getValue());
            }

        }
    }

    public void supprimerEmploye(Employe e) {
        if (affectations.remove(e) != null) {
            System.out.println("Employé supprimé : " + e);
        } else {
            System.out.println("L'employé n'existe pas : " + e);
        }
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {

            affectations.remove(e,d);

    }

    public void afficherEmployes() {
        if (affectations.isEmpty()) {
            System.out.println("Aucun employé disponible.");
        } else {
            for (Employe e : affectations.keySet()) {
                System.out.println(e);
            }
        }
    }

    public void afficherDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucun département disponible.");
        } else {
            for (Departement d : affectations.values()) {
                System.out.println(d);
            }
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>((e1, e2) -> Integer.compare(e1.getId(), e2.getId())) {{
            putAll(affectations);
        }};
    }
}
