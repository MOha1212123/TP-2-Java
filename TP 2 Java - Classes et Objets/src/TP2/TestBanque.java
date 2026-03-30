package TP2;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1 
		Banque b = new Banque("MarocBank", 1500);
         //2
         CompteBancaire c1 = new CompteBancaire("Yassine",1234, 500);
         CompteBancaire c2 = new CompteBancaire("Mohamed",1200, 500);
         CompteBancaire c3 = new CompteBancaire("Ahmed",1000, 500);
         //3
         b.ajouterCompte(c1);
         b.ajouterCompte(c2);
         b.ajouterCompte(c3);

         //4
        c1.deposer(1111);
        c1.retirer(200);
        c2.virmentvers(c3, 500);
        //5
        b.afficherTous();
        //6
        c2.calculerSoldeAvecInterets();
        c2.calculerSoldeAvecInterets(0.015);
        //7
        CompteBancaire.getNbComptes();
        CompteBancaire.getTauxinteret();
	}

}
