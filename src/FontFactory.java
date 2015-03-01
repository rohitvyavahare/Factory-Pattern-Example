import java.awt.Font;
import java.util.ArrayList;

/**
 * This is Flyweight factory that given attributes for fonts returns the Flyweight
character object for the font.
* It have single point of access       
 */
public class FontFactory {

   private ArrayList<Font> fontArray = new  ArrayList<Font>();
   
   private FontFactory() {}
	
	private static class SingletonHolder {
		 
		private final static FontFactory  INSTANCE = new FontFactory ();
		 
		 }
	
	public static FontFactory instance() {
		 
		return SingletonHolder.INSTANCE;
		
		 }

    public Font getFont(String name, int style, int size ){
    	
    		for(Font font : fontArray ){
    			if(font.getName().equals(name) && style == font.getStyle() && size == font.getSize()){
    				return font;
    			}
    		}
    		Font font = new Font(name, style, size);
    		fontArray.add(font);
    		return font;
    		
    	}
 }