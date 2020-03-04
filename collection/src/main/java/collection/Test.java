package collection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import collection.Mycollection.*;

public class Test {
	private static final Logger LOGGER=LogManager.getLogger(Test.class);
	public static void main(String args[])
	{
		Mycollection m=new Mycollection();
		m.add(10);
		m.add("swetha");
		m.add(4.5);
		m.add(9);
		m.add("Ramesh");
		m.add(8);
		m.add("vamshi");
		m.add(7.6);
		m.add(null);
		m.add(98);
		m.add(22);
		//using index print value
		LOGGER.info("Array list elements are:");
		//replacing an element using position
		m.replace(2, "Anjali");
		//removing elements
		m.remove(3);
		//inserting an element 
		m.insert(4,"divya");
		//after performing operations on ArrayList
		LOGGER.info("The elements of arraylist are:");
		int i=0;
		while(m.size()>i)
		{
			LOGGER.info(m.get(i));
			i++;
		}

		LOGGER.info("capacity of array is:");
		LOGGER.info(m.capacity());
		LOGGER.info("size of array is:");
		LOGGER.info(m.size());
		
	}

}
