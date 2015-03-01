import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
	CharacterFactory charfactory = CharacterFactory.instance();
    ArrayList<Character> ch= new ArrayList<Character>();
    ch.add(charfactory.getCharacter('a'));
    ch.add(charfactory.getCharacter('a'));
    ch.add(charfactory.getCharacter('a'));
    ch.add(charfactory.getCharacter('b'));
    ch.add(charfactory.getCharacter('b'));
    ch.add(charfactory.getCharacter('b'));
    ch.add(charfactory.getCharacter('b'));
    ch.add(charfactory.getCharacter('a'));
    ch.add(charfactory.getCharacter('a'));
    ch.add(charfactory.getCharacter('a'));
    ch.add(charfactory.getCharacter('a'));
    
	}
    
}
