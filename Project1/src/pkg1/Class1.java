package pkg1;

import java.util.*;

public class Class1 
{
  public static void main(String[] args)
  {
	 TreeMap<Integer, String> hm=new TreeMap<Integer,String>();
	  hm.put(2, "Deepak");
	  hm.put(23,"Selenium");
	  hm.put(1,"Automation");
	  hm.put(12, "Testing");
	  hm.put(232,"my");
	  hm.put(0,"er");
	  hm.put(0,"newvalue");
	  
	   Set<Integer> all= hm.keySet();  // all the keys
	  
	   for(Integer i:all)
	   {
		   System.out.println("key is " + i+" value is "+hm.get(i));
	   }
	   
  }
	
}
