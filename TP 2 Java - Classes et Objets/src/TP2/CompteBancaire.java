package TP2;

public class CompteBancaire {

		// TODO Auto-generated method stub
		
		private int numero;
		private String titulaire;
		private double solde;
		private double decouvertAutorise;
		
		private static  int nbComptes=0;
	    private static  double tauxinteret=0.03;
	    //4
	    public CompteBancaire(){
	    	this.numero=++nbComptes;
	    	this.titulaire="Nom";
	    	this.solde=0;
	    	this.decouvertAutorise=0;
	    }
	    //5
	    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
	    	this.numero=++nbComptes;
	    	this.titulaire=titulaire;
	    	this.solde=solde;
	    	this.decouvertAutorise=decouvertAutorise;
	    }
	    //6
	    public String getTitulaire() {
	    	return titulaire;
	    }
	    
	    public void setTitulaire(String titulaire) {
	    	if (titulaire != null && !titulaire.isEmpty()) {
	            this.titulaire = titulaire;
	        }
	    }
	    
	    public double getDecouvertAutorise() {
	    	return decouvertAutorise;
	    }
	    
	    
	    public void setdecouvertAutorise(double decouvertAutorise) {
	    	this.decouvertAutorise=decouvertAutorise;
	    }
	
	    //7
	    public void afficher() {
	    	System.out.println("numero: "+ numero);
	    	System.out.println("titulaire: "+ titulaire);
	    	System.out.println("solde: "+ solde);
	    	System.out.println("decouvertAutorise: "+ decouvertAutorise);
	    }    
	    //8
	    public void deposer(double montant) {
	    	if(montant>0) {
	    		solde+=montant;
	    	}
	    	else{
	    		System.out.println("Montant de dépot invalide");
	    	}
	    }
	    
	    public void retirer(double montant) {
	    	if(montant>0 && solde - montant >= -decouvertAutorise){
	    		solde = solde-montant;
	    	}else {
	    		System.out.println("Retrait refusé");
	    	}
	    }
	    
	    public void virmentvers(CompteBancaire autre, double montant) {
	    	if(montant>0 && solde - montant >= -decouvertAutorise) {
	    		this.retirer(montant);
	    		autre.deposer(montant);
	    	}else {
	    		System.out.println("Virement impossible : montant ou solde insuffisant");
	    	}
	    }
	    //9
	    public  void calculerSoldeAvecInterets() {
	    	solde=solde+(solde*tauxinteret);
	    }
	    public  void calculerSoldeAvecInterets(double bonus) {
	    	solde=solde+(solde*(tauxinteret+bonus));
	    }
	    //10
	    public static int getNbComptes() {
	    	return nbComptes;
	    }
	    
	    public static double getTauxinteret() {
	    	return tauxinteret;
	    }
	    
	    public static void setTauxinteret(double taux) {
	    	tauxinteret=taux;
	    }
	    
	      
	}

