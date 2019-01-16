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
            System.out.printf("%s\n", c.Kind);
        }
        ArrayList<Rectangle> ar = noterdr.getRectangle();
        for (Rectangle r: ar)
        {
            System.out.printf("%s\n", r.Kind);
        }
        ArrayList<Square> as = noterdr.getSquare();
        for (Square s: as)
        {
            System.out.printf("%s\n", s.Kind);
        }
        ArrayList<Triangle> at = noterdr.getTriangle();
        for (Triangle t: at)
        {
            System.out.printf("%s\n", t.Kind);
        }

          } 

        catch (Exception ex) { System.out.printf("Failed ");}
    }
}
