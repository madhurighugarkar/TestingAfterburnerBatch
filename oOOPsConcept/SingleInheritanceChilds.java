package oOOPsConcept;


	public class SingleInheritanceChilds extends SingleInheritanceParents {
		public void multiplication(int a,int b) {
			
			int c = a*b;
			System.out.println("Multiplication= "+c);
		}

		
		public static void main(String[] args) {
			// REFERENCE                        //OBJECT
			SingleInheritanceParents obj=new SingleInheritanceParents();
	        obj.addition(45, 6);
	        obj.subtraction(4, 3);
	        //method multiplication() is undefined for the type SingleInheritanceParent
	        //obj.multiplication(5,3);
	        
	        SingleInheritanceChilds child=new SingleInheritanceChilds();
	        child.addition(7, 3);
	        child.multiplication(5, 7);
	        child.subtraction(8, 3);
	        
	        SingleInheritanceParents parentchild=new SingleInheritanceChilds();
	        parentchild.addition(4,20);
	        parentchild.subtraction(9, 4);
	       // The method multiplication(int, int) is undefined for the type SingleInheritanceParent
	       // parentchild.multiplication(12, 3);
	        
	       //Type mismatch: cannot convert from SingleInheritanceParent to SingleInheritanceChild
	       //SingleInheritanceChild childparent=new SingleInheritanceParent();
		}


	}


