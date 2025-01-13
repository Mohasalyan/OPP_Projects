import java.util.Random;

public class ButtonGameUI {
    public static void main(String[] args) {
        Random random = new Random();

        try {
            Button yellowButton = ButtonFactory.getButton(ButtonColor.YELLOW);
            yellowButton.setPosition(random.nextInt(800), random.nextInt(600));
            yellowButton.render();

            Button blueButton = ButtonFactory.getButton(ButtonColor.BLUE);
            blueButton.setPosition(random.nextInt(800), random.nextInt(600));
            blueButton.render();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
