enum ButtonColor {
    YELLOW, BLUE, GREEN
}

class Button {
    private final ButtonColor color;
    private int x;
    private int y;

    public Button(ButtonColor color) {
        this.color = color;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void render() {
        System.out.println("Rendering " + color + " button at position (" + x + ", " + y + ")");
    }

    public ButtonColor getColor() {
        return color;
    }
}
