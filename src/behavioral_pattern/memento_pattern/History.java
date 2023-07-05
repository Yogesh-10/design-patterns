package behavioral_pattern.memento_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class History {
    private Stack<EditorState> states = new Stack<>();

    public void push(EditorState state){
        states.push(state);
    }

    public EditorState pop(){
        return states.pop();
    }
}
