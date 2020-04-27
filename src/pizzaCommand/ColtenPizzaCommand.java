package patternsexamp;

public class ColtenPizzaCommand implements PizzaCommand{
    PizzaOrder order;
    public ColtenPizzaCommand(PizzaOrder order){
        this.order = order;
    }
    public void execute(){
        order.bakeColtenPizza();
    }
}
