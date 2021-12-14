package td_poo_si_istag.controller;

import java.util.Scanner;

import td_poo_si_istag.models.Employer;
import td_poo_si_istag.models.Personne;

public class OperationPrimeEmployer extends Personne
{
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void calculPrimeExcellence() {
		// TODO Auto-generated method stub
	
		int salaire = 0,salaireTotal;
		int prime = 100;
		
	
		
		System.out.println("Veuillez entrer votre salaire mensuel");
		salaire = sc.nextInt();
		salaireTotal = salaire + prime;
		System.out.println("Votre prime d'excéllence est égal à "+prime+" ,suivi de votre salaire qui vaut: "+salaire+" FCFA et le total de votre salaire est de: "+salaireTotal+"FCFA");
	
		
		super.calculPrimeExcellence();
	}
	
	

}
