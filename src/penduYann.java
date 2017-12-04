
import java.util.Arrays;
import java.util.Scanner;

public class penduYann {
	
	/*
	  Cette fonction sert � initialiser le mot cherch� avec sa premi�re et derni�re lettre. 
	  De plus, elle affiche les lettres identiques � la premi�re et derni�re lettre.
	*/
	static char[] initialisation(int longMot,char[] TabMotcache,char[] TabMotachercher) {
		char tiret ='-';
		
		for(int i=0; i<=longMot-1; i++) {
			if(TabMotachercher[i] == TabMotachercher[0]){
				TabMotcache[i]=TabMotachercher[0];
				}
			else if(TabMotachercher[i] ==TabMotachercher[longMot-1]) {
				TabMotcache[i]=TabMotachercher[longMot-1];
			}
			else {
				TabMotcache[i]=tiret;
			}
		}
		return TabMotcache;
		}
	/*
	  *Cette partie teste si le caractere rentr� par le joueur 2 est dans le mot a deviner
	*/
	static char[] testcarac(int longMot,char[] TabMotcache,char[] TabMotachercher,char lettre) {
		
		for(int i=0; i<=longMot-1; i++) {
			if(lettre == TabMotachercher[i]){
				TabMotcache[i]=lettre;
				}
		}
		
		return TabMotcache;	
	}
	//Ces fonctions vont contenir la partie graphique (RDV ligne 356 pour la suite).
	static void Graph (int erreurs){
		if(erreurs==1){
			System.out.println("          					");
			System.out.println("                                           ");
			System.out.println("                                            ");
			System.out.println("                                          ");
			System.out.println("                                      ");
			System.out.println("                                         ");
			System.out.println("                                        ");
			System.out.println("                                          ");
			System.out.println("                                         ");
			System.out.println("            					");
			System.out.println("                                             ");
			System.out.println("                                             ");
			System.out.println("                                   ");
			System.out.println("                                           ");
			System.out.println("                                          ");
			System.out.println("                                             ");
			System.out.println("                                             ");
			System.out.println("                                             ");
			System.out.println("                                             ");
			System.out.println("                                            ");
			System.out.println("                                          ");
			System.out.println("                                        ");
			System.out.println("                                      ");
			System.out.println("                                   ");
			System.out.println("                                     ");
			System.out.println("                                               ");
			System.out.println("                                            ");
			System.out.println("                         ");
			System.out.println("****************************");
		}
		else if(erreurs==2){
			System.out.println("          *					");
			System.out.println("          *                                  ");
			System.out.println("          *                                  ");
			System.out.println("          *                                ");
			System.out.println("          *                            ");
			System.out.println("          *                               ");
			System.out.println("          *                               ");
			System.out.println("          *                                ");
			System.out.println("          *                               ");
			System.out.println("          *  					");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                         ");
			System.out.println("          *                                 ");
			System.out.println("          *                                ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                  ");
			System.out.println("          *                                ");
			System.out.println("          *                              ");
			System.out.println("          *                            ");
			System.out.println("          *                         ");
			System.out.println("          *                           ");
			System.out.println("          *                                     ");
			System.out.println("          *                                  ");
			System.out.println("          *               ");
			System.out.println("****************************");
		}
		else if(erreurs==3){
			System.out.println("          *************************************");
			System.out.println("          *                                  ");
			System.out.println("          *                                  ");
			System.out.println("          *                                ");
			System.out.println("          *                            ");
			System.out.println("          *                               ");
			System.out.println("          *                               ");
			System.out.println("          *                                ");
			System.out.println("          *                               ");
			System.out.println("          *  					");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                         ");
			System.out.println("          *                                 ");
			System.out.println("          *                                ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                  ");
			System.out.println("          *                                ");
			System.out.println("          *                              ");
			System.out.println("          *                            ");
			System.out.println("          *                         ");
			System.out.println("          *                           ");
			System.out.println("          *                                     ");
			System.out.println("          *                                  ");
			System.out.println("          *               ");
			System.out.println("****************************");
		}
		else if(erreurs==4){
			System.out.println("          *************************************");
			System.out.println("          *     *                             ");
			System.out.println("          *    *                              ");
			System.out.println("          *   *                               ");
			System.out.println("          *  *                          ");
			System.out.println("          * *                              ");
			System.out.println("          *                               ");
			System.out.println("          *                                ");
			System.out.println("          *                               ");
			System.out.println("          *  					");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                         ");
			System.out.println("          *                                 ");
			System.out.println("          *                                ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                  ");
			System.out.println("          *                                ");
			System.out.println("          *                              ");
			System.out.println("          *                            ");
			System.out.println("          *                         ");
			System.out.println("          *                           ");
			System.out.println("          *                                     ");
			System.out.println("          *                                  ");
			System.out.println("          *               ");
			System.out.println("****************************");
		}
		else if(erreurs==5){
			System.out.println("          *************************************");
			System.out.println("          *     *                             *");
			System.out.println("          *    *                              *");
			System.out.println("          *   *                               *");
			System.out.println("          *  *                          ");
			System.out.println("          * *                              ");
			System.out.println("          *                               ");
			System.out.println("          *                                ");
			System.out.println("          *                               ");
			System.out.println("          *  					");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                         ");
			System.out.println("          *                                 ");
			System.out.println("          *                                ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                  ");
			System.out.println("          *                                ");
			System.out.println("          *                              ");
			System.out.println("          *                            ");
			System.out.println("          *                         ");
			System.out.println("          *                           ");
			System.out.println("          *                                     ");
			System.out.println("          *                                  ");
			System.out.println("          *               ");
			System.out.println("****************************");
		}
		else if(erreurs==6){
			System.out.println("          *************************************");
			System.out.println("          *     *                             *");
			System.out.println("          *    *                              *");
			System.out.println("          *   *                               *");
			System.out.println("          *  *                              *****");
			System.out.println("          * *                              *     *");
			System.out.println("          *                                *     *");
			System.out.println("          *                                *     *");
			System.out.println("          *                                 *****");
			System.out.println("          *  					");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                         ");
			System.out.println("          *                                 ");
			System.out.println("          *                                ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                   ");
			System.out.println("          *                                  ");
			System.out.println("          *                                ");
			System.out.println("          *                              ");
			System.out.println("          *                            ");
			System.out.println("          *                         ");
			System.out.println("          *                           ");
			System.out.println("          *                                     ");
			System.out.println("          *                                  ");
			System.out.println("          *               ");
			System.out.println("****************************");
		}
		else if(erreurs==7){
			System.out.println("          *************************************");
			System.out.println("          *     *                             *");
			System.out.println("          *    *                              *");
			System.out.println("          *   *                               *");
			System.out.println("          *  *                              *****");
			System.out.println("          * *                              *     *");
			System.out.println("          *                                *     *");
			System.out.println("          *                                *     *");
			System.out.println("          *                                 *****");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("****************************");	
		}
		else if(erreurs==8){
			System.out.println("          *************************************");
			System.out.println("          *     *                             *");
			System.out.println("          *    *                              *");
			System.out.println("          *   *                               *");
			System.out.println("          *  *                              *****");
			System.out.println("          * *                              *     *");
			System.out.println("          *                                *     *");
			System.out.println("          *                                *     *");
			System.out.println("          *                                 *****");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                         *********************");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("          *  ");
			System.out.println("****************************");
		}
		else if(erreurs==9){
			System.out.println("          *************************************");
			System.out.println("          *     *                             *");
			System.out.println("          *    *                              *");
			System.out.println("          *   *                               *");
			System.out.println("          *  *                              *****");
			System.out.println("          * *                              *     *");
			System.out.println("          *                                *     *");
			System.out.println("          *                                *     *");
			System.out.println("          *                                 *****");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                         *********************");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                  * *");
			System.out.println("          *                                 *   *");
			System.out.println("          *                                *     *");
			System.out.println("          *                               *       *");
			System.out.println("          *                              *         *");
			System.out.println("          *                             *           *");
			System.out.println("          *                                     ");
			System.out.println("          *                                  ");
			System.out.println("          *               ");
			System.out.println("****************************");
		}
		else if(erreurs==10){
			System.out.println("          *************************************");
			System.out.println("          *     *                             *");
			System.out.println("          *    *                              *");
			System.out.println("          *   *                               *");
			System.out.println("          *  *                              *****");
			System.out.println("          * *                              * x x *");
			System.out.println("          *                                *  J  *");
			System.out.println("          *                                * --- *");
			System.out.println("          *                                 *****");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                         *********************");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                   *");
			System.out.println("          *                                  * *");
			System.out.println("          *                                 *   *");
			System.out.println("          *                                *     *");
			System.out.println("          *                               *       *");
			System.out.println("          *                              *         *");
			System.out.println("          *                             *           *");
			System.out.println("          *                                     ");
			System.out.println("          *                                  ");
			System.out.println("          *               ");
			System.out.println("****************************");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner lire=new Scanner(System.in);
		
		int erreurs= 0;
		
		char lettre;
		
		System.out.print("Joueur 1, saisissez le mot ( sans espace ) : ");
		String mot = lire.nextLine();
		int longMot = mot.length();	
		
		//========Le mot � chercher est stock� dans le tableau TabMotachercher
		char[] TabMotachercher = new char[longMot];
		int i;
		
		for (i=0;i<longMot;i++){
			TabMotachercher[i]=mot.charAt(i);
           	}
		//=========C'est le mot qui va s'afficher au joueur
		char[] TabMotcache = new char[longMot];
		
		//============Le mot initialise avec la premi�re et derni�re lettre
		initialisation( longMot, TabMotcache, TabMotachercher);
		for (i=0;i<longMot;i++){
			System.out.print(TabMotcache[i]);
           	}
		System.out.println();
		
		//========== Le jeu interractif commence 
		boolean perdu= false;
		
		
		
		while(! Arrays.equals(TabMotcache,TabMotachercher) && erreurs< 10) {
			System.out.print("\nJoueur 2, saisissez une lettre ( en minuscule ) : ");	
			lettre =lire.nextLine().charAt(0);
			char[] TabMotavanttest =new char[longMot] ;
			
			for (i=0;i<longMot;i++){
				 TabMotavanttest[i]=TabMotcache[i];
	        }
			
			testcarac( longMot, TabMotcache, TabMotachercher, lettre);
			for (i=0;i<longMot;i++){
				System.out.print(TabMotcache[i]);
			}
			System.out.println();
			
			if( Arrays.equals(TabMotcache,TabMotavanttest)) {
				erreurs++;
				System.out.println("Rat�\nVous avez "+erreurs+" erreurs");
			}
			else{
				System.out.println("Bien jou�!");
			}
			Graph(erreurs);
		}
		
		if (erreurs== 10)
			perdu=true;
		
		if (perdu==true) {
			System.out.println("Vous avez perdu");	
		}
		else {
			System.out.println("Vous avez gagn�");
		}
		
	lire.close();
	}
	
}