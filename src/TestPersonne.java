
public class TestPersonne {
	public static void main(String[]args) {
		Personne p1 = new Personne();
		System.out.println(p1);
		System.out.println("le prenom de cette personne est "+p1.getPrenom()+" et son nom est "+p1.getNom());
		Personne p2 = new Personne("delachaussé", "jean");
		System.out.println(p2);
		System.out.println("le prenom de cette personne est "+p2.getPrenom()+" et son nom est "+p2.getNom());
		
	}
}
