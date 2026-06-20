package List;

import java.util.ArrayList;
import java.util.Iterator;

public class C_04_ArrayList_Iterator {

	public static void main(String[] args) {
			
			ArrayList<String> obj1 = new ArrayList<String>();
				    obj1.add("Hey");
					obj1.add("What's");
					obj1.add("Going");
					obj1.add("On");
					obj1.add("?");
					
					Iterator <String> itr = obj1.iterator();
					while(itr.hasNext()) {
						String val = itr.next();
						System.out.println("Element is:= "+ val);
					}

				}

	}


