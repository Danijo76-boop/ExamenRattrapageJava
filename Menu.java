public class Menu{
public static void main(String[] args){


 public void menu()
    {
        int choix=0, i ,NombreEtudiant;
        do{
        Scanner in= new Scanner(System.in);
         
        System.out.println("faites votre choix");
        System.out.println("1- Afficher le nombre d'étudiants");
        System.out.println("2- Afficher les étudiants Boursiers");
        System.out.println("3- Afficher les etudiants non Boursier");
        System.out.println("4- Quitter");
        choix=in.nextInt();
         
        switch (choix){
         
        case 1:
                  for(i=0;i<3;i++)
                {
                System.out.println("veuillez saisir le nombre d'étudiants");
                String NombreEtudiant=in.nextInt();
            

                System.out.println("Saisir le nom d'étudiant");
                String Nom=in.nextLine();
                System.out.println("Saisir le prenom d'étudiant");
                String Prenom=in.nextLine();
                System.out.println("Saisir la Matricule de l'étudiant"); 
                String Matricule=in.nextLine();
                 System.out.println("Saisir la date de naissance de l'étudiant"); 
                String dateNaiss =in.nextLine();
                 
                     }
        case 2:
                {
                    etudiant1.AfficherBoursier();
                   
                }
                 
        case 3:
        {
           etudiant1.AfficherNonBoursier();
             
        }
         
      
             
        case 4:
            {
                System.out.println("Fin du programme");
            }
        }
         
        }while(choix!=4);
             
    }
     
     
 
}
 








}






