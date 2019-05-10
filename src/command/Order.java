package command;

/**
 * This is the Command interface. Its implementations need to take an instance
 * of the Receiver (the thing that gets commanded).
 */
public interface Order {

    void execute();
    
    /**
     * Add method to undo.  This can be used in the BuyStock and SellStock classes.
     */
    void undo();
    
}
