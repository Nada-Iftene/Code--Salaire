import java.util.Scanner;

public class Salaire {
	final int prime=2000;
	private String adresse;
	private int nmbrHeursTrav;
	private String référenceOrganisme;
	
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
	public String getRéférenceOrganisme() {
		return référenceOrganisme;
	}
	public void setRéférenceOrganisme(String référenceOrganisme) {
		this.référenceOrganisme = référenceOrganisme;
	}
	
	public void calculSalaire(double salaire){
		System.out.println("L'employé à temps plein ou temps partiel??");
		String s = sc.nextLine();
		if (s.matches("temps plein")){
			salaire= 40000;
			System.out.println(" l'employé travaille la nuit et les week-end?(oui ou non)");
			
			String o = sc.next();
			if (o.matches("oui")){
				System.out.println("il reçoit une prime de 2000 da");
				salaire +=prime;
			}
			else {System.out.println("ne reçoit d'aucune prime ");}
			System.out.println("le salaire d'employé est :"+salaire+"DA");
		}
		if (s.matches("temps partiel")){
			System.out.println("ne reçoit d'aucune prime ");
			System.out.println("Combien d'heurs à travailler? ");
			nmbrHeursTrav=sc.nextInt();
			salaire =( nmbrHeursTrav * 500);
			System.out.println("le salaire d'employé est :"+salaire+" DA");
		}
		
		
	}

}
