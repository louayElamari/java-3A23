import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Emplyee> {
    private ArrayList<Emplyee> listeEmployes;


    public SocieteArrayList() {
        listeEmployes = new ArrayList<>();
    }


    @Override
    public void ajouterEmploye(Emplyee employe) {
        listeEmployes.add(employe);
    }


    @Override
    public boolean rechercherEmploye(String nom) {
        for (Emplyee employe : listeEmployes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean rechercherEmploye(Emplyee employe) {
        return listeEmployes.contains(employe);
    }


    @Override
    public void supprimerEmploye(Emplyee employe) {
        listeEmployes.remove(employe);
    }


    @Override
    public void displayEmploye() {
        for (Emplyee employe : listeEmployes) {
            System.out.println(employe);
        }
    }


    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes, Comparator.comparingInt(Emplyee::getId));
    }


    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(listeEmployes, new Comparator<Emplyee>() {
            @Override
            public int compare(Emplyee e1, Emplyee e2) {
                int compareNom = e1.getNom().compareTo(e2.getNom());
                if (compareNom != 0) return compareNom;

                int compareDepartement = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (compareDepartement != 0) return compareDepartement;

                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
    }
}
