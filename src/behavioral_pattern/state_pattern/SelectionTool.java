package behavioral_pattern.state_pattern;

public class SelectionTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("draw a dashed rectangle");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection Icon");
    }
}
