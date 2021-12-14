package td_poo_si_istag.views;

import java.util.Scanner;

import td_poo_si_istag.controller.OperationPrimeEmployer;
import td_poo_si_istag.controller.OperationPrimeEtudiant;
import td_poo_si_istag.models.Employer;
import td_poo_si_istag.models.Etudiant;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Employer employer = new Employer();
		Etudiant etudiant = new Etudiant();
		OperationPrimeEmployer operationPrimeEmployer = new OperationPrimeEmployer();
		OperationPrimeEtudiant operationPrimeEtudiant = new OperationPrimeEtudiant();
		
		employer.setNom("");
		employer.setPrenom("");
		employer.setMatriculEmployer(0);
		employer.setDate_Naissance("");
		employer.setNum_telephone("");
		
		System.out.println("-------------ESPACE EMPLOYER------------------:");
		System.out.println("Veuillez entrer votre nom d'employer:");
		System.out.println("Votre nom est: "+ scanner.nextLine()+employer.getNom());
		
		System.out.println("Veuillez entrer votre prénom d'employer:");
		System.out.println("Votre prénom est: "+ scanner.nextLine()+employer.getPrenom());
		
		System.out.println("Veuillez entrer votre matricule d'employer:");
		System.out.println("Votre nom est: "+ scanner.nextInt()+employer.getMatriculEmployer());
		
		System.out.println("Veuillez entrer votre lieu de naissance:");
		System.out.println("Votre lieu de naissance est: "+ scanner.nextLine()+employer.getDate_Naissance());
		
		System.out.println("Veuillez entrer votre age:");
		System.out.println("Votre age est: "+ scanner.nextInt()+employer.getAge());
		
		System.out.println("Veuillez entrer votre numéro de téléphone:");
		System.out.println("Votre numéro de téléphone est: "+ scanner.nextLine()+employer.getNum_telephone());
		operationPrimeEmployer.calculPrimeExcellence();
		
		System.out.println("--------------------ESPACE ETUDIANT(E)-------------------------");
		
		System.out.println("Veuillez entrer votre nom d'employer:");
		System.out.println("Votre nom est: "+ scanner.nextLine()+etudiant.getNom());
		
		System.out.println("Veuillez entrer votre prénom d'employer:");
		System.out.println("Votre prénom est: "+ scanner.nextLine()+etudiant.getPrenom());
		
		System.out.println("Veuillez entrer votre matricule d'employer:");
		System.out.println("Votre nom est: "+ scanner.nextInt()+etudiant.getMatriculEtudiant());
		
		System.out.println("Veuillez entrer votre lieu de naissance:");
		System.out.println("Votre lieu de naissance est: "+ scanner.nextLine()+etudiant.getDate_Naissance());
		
		System.out.println("Veuillez entrer votre age:");
		System.out.println("Votre age est: "+ scanner.nextInt()+etudiant.getAge());
		
		System.out.println("Veuillez entrer votre numéro de téléphone:");
		System.out.println("Votre numéro de téléphone est: "+ scanner.nextLine()+etudiant.getNum_telephone());
		operationPrimeEtudiant.calculPrimeExcellence();
		

	}

}
