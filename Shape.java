
/**
* This interface models the characteristics of a shape
* @author Karen Sobtafo
* @version 1.00, 15 January 2019
*/
public interface Shape {

    String toString();
    //return the kind and ID of the shape 
    String getKind();
    //return the kind of shape 
    String getDetailString();
    //return the details of that shape (including kind, ID, properties, area, perimeter) –  displayed 
    int getID();
    //return the ID of the shape
}


