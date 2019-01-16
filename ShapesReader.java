import java.util.ArrayList;
import java.lang.Object;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class ShapesReader extends DefaultHandler {
   private ArrayList<Circle> circle = new ArrayList <Circle> ();
   private ArrayList<Rectangle> rectangle = new ArrayList <Rectangle> ();
   private ArrayList<Square> square = new ArrayList <Square> ();
   private ArrayList<Triangle> triangle = new ArrayList <Triangle> ();
    
   private Shape currentShape;

    public ArrayList<Circle> getCircle() {return circle;}
    public ArrayList<Rectangle> getRectangle() {return rectangle;}
    public ArrayList<Square> getSquare() {return square;}
    public ArrayList<Triangle> getTriangle() {return triangle;}


//method that checks first words of the xml file 
    public void Element1 (String namespaceURI, String localName, String qName, Attributes atts)
    {
        if(localName.equals("circle")) 
        {
            Circle c = new Circle();
            c.Kind = atts.getValue("shape");
            circle.add(c);
        }
        else if ( localName.equals("rectangle"))
        {
            Rectangle r = new Rectangle();
            r.Kind = atts.getValue("shape");
        }
        else if ( localName.equals("square"))
        {
            Square s = new Square();
            s.Kind = atts.getValue("shape");
        }
        else if ( localName.equals("triangle"))
        {
            Triangle t = new Triangle();
            t.Kind = atts.getValue("shape");
        }
    }


}
