package behavioral_pattern.state_pattern;

public class Canvas {
    private Tool currentTool;

    public void mouseUp(){
        currentTool.mouseUp();
    }

    public void mouseDown(){
        currentTool.mouseDown();
    }

    public void setCurrentTool(Tool tool){
        this.currentTool = tool;
    }
}
