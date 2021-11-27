package oOOPsConcept;

public class SingleInheritanceChild extends SingleInheritanceParent {

	
		   public SingleInheritanceChild() {
	    	   System.out.println("Child Class Constructor");
	       }
		   
		   
	       public SingleInheritanceChild(String para) {
	    	   super(7);                    //this or super use
	    	   System.out.println("Child Class Constructor With "+para);
	       }
	       
	       
	       
	      public static void main(String[] args) {
			 SingleInheritanceParent Parent= new SingleInheritanceChild("parameter");
		}


	
			
		}


	

