package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.Triangle;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Hexagon;

public class ShapeFactory {	
	static Shape create(RegularShapeType type) {
		Shape figura=null;

		switch(type){
			case Triangle :
	      			figura= new Triangle();

   			case Quadrilateral :
      				figura= new Quadrilateral();

		   	case Pentagon :
      				figura= new Pentagon();

		   	case Hexagon :
      				figura= new Hexagon();

		   	default : 
      				figura= new Triangle();

		}
		return figura;
	}
}