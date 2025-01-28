
public class Personne {
	String nom;
	String prenom;
	public Personne() {
		nom="marcus";
		prenom="william";
		
	}
	public Personne(String n,String p) {
		nom=n;
		prenom=p;
		
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}
}
