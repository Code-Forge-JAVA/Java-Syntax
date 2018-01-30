


-////Basic Syntax
..String..
  Declaration..

		String[] names = new String[4];
		String names[]={"Robert","Josh"}
		  --or
		int sizeUsers = 4;
		String[] names = new String[sizeUsers];  
		  --or
		String[] names = new String[4];
		String names[0]="Robert";

   String.methods..
	    
	    //Find mathed part of text 
	       String s = "RobertKarmenJoshKaren";
           System.out.println(s.indexOf("Kar"));//  'Kar' start after 7 letter
           System.out.println(s.indexOf("Kar",7)); // Ignore 'Kar' after 7 letter and return 16 founded 'Kar' position
        // Concanate Text
           String s = "fish";
           String s2= "tank";
           System.out.println(s.concat(s2)); // return 'fishtank'

..........................................................
-----Vetor
import java.util.Vector;
private  Vector<String> namesArray = new Vector<String>();
vectorArray.add("Robert");
-----ArrayList
 import java.util.ArrayList;
 private ArrayList<String> namesArray = new ArrayList<String>();
 namesArray.add("Robert");



 ----//For loop

 //loop each values
 String names[] = {"Robert","Karmen","Josh","Karen"};

 	for (String name: names){
 			if(name.startsWith("Ka"))
 	 			System.out.println( "Found a 'Ka' in this ->" +name + " name." );

 	}

//or 







 	//// Random Code

 	--//Java ArrayList of ArrayList, Inseption

 	public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> inner = new ArrayList<Integer>();        

    inner.add(100);     
    inner.add(200);
    outer.add(inner); // add first list
    inner = new ArrayList<Integer>(inner); // create a new inner list that has the same content as  
                                           // the original inner list
    outer.add(inner); // add second list

    outer.get(0).add(300); // changes only the first inner list

    System.out.println(outer);
}