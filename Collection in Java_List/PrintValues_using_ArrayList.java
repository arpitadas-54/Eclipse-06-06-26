package List;

import java.util.ArrayList;

public class PrintValues_using_ArrayList {
	public static void main(String[] args) {

	ArrayList<String> obj1 = new ArrayList<String>();
	    obj1.add("Hey");
		obj1.add("What's");
		obj1.add("Going");
		obj1.add("On");
		obj1.add("?");
		
		int ListSize = obj1.size();
		
		for(int i=0;i<ListSize;i++)
		{
			System.out.println("Element in Arraylist:= "+ obj1.get(i));
		}

	}

}
