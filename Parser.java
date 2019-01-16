import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Parser {
    public static void main ( String [] args ) {
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setNamespaceAware(true);
            SAXParser saxParser = spf.newSAXParser();
            XMLReader xmlrdr = saxParser.getXMLReader();
            ShapesReader noterdr = new ShapesReader();
            xmlrdr.setContentHandler(noterdr);
            xmlrdr.parse("file:C:/Users/ksobtafoalambong20/Desktop/shapes.xml");

        ArrayList<Circle> ac = noterdr.getCircle();
        for (Circle c: ac)
        {
            System.out.printf(" Circle ID: %s, radius: %s, color: %s \n", c.ID,c.radius, c.color);
        }

        ArrayList<Square> as = noterdr.getSquare();
        for (Square s: as)
        {
            System.out.printf("Square ID: %S, side: %s, color: %s \n", s.ID,s.side,s.color);
        }

        ArrayList<Rectangle> ar = noterdr.getRectangle();
        for (Rectangle r: ar)
        {
            System.out.printf("Rectangle ID: %s, length: %s, width: %s, color: %s \n",r.ID,r.length,r.width,r.color);
        }

        ArrayList<Triangle> at = noterdr.getTriangle();
        for (Triangle t:at)
        {
            System.out.printf("Triangle ID: %s, side1: %s, side2: %s, side3: %s, color: %s \n", t.ID, t.side1,t.side2, t.side3, t.color);
        }


          } 

        catch (Exception ex) { System.out.printf("Failed ");}

//rest of code 



    }
}
