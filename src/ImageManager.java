import java.awt.Dimension;
import java.util.ArrayList;

// cette classe va gerer le pannel a afficher 
public class ImageManager {
    private ArrayList<ImageLabel> jImage = new ArrayList<>();
    public static ImageManager instance = new ImageManager();
    // permet d'eviter de  regénerer le pannel manageur a chaque fois
    public static ImageManager getInstance() {
        return instance;
    }
    public void setup(){
    	for (int i = 0 ; i<=10 ; i++)
		{

    			ImageLabel im = new ImageLabel("Image/pendu"+i+".jpg",i);
				im.setBounds(600, 20, 300,300 );
				jImage.add(im);

		}
    	ImageLabel im = new ImageLabel("Image/Win.jpg",11);
    	
    	im.setBounds(600, 20, 300,300 );
    	
		jImage.add(im);
       instance=this;
    }

 
    // parcoure la liste pour touver le bon pannel a afficher
    public ImageLabel getImage(int id){
        for(ImageLabel Image : jImage){
            if(Image.getID() == id)
                return (ImageLabel)Image;
        }
        return null;
    }
    public void SetTextTrad(String string,int id) {
		
		
	}
}
