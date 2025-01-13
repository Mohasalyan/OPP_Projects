import java.util.Random;

public class DocumentViewer {

    public static void main(String[] args) {
        TextDocument textDocument = new TextDocument();


        String s = "Hello World This Is A Test";
        String[] toWrite = s.split(" ");


        for (String word : toWrite) {
            textDocument.write(word + " ");
            textDocument.print();
        }

        System.out.println("Performing undo operations:");
        for (int i = 0; i < 3; i++) {
            textDocument.undo();
            textDocument.print();
        }

        System.out.println("Performing redo operations:");
        for (int i = 0; i < 2; i++) {
            textDocument.redo();
            textDocument.print();
        }
    }
}
