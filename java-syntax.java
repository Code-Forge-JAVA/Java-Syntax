


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
    To String 
           String.valueOf(42) ;// convert into string 
    To In 
           String myString = "1234";
           int foo = Integer.parseInt(myString);       

    //
    Check integer in string 0-9
    subtextStr.matches("-?\\d+"); // return boolean       
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

......................................................
-----Array
pinArray.indexOf(index); //Serch index . if find return 1 else -1
...................................................


----//Structure of a Javadoc Comment // Give comment about function
Embedded in  /**   Description of function functionality  */

//** 
First paragraph   ..  general description
Tags that label  /   classify the description

@param  parametres of the method
@return  return value of the method
@throw  exceptions the method may throw 
@author  who wrote the class / interface
@version 
 
*/
// Tips for JavaDoc
Netbeans
'/** + Enter' Generate accured arguments from Javadoc HTML file  automaticly from method are neares usuly down function.
Generate JavaDoc Go -> Projects-/MyProject/Right-Click->Generate Javadoc


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
    System.out.println(outer);
    System.out.println(outer.size());
    System.out.println(outer.get(0).get(2));
}

// Java program to demonstrate varargs
class Test1
{
    // A method that takes variable number of intger
    // arguments.
    static void fun(int ...a)
    {
        System.out.println("Number of arguments: " + a.length);
 
        // using for each loop to display contents of a
        for (int i: a)
            System.out.print(i + " ");
        System.out.println();
        System.out.println(a[0]); // select directly as array
    }
 
    // Driver code
    public static void main(String args[])
    {
        // Calling the varargs method with different number
        // of parameters
        fun(100);         // one parameter
        fun(1, 2, 3, 4);  // four parameters
        fun();            // no parameter
    }
}


// try cath

try(BufferedReader br = new BufferedReader(new FileReader(filename))) 
                {    
                    int lines = 0;
                    dataStringHolder.clear(); // clear that old data
                    
                    for(String line; (line = br.readLine()) != null; ) {
//                         System.out.println(line+"\n");
                                                 
                         dataStringHolder.add(line); // store new data
                     }
                     
                     lines++;
                }        
             catch (Exception e)
                     {
                          System.err.println("Class: StaticFileManager, method: readInFileUpdater() ERROR_ReadLineMethod path:"+fileSystem.getAbsolutePath());
                     }

or 

try {}cath (Exception e) {}                     














// Fecth pins, user ID,user Password, Password Next Update Position  
// Generate plain lenght with nothing and when upload data from file




Class 

  Class as multidatatypes array 
  1.
         public class IOKeyMap {
/**
 * Hold unicode shifting properties
 */   
 


public class IOKeyMap {
/**
 * Hold unicode shifting properties
 */   
 
     private class __keymap {
        public char key;
        public int value;
        public boolean shift; // if unicode
        
         
        
        public __keymap(char key,int value,boolean shift) {
         
             this.key = key;
             this.value = value;
             this.shift = shift;
         };
    }   
     public __keymap[] keymap;    
        
      public  IOKeyMap () {
            keymap  = new __keymap[12];
            
            // Set new values using constructor
            keymap[0] = new __keymap('!',1,true);
            keymap[1] = new __keymap('!',1,true);
            keymap[2] = new __keymap('@',-1,true);
            keymap[3] = new __keymap('#',-1,true);
            keymap[4] = new __keymap('%',-1,true);
            keymap[5] = new __keymap('^',-1,true);
            keymap[6] = new __keymap('^',-1,true);
            keymap[7] = new __keymap('&',-1,true);
            keymap[8] = new __keymap('*',-1,true);
            keymap[9] = new __keymap('(',-1,true);
            keymap[10] = new __keymap(')',-1,true);
            keymap[11] = new __keymap('_',-1,true);
            keymap[12] = new __keymap('+',-1,true);
            
            
        }
        
        // return total ammount of array lists
        int getLenght() {return keymap.length;}
        
        
        /**
         * See All map of parameters
         */
        void seeMap () {
             System.err.println("array len: "+keymap.length);
            
            for (__keymap object : keymap) {
                
                System.out.println(object.key+", "+object.value+", "+object.shift );
            }
        }
        
    }

Assole1234567890