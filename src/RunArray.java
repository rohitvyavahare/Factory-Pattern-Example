
import java.awt.Font;
import java.util.ArrayList;


public class RunArray {
	
	public RunArray() {}
	
	private ArrayList<int [] > list = new ArrayList<int[] >();
	private int indexArray[] = new int[2];
	private ArrayList<Font> fontArray = new ArrayList<Font>();
	private Integer index = 0;
	
	public void addRun(Integer startIndex, Integer length, Font value ){
		
		indexArray[0] =startIndex;
		indexArray[1] = length;
		list.add(indexArray);
		index +=length;
	}
	
	public void appendRun(Integer length, Font value){
		
		indexArray[0] =index;
		indexArray[1] = length;
		list.add(indexArray);
		index +=length;
		
	}
	
   public Font getFont(int index){
	   
	   int i=0;
	  
	   for (int[] entry : list ){
		  
		   if(entry[0]<= index && index >= entry[1]){
			   return fontArray.get(i);  
		   }
		   i++;
	   }
	   return null;
	   
	}

}