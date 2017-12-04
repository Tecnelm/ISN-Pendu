import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel extends JPanel implements ActionListener
{
	private penduTableauVersion n = new penduTableauVersion();

	private JButton bouton2 = new JButton("Lancer");
	private JButton bouton = new JButton("Valider");
	private JTextField entrer = new JTextField();
	
	private JLabel instruction = new JLabel("instruction :");
	private JLabel conteur = new JLabel("conteur :");
	private JLabel lettreDejaTrouve = new JLabel("lettre déjà trouvé :");
	
	//private JTextField cadrePendu = new JTextField();
	private JTextArea cadreInstruction = new JTextArea();
	private JTextField cadreMot = new JTextField();
	private JTextField cadreConteur = new JTextField();
	private JTextField cadreLettreDejaTrouve = new JTextField();
	
	private static ImageLabel image;
	private boolean start = false;
	
	public Panel()
	{
		this.setLayout(null);
		this.add(bouton);
		this.add(bouton2);
		this.add(entrer);
	//	this.add(cadrePendu);
		this.add(cadreInstruction);
		this.add(cadreMot);
		this.add(instruction);
		this.add(cadreConteur);
		this.add(conteur);
		this.add(cadreLettreDejaTrouve);
		this.add(lettreDejaTrouve);
		
		bouton.addActionListener(this);
		bouton2.addActionListener(this);
		
		bouton2.setBounds(350,325,100,100);
		bouton.setBounds(100,325,100,100);
		entrer.setBounds(50,225,150,50);
		
		instruction.setBounds(75,15,100,100);
		conteur.setBounds(425,15,100,100);
		
	//	cadrePendu.setBounds(550,25,425,425);
		cadreInstruction.setBounds(75,75,300,50);
		cadreMot.setBounds(350,225,150,50);
		cadreConteur.setBounds(425,75,50,50);
		cadreLettreDejaTrouve.setBounds(50,280,200,25);
		
		
	//	cadrePendu.setEditable(false);
		cadreInstruction.setEditable(false);
		cadreMot.setEditable(false);
		cadreConteur.setEditable(false);
		cadreLettreDejaTrouve.setEditable(false);
		bouton.setEnabled(false);
		
		//cadrePendu.setBackground(Color.WHITE);
		cadreInstruction.setBackground(Color.WHITE);
		cadreMot.setBackground(Color.LIGHT_GRAY);
		cadreConteur.setBackground(Color.WHITE);
		cadreLettreDejaTrouve.setBackground(Color.WHITE);
		
		cadreInstruction.setText("Saisissez UN mot a faire deviner ( sans \"-\") \n puis cliquer sur lancer\n "+
								 "rentrez une lettre et cliquer sur valider ");
		image = ImageManager.getInstance().getImage(0);
		this.add(image);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(entrer.getText().length()!=0) 
		{
			if(e.getSource() == bouton2)
			{
				n.init(entrer.getText());
				start =  true;
				entrer.setText(null);
				cadreMot.setText(n.getTableau());	
				bouton.setEnabled(true);
			}
			if(start)			
			{
				if(e.getSource() == bouton)
				{
					n.exec(entrer.getText().charAt(0));
					entrer.setText(null);
					cadreMot.setText(n.getTableau());	
					if(n.isVictoire()||n.getConteurPerte()==10)
					{
						bouton.setEnabled(false);
						cadreMot.setText(n.GetMot());
					}
					
				}
				
			}	
			
			this.remove(image);
			if(n.isVictoire())
				image = (ImageLabel)ImageManager.getInstance().getImage(11);
			else
				image = (ImageLabel)ImageManager.getInstance().getImage(n.getConteurPerte());
			this.add(image);
		}
		
		cadreConteur.setText(n.getConteurPerteSTR());
		cadreLettreDejaTrouve.setText(n.getTableauLettreMit());
		this.repaint();

	}
}
