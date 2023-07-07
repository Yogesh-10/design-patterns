package behavioral_pattern.state_pattern;

public class EraserTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Eraser something");
    }

    @Override
    public void mouseDown() {
        System.out.println("Eraser Icon");
    }
}
