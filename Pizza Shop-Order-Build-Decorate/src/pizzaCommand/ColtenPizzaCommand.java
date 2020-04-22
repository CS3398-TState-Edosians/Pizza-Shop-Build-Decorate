package pizzaCommand;

public class ColtenPizzaCommand {
    PizzaOrder order;
    public ColtenPizzaCommand(PizzaOrder order){
        this.order = order;
    }
    public void execute(){
        order.bakeColtenPizza();
    }
}
