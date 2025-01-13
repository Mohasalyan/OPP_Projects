import java.util.HashMap;
import java.util.Map;

class ButtonFactory {
    private static final Map<ButtonColor, Button> buttonMap = new HashMap<>();
    private static ButtonColor firstCreatedColor = null;

    public static Button getButton(ButtonColor color) {
        if (firstCreatedColor != null && !firstCreatedColor.equals(color)) {
            throw new IllegalStateException("Cannot create buttons with different colors. First color: " + firstCreatedColor);
        }

        if (firstCreatedColor == null) {
            firstCreatedColor = color;
        }

        return buttonMap.computeIfAbsent(color, Button::new);
    }
}
