package tp;

public class test {
	public static void main(String[] args) {
        
        DossierPharmacie pharmacie = new DossierPharmacie("Mapharmacie");

  
        pharmacie.nouveauPatient("Ahmed", new String[]{"med1", "Med2"});
        pharmacie.nouveauPatient("Samir", new String[]{"med3", "med4"});
        pharmacie.nouveauPatient("Sawsen", new String[]{"med5", "med6"});

  
        pharmacie.affiche();

      
        pharmacie.ajoutMedicament("Mohamed", "med7");

     
        pharmacie.affiche();

       
        System.out.println("Patients ayant pris de med4 : " + pharmacie.affichePatientAvecMedicament("med4"));
    }
}
