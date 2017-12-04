import javax.swing.JFrame;


public class Frame extends JFrame
{
	Panel pan = new Panel();
	
   public Frame(String nom)
   {
	   this.setVisible(true); //afficher la fenetre
	   this.setTitle(nom); //afficher le nom de la fenetre
	   this.setSize(1000,500); //defi,ir la fenetre
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //etteindre le progrmme lorsque l'on ferme la fenetre
	   this.setLocationRelativeTo(null); //placer la fenetre au milieu de l'ecrant
	   this.setResizable(false);//pas que lon puisse modifier la taille
	   this.add(pan);
   }
}
