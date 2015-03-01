
import java.awt.Font;
import org.junit.Test;


public class SizeofUtilTest {
	
	@Test
	  public void testFlyweight() {	
		
		System.out.printf("The average size using Flyweight is %.1f bytes%n", new SizeofUtil() {
	    	 
	    @Override
	    protected int create() {

	    CharacterFactory charfactory = CharacterFactory.instance();
	    FontFactory fontfactory = FontFactory.instance();
	    Character [] chArray = new Character[327];

	    for(int i=1; i< 55; i++){
	    	chArray[i-1] = charfactory.getCharacter((char)i);
	    }
	    	      
	    for(int i=55; i< 327; i++){
	    	chArray[i] = charfactory.getCharacter((char)54);
	    }
	    	      
	    RunArray runArray = new RunArray();
	    runArray.addRun(0, 115, fontfactory.getFont("Verdana", Font.BOLD, 12));
	    runArray.appendRun(211, fontfactory.getFont("Verdana", Font.ITALIC, 12));
	    	      
	    return 1 ;
	          }
	        }.averageBytes());
	}
	
	@Test
	  public void testWithoutFlyweight() {	
		
	    System.out.printf("The average size without Flyweight is %.1f bytes%n", new SizeofUtil() {
	    	 
	    @Override
	    protected int create() {

	    UnsharedCharacter[] chArray = new UnsharedCharacter[327];
	    
	    for(int i=1 ; i < 115; i++){
	    	chArray[i-1] = (new UnsharedCharacter(new Character((char)i),new Font("Verdana", Font.BOLD, 12)));
		}
		    	      
		for(int i=115 ; i < 327; i++){
			chArray[i] = (new UnsharedCharacter(new Character((char)i),new Font("Verdana", Font.BOLD, 12)));   	    	 
		}
		
	    return 1 ;
	    }
	 }.averageBytes());
	}
	
}