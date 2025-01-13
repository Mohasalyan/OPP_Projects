import java.util.Stack;

class TextDocument {
    private StringBuilder content = new StringBuilder();
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    public void write(String text) {
        undoStack.push(content.toString());
        redoStack.clear();
        content.append(text);
    }

    public void print() {
        System.out.println(content.toString());
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(content.toString());
            content = new StringBuilder(undoStack.pop());
        } else {
            System.out.println("No more undo operations available.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(content.toString());
            content = new StringBuilder(redoStack.pop());
        } else {
            System.out.println("No more redo operations available.");
        }
    }
}
