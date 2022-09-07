package comportamentali.command;

import java.util.Deque;
import java.util.LinkedList;

public class Esecutore {

    private final Deque<Command> undoStack = new LinkedList<>();
    private final Deque<Command> redoStack = new LinkedList<>();

    public Esecutore(){
    }

    public void esegui(Command command){
        command.doCommand();
        undoStack.offerLast(command);
    }

    public void undoLastEsecuzione(){
        if(!undoStack.isEmpty()){
            Command previous = undoStack.pollLast();
            redoStack.offerLast(previous);
            previous.undoCommand();
        }
    }
    public void ripetiLastEsecuzione(){
        if(!redoStack.isEmpty()){
            Command previous = redoStack.pollLast();
            undoStack.offerLast(previous);
            previous.doCommand();
        }
    }
}
