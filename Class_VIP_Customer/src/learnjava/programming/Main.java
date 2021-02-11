package learnjava.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());
        System.out.println(customer1.getLimit());

        VipCustomer customer2 = new VipCustomer(3000,"buddi@email.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getLimit());

        VipCustomer customer3 = new VipCustomer("Kanna",1000,"kanna@email.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getLimit());
    }
}
