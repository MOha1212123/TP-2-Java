package TP2;

public class Banque {

		// TODO Auto-generated method stub
	   private String nom;
	   private CompteBancaire[] comptes;
	   private int nbActuels=0;
	   //2
	   public Banque(String nom, int capacite){
		   this.nom=nom; 
	        comptes = new CompteBancaire[capacite];
	        nbActuels = 0;
	   }
	
	   //3
	   public void ajouterCompte(CompteBancaire c){
		   if (nbActuels < comptes.length) {
	            comptes[nbActuels++] = c;
	        } else {
	            System.out.println("Banque pleine !");
	        }
	   }
	
	   public void afficherTous(){
		   for (int i = 0; i < nbActuels; i++) {
	            comptes[i].afficher();
				   System.out.println("-------------------------------");

	        } 
	   }
	   
	}


