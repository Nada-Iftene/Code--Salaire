import java.util.Scanner;

public class Salaire {
	final int prime=2000;
	private String adresse;
	private int nmbrHeursTrav;
	private String r�f�renceOrganisme;
	
	Scanner sc = new Scanner(System.in);
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNmbrHeursTrav() {
		return nmbrHeursTrav;
	}
	public void setNmbrHeursTrav(int nmbrHeursTrav) {
		this.nmbrHeursTrav = nmbrHeursTrav;
	}
	public String getR�f�renceOrganisme() {
		return r�f�renceOrganisme;
	}
	public void setR�f�renceOrganisme(String r�f�renceOrganisme) {
		this.r�f�renceOrganisme = r�f�renceOrganisme;
	}
	
	public void calculSalaire(double salaire){
		System.out.println("L'employ� � temps plein ou temps partiel??");
		String s = sc.nextLine();
		if (s.matches("temps plein")){
			salaire= 40000;
			System.out.println(" l'employ� travaille la nuit et les week-end?(oui ou non)");
			
			String o = sc.next();
			if (o.matches("oui")){
				System.out.println("il re�oit une prime de 2000 da");
				salaire +=prime;
			}
			else {System.out.println("ne re�oit d'aucune prime ");}
			System.out.println("le salaire d'employ� est :"+salaire+"DA");
		}
		if (s.matches("temps partiel")){
			System.out.println("ne re�oit d'aucune prime ");
			System.out.println("Combien d'heurs � travailler? ");
			nmbrHeursTrav=sc.nextInt();
			salaire =( nmbrHeursTrav * 500);
			System.out.println("le salaire d'employ� est :"+salaire+" DA");
		}
		
		
	}

}
