import java.awt.Font;


public class UnsharedCharacter {

	private Character character;
	private Font font;
		
	UnsharedCharacter(Character character, Font font){
		
		this.character = character;
		this.font = font;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}
	
	public void draw(){
		//for fututre enhancements 
	}

}
