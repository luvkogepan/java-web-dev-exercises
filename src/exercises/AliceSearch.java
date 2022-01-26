package exercises;

import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args) {
        String paragraph= "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input= new Scanner(System.in);
        System.out.println("Search term: ");
        String term= input.nextLine();
        boolean found= paragraph.toLowerCase().contains(term.toLowerCase());
        System.out.println("Term found: "+ found);

            int index= paragraph.toLowerCase().indexOf(term.toLowerCase());
            System.out.println("Location: "+index);
            System.out.println("Length: "+ term.length());

            //String modifiedParagraph= paragraph.replace(term, "");
            String modifiedParagraph= paragraph.substring(0, index)+ paragraph.substring(index+ term.length());
            System.out.println("sentence with your term removed: "+modifiedParagraph);
    }
}
