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
   private String chars; 
   private Shape currentShape;

    public ArrayList<Circle> getCircle() {return circle;}
    public ArrayList<Rectangle> getRectangle() {return rectangle;}
    public ArrayList<Square> getSquare() {return square;}
    public ArrayList<Triangle> getTriangle() {return triangle;}


//method that checks for particular words in sml file and assigns them to values
    public void startElement (String namespaceURI, String localName, String qName, Attributes atts)
    {
        if(localName.equals("circle")) 
        {
            Circle c = new Circle();
            c.ID = atts.getValue("id");
            c.radius = atts.getValue("radius");
            c.color = atts.getValue("color");
            circle.add(c);
        }

        if (localName.equals("square"))
        {
            Square s = new Square();
            s.ID = atts.getValue("id");
            s.side = atts.getValue("side");
            s.color = atts.getValue("color");
            square.add(s);
        }

        if (localName.equals("rectangle"))
        {
            Rectangle r = new Rectangle();
            r.ID = atts.getValue("id");
            r.width = atts.getValue("width");
            r.length = atts.getValue("length");
            r.color = atts.getValue("color");
            rectangle.add(r);
        }
        if (localName.equals("triangle"))
        {
            Triangle t = new Triangle();
            t.ID = atts.getValue("id");
            t.side1 = atts.getValue("side1");
            t.side2 = atts.getValue("side2");
            t.side3 = atts.getValue("side3");
            t.color = atts.getValue("color");
            triangle.add(t);
        }
        
    }

}
