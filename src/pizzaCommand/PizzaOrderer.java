package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// Using Command Design Patttern (code based on DZone Command Pattern)

//Client
public class PizzaOrderer{
  public static void main(String[] args)    {
    PizzaOrderControl control = new PizzaOrderControl();
    PizzaOrder order = new PizzaOrder();
    PizzaCommand deepDish = new DeepDishCommand(order);
    PizzaCommand thinCrust = new ThinCrustCommand(order);
    PizzaCommand hale = new HaleCommand(order);
    PizzaCommand MarcosPizza = new MarcosPizzaCommand(order);
    PizzaCommand aldo = new AldoCommand(order);    
    PizzaCommand coltenPizza = new ColtenPizzaCommand(order);  
    PizzaCommand Isaiah = new IsaiahCommand(order);
    
    // Order a deep Dish pizza
    control.setCommand(deepDish);
    control.submitOrder();

    // Order a thinCrust pizza
    control.setCommand(thinCrust);
    control.submitOrder();

    // Order a Hale pizza
    control.setCommand(hale);
    control.submitOrder();
    
    // Order a Marcos Pizza
    control.setCommand(MarcosPizza);
    control.submitOrder();
    
    // Order an Aldo pizza
    control.setCommand(aldo);
    control.submitOrder();
    
    // Order a Colten pizza
    control.setCommand(coltenPizza);
    control.submitOrder();
    
     // Order an Isaiah pizza
    control.setCommand(Isaiah);
    control.submitOrder();

  }
}


