
import java.text.Normalizer;

public class penduTableauVersion 
{
	private String mot;
	private char[]tableau;
	private int conteurPerte = 0;
	private boolean victoire;
	private static int conteurLettreDejaMit ;
	private char[]tableauLettreMit = new char[26];
	
	//-----------------------------FONCTION : initialise le tableau avec la premier et derniere lettre	
	public void init(String mot)
	{	
		this.conteurPerte = 0;
		mot = mot.toLowerCase();                                                                //enleve les majuscules
		mot = Normalizer.normalize(mot, Normalizer.Form.NFD).replaceAll("[\u0300-\u036F]", "");  // enleve les accents (mdr)
		this.mot = mot; //pour avoir accé a mot dans cette class
		
		char[]tableau = new char[mot.length()];
		for(int i = 0; i<mot.length(); i++) 
		{
			if(mot.charAt(i) == mot.charAt(0))
			{
				tableau[i] = mot.charAt(0);
			}
			else if(mot.charAt(i) == mot.charAt(mot.length() -1))
			{
				tableau[i] = mot.charAt(mot.length() -1);
			}
			else
			{
				tableau[i] = '-' ;
			}
		}
		this.tableau = tableau;//pour avoir accé au tableau dans cette class
		conteurLettreDejaMit = 0;
		for (int i  = 0 ; i < 26 ; i++)
			tableauLettreMit[i] = '\0';
		
	}
	//-----------------------------FONCTION : test si c'est gagné
	private boolean testwin()
	{
		for(int t = 0; t<tableau.length; t++)
		{
			if('-' == tableau[t])
			{
				return false;
			}
		}
		return true;
	}

	//-----------------------------FONCTION : test si le caractere saisi est dans le mot et le met au bonne endroit dans le tableau
	public void exec(char caracPotentiel)
	{
		boolean dejaMit = false;
		boolean perdu = true;
		
		
		
		
		
			for(int k = 0; k<26; k++) //test si la lettre saisie  a deja etait saisie
			{
				if(caracPotentiel == tableauLettreMit[k])
				{
					dejaMit =  true;
				}
			}
			if(!dejaMit)
			{
				tableauLettreMit[conteurLettreDejaMit] = caracPotentiel;
				conteurLettreDejaMit++;
				System.out.println(String.valueOf(tableauLettreMit)+"    "+ conteurLettreDejaMit);
			}
			
			
					
			for(int p = 0; p<mot.length(); p++) //test si ya le caractere saisi dans le mot
			{
				if(caracPotentiel == mot.charAt(p))
				{
					perdu = false;
				}
			}
			
			if(!perdu && !dejaMit) //si ya le caractere dans le mot alors le met dasn le tableau au bonne endroit
			{
				for(int w = 0; w<mot.length(); w++)
				{
					if(caracPotentiel == mot.charAt(w))
					{
						tableau[w] = caracPotentiel;
					}
				}
			}
			
			else if(!dejaMit) //sinon +1 au conetur de perte
			{
				conteurPerte++;
			}
			victoire = testwin();
			dejaMit = false;
			
			
	}
	
	public String getTableau()
	{
		return String.valueOf(this.tableau);
	}
	public boolean isVictoire() {
		return victoire;
	}
	public String getConteurPerteSTR() {
		return ""+conteurPerte;
	}
	public int getConteurPerte() {
		return conteurPerte;
	}
	public String getTableauLettreMit() {
		return String.copyValueOf(tableauLettreMit);
	}
	public String GetMot()
	{
		return mot;
	}
	


}
