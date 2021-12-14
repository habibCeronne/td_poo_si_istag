package td_poo_si_istag.controller;

import td_poo_si_istag.models.Personne;

public class OperationPrimeEtudiant extends Personne
{
	
	@Override
	public void calculPrimeExcellence() {
		// TODO Auto-generated method stub
		
		int prime = 50;
		
		System.out.println("La prime d'excéllence de cet étudiant est de "+prime+ "FCFA");
		super.calculPrimeExcellence();
	}

}
