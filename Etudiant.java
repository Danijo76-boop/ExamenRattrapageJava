import Etudiant;

public class Etudiant{
public static void main(String[] args){

	private String Matricule;
    private String Nom;
    private String Prenom;
    private String dateNaiss;

    public Etudiant() {
		super();
		this.Matricule = Matricule;
		this.Nom = Nom;
        this.Prenom = Prenom;
        this.nomComplet = nomComplet;
        this.dateNaiss = dateNaiss;
	}


    public String getMatricule() {
		return Matricule;
	}
	public void setMatricule(String getMatricule) {
		this.Matricule = Matricule;
	}

    
    public String getNom() {
		return Nom;
	}
	public void setNom(String getNom) {
		this.Nom = Nom;
	}

    
    public String getPrenom() {
		return Prenom;
	}
	public void setdateNaiss(String getdateNaiss) {
		this.dateNaiss =dateNaiss;
	}

    
    //1) Declaration
    Etudiant etudiant1;
    //2) Instanciation
    etudiant1 = new Etudiant();

    //3) Utilisation

    etudiant1.afficherBoursier()
    etudiant1.afficherNonBoursier()


    public void afficherBoursier(){
        System.out.println("Les etudiants sont: ")

    }


     public void afficherNonBoursier(){


    }




}

}