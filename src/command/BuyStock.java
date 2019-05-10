package command;

/**
 * This class is a command: it implements the Order interface.
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
    
    /**
     * The undo of a "buy" is a "sell"
     */
    @Override
    public void undo() {
        abcStock.sell();
    }
    
}
