import java.util.LinkedList;

public class StackName {
    public static void main (String [] args){
        LinkedList<String> PronounceMyName = new LinkedList<>();
        PronounceMyName.push ("A");
        PronounceMyName.push ("H");
        PronounceMyName.push ("D");
        PronounceMyName.push ("R");
        PronounceMyName.push ("A");
        PronounceMyName.push ("M");

        System.out.println("Linked List : " + PronounceMyName);
        System.out.println("stack size : " + PronounceMyName.size());

        while (!PronounceMyName.isEmpty())
            System.out.println(PronounceMyName.pop());
        System.out.println("Linked List : " + PronounceMyName);
    }
}