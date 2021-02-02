package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic","Sausage",3.57,"White");

        hamburger.addHamburgerAddition1("Tomato",0.28);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.12);

        System.out.println("Total Burger price is: "+hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.addHamburgerAddition1("Egg",3.47);
        healthyBurger.addHealthyAddition1("Lentils",3.41);
        System.out.println("Total healthy burger price is: "+healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Add3",2.53);
        db.itemizeHamburger();
    }
}
