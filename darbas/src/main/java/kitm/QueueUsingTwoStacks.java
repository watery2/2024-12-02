package kitm;

import java.util.LinkedList;

public class QueueUsingTwoStacks {

    private LinkedList<String> stack1 = new LinkedList<>();
    private LinkedList<String> stack2 = new LinkedList<>();

    public void enqeue (String value)
    {
        stack1.push(value);
    }

    public String dequeue()
    {
        for (int i = 0; i < stack1.size(); i++)
        {
            stack2.push(stack1.get(i));
        }

        String p = stack2.pop();
        stack2.clear();

        return p;
    }

    @Override
    public String toString()
    {
        return "stack1: " + stack1 + "\n" + "stack2: " + stack2;
    }
}
