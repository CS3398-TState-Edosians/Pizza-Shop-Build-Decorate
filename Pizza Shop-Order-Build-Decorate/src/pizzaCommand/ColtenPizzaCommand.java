import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

public class ColtenPizzaCommand implements PizzaCommand {
    PizzaOrder order;
    public ColtenPizzaCommand(PizzaOrder order){
        this.order = order;
    }
    public void execute(){
        order.bakeColtenPizza();
    }
}
