import java.util.ArrayList;
import java.util.List;

class Memento {
    private List<String> states = new ArrayList<>();
    private int currentStateIndex = -1;

    public void saveState(String state) {
        if (currentStateIndex < states.size() - 1) {
            states = states.subList(0, currentStateIndex + 1);
        }
        states.add(state);
        currentStateIndex++;
    }

    public String getPreviousState() {
        if (currentStateIndex > 0) {
            currentStateIndex--;
            return states.get(currentStateIndex);
        }
        return null;
    }

    public String getNextState() {
        if (currentStateIndex < states.size() - 1) {
            currentStateIndex++;
            return states.get(currentStateIndex);
        }
        return null;
    }
}
