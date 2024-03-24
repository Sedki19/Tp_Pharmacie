package tp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class Patient {
    private String nom;
    private Set<String> ordonnance;

    public Patient(String n) {
        nom = n.toLowerCase();
        ordonnance = new HashSet<>();
    }

    public String getNom() {
        return nom;
    }

    public boolean ordonnanceVide() {
        return ordonnance.isEmpty();
    }

    public void ajoutMedicament(String m) {
        ordonnance.add(m);
    }

    public void affiche() {
        System.out.println("Nom du patient : " + nom);
        System.out.println("Ordonnance : " + ordonnance.toString());
    }

    public boolean contientMedicament(String m) {
        return ordonnance.contains(m);
    }

    public void trieOrdonnace() {
        List<String> sortedList = new ArrayList<>(ordonnance);
        Collections.sort(sortedList);
        ordonnance = new LinkedHashSet<>(sortedList);
    }
}
