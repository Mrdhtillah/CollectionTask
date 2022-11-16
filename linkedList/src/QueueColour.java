import java.util.LinkedList;
import java.util.Queue;

public class QueueColour<S> {

    public static void main (String[] args){
        Queue<String> LikeColour = new LinkedList<String>();
        Queue<String> DislikeColour = new LinkedList<String>();

        LikeColour.add("red");
        LikeColour.add("blue");
        LikeColour.add("yellow");
        LikeColour.add("green");
        DislikeColour.add("brown");

        System.out.println(LikeColour);

    }

}