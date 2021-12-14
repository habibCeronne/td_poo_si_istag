package td_poo_si_istag.models;

public class Personne 
{
	
	private String nom,prenom,date_Naissance,num_telephone;
	private int age;
	
	//Methode de la prime
	public void calculPrimeExcellence(){}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDate_Naissance() {
		return date_Naissance;
	}
	public void setDate_Naissance(String date_Naissance) {
		this.date_Naissance = date_Naissance;
	}
	public String getNum_telephone() {
		return num_telephone;
	}
	public void setNum_telephone(String num_telephone) {
		this.num_telephone = num_telephone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
