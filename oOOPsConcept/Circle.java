package oOOPsConcept;
//Derived class
public class Circle {

		public static void main(String[] args) {
			Area area=new Area();
	        area.circleArea(5.5f);
	        area.squareArea(7);
	        
	        Area area1=new Area();
	        area1.circleArea(5.7f);
	        area1.squareArea(9);
	        //The method angleofshape() is undefined for the type Area
	        //area1.angleofshape();
	        
	        Area area2=new Area();
	        area2.circleArea(5.7f);
	        area2.squareArea(8);
	        //The method angleofshape() is undefined for the type Area
	        //area2.angleofshape();
	        //The method findradius() is undefined for the type Area
	        //area2.findradius();
	        
	        Shape shape=new Shape();
	        shape.angleofShape();
	        shape.circleArea(6.2f);
	        shape.squareArea(5);
	        //The method findradius() is undefined for the type Shape
	        //shape.findradius();
	        
	        Shape shape1=new Shape();
	        shape1.angleofShape();
	        shape1.circleArea(3.2f);
	        shape1.squareArea(4);
	        //The method findradius() is undefined for the type Shape
	        // shape1).findradius(45.78f);
	        
	   
	       // Circle circle=new Circle();
	        //circle.angleofShape();
	      //  circle.circleArea(2.11f);
	        //circle.findRadius(88.5f);
	        //circle.squareArea(3);
		}

	
		}
	


