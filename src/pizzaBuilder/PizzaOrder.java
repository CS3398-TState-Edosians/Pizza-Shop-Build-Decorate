package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// Using Command Design Patttern (code based on DZone Command Pattern)

//Receiver
public class PizzaOrder{
  private boolean orderReady;
  public Pizza.Builder pb;
  public Pizza p;

  public void bakeDeepDish(){
	System.out.format("Baking a deepdish... \n"); 
    pb = new Pizza.Builder("Deep Dish"); 
    p = pb.pizzas(1).build();
    reportOrder();

  }
  public void bakeThinCrust(){
  	System.out.format("Baking a thincrust... \n");
  	pb = new Pizza.Builder("Thin Crust");  
    p = pb.pizzas(1).build();
    reportOrder();
  }
  public void bakeHale(){
    System.out.format("Baking a Hale... \n");
    pb = new Pizza.Builder("Hale");  
    p = pb.pizzas(1).build();
    reportOrder();
  }
  public void bakeMarcosPizza(){
  	System.out.format("Baking a MarcosCrust... \n");
  	pb = new Pizza.Builder("MarcosCrust");  
    p = pb.pizzas(1).build();
    reportOrder();
  }
  public void bakeAldo(){
      System.out.format("Baking Aldo's pizza... \n");
      pb = new Pizza.Builder("Aldo");
      p = pb.pizzas(1).build();
      reportOrder();
  }  
	public void bakeIsaiah(){
      System.out.format("Baking Isaiah's pizza... \n");
      pb = new Pizza.Builder("Isaiah");
      p = pb.pizzas(1).build();
      reportOrder();
  }
  public void bakeColtenPizza(){
        System.out.format("Baking a Colten Pizza... \n");
        pb = new Pizza.Builder("Colten Pizza");
        p = pb.pizzas(1).build();
        p.toppings.pepperoni=true;
        p.toppings.frenchfries=true;
        reportOrder();
    }
  private void reportOrder() {
      System.out.format("\nBuilt %s - num pies: %d, pepperoni: %b, onion: %b, frenchfries %b\n", 
    	p.getName(),  
      p.getNumber(),
      p.toppings.pepperoni,
      p.toppings.onion,
      p.toppings.frenchfries );
  }
}
