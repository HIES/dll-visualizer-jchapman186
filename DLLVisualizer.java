import bridges.connect.Bridges;
import bridges.connect.Bridges;
import bridges.base.DLelement;
/**
 * A class that utilizes the BRIDGES library to visualize a doubly-linked list.
 *
 * @author John Chapman
 */
public class DLLVisualizer
{
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{

        // TO DO: Define credentials
        final String API_KEY = "1167872066663";
        final String USER_ID = "jchapman186";
        
        // No need to modify Bridges constructor
        Bridges bridge = new Bridges(1, API_KEY, USER_ID);

        // TO DO: Build the objects to be added to your DLL
        Track track1 = new Track("Sam", "Ragu God Mr.Glaze");
        Track track2 = new Track("walks","Framedogg");
        Track track3 = new Track("to","Cage the Forrestal");
        Track track4 = new Track("school","John TaylorSwift");
        

        // TO DO: Build the head 
        DLelement head = new DLelement(track1.toString(), track1);
        
        // TO DO: Create the rest of the Nodes/DLelements and link them to form a DLL
        DLelement part2 = new DLelement(track2.toString(), track2);
        DLelement part3 = new DLelement(track3.toString(), track3);
        DLelement part4 = new DLelement(track4.toString(), track4);
        
        head.setNext(part2);
        part2.setNext(part3);
        part3.setNext(part4);
        
        part4.setPrev(part3);
        part3.setPrev(part2);
        part2.setPrev(head);
        
        //Prepare for visualization
        bridge.setDataStructure(head);
        bridge.setTitle("A Doubly-Linked List");
        bridge.visualize();

    }
}
