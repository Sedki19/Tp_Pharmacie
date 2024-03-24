package tp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class DossierPharmacie {
    private String nom;
    private HashMap<String, Patient> patients;

    public DossierPharmacie(String n) {
        nom = n;
        patients = new HashMap<>();
    }

    void nouveauPatient(String nom, String[] ord) {
        if (!patients.containsKey(nom.toLowerCase())) {
            Patient patient = new Patient(nom);
            for (String medicament : ord) {
                patient.ajoutMedicament(medicament);
            }
            patients.put(nom.toLowerCase(), patient);
        }
    }

    public boolean ajoutMedicament(String nom, String m) {
        Patient patient = patients.get(nom.toLowerCase());
        if (patient != null) {
            patient.ajoutMedicament(m);
            return true;
        }
        return false;
    }

    public void affichePatient(String nom) {
        Patient patient = patients.get(nom.toLowerCase());
        if (patient != null) {
            patient.affiche();
        }
    }

    public void affiche() {
        System.out.println("Nom de la pharmacie : " + nom);
        for (Patient patient : patients.values()) {
            patient.affiche();
        }
    }

    public Collection<String> affichePatientAvecMedicament(String m) {
        List<String> patientsAvecMedicament = new ArrayList<>();
        for (Patient patient : patients.values()) {
            if (patient.contientMedicament(m)) {
                patientsAvecMedicament.add(patient.getNom());
            }
        }
        return patientsAvecMedicament;
    }
}