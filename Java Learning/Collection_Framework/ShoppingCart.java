package Collection_Framework;

import java.util.*;

class Cart
{
    Scanner sc = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> itemno = new ArrayList<String>();
        ArrayList<String> price = new ArrayList<String>();
        ArrayList<String> qty = new ArrayList<String>();

    public void addItem()
    {
        System.out.print("Enter Item Name: ");
        name.add(sc.next());
        System.out.print("Enter Item Number: ");
        itemno.add(sc.next());
        System.out.print("Enter Item Price: ");
        price.add(sc.next());
        System.out.print("Enter Quantity of Item: ");
        qty.add(sc.next());
    }

    public void showItem()
    {
        System.out.println("Name \tItemNo \tPrice \tQuantity");
        System.err.println("---------------------------------");

        for(int i=0; i<itemno.size(); i++)
        {
            System.out.print(name.get(i)+"\t"+itemno.get(i)+"\t"+price.get(i)+"\t"+qty.get(i));
        }
    }

    public void updateItem()
    {
        System.out.print("What you want to Update ? ");
        int n = sc.nextInt();
        System.out.print("Enter Item Number: ");
        String in = sc.next();
        itemno.set(n,in);

        System.out.print("Enter Item Name: ");
        String in2 = sc.next();
        name.set(n, in2);

        System.out.print("Enter Item Price: ");
        String in3 = sc.next();

        price.set(n,in3);


        System.out.print("Enter Item Quantity: ");
        String in4 = sc.next();
        qty.set(n,in4);

    }

    public void deleteItem()
    {
        System.out.print("\n Enter the one you want to remove: ");
        int n = sc.nextInt();
        name.remove(n - 1);
        itemno.remove(n - 1);
        price.remove(n - 1);
        qty.remove(n - 1);
    }
    public void order(){
            System.out.println("your Shopping cart is : ");
        for (int j = 0; j < itemno.size(); ++j) {
            System.out.println("Your cart item " + (j+1) + " : ");
            System.out.print("Item Number " + itemno.get(j) + "  ");

            System.out.print("Item Name " + name.get(j)+ "  ");
            System.out.print("Item Price " + price.get(j)+ "  ");
            System.out.print("Item Quaitity " + qty.get(j)+ "  ");
            System.out.println(" ");
        }

        System.out.println("Please type your address: ");
        String adss = sc.next();
        System.out.println("Items will be delivered to your location after 2 days at "+ adss);
        System.out.println("Thank you for shopping with us!");
   }
}

class ShoppingCart
{
    public static void main(String[] args) {
        Cart obj = new Cart();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Item ");
            System.out.println("2. Item Price");
            System.out.println("3. Delete Item ");
            System.out.println("4. Update Item ");
            System.out.println("5. Order Confirmation ");

            System.out.print("Your Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    obj.addItem();
                    break;
                case 2:
                    obj.showItem();
                    break;
                case 3:
                    obj.deleteItem();
                    break;
                case 4:
                    obj.updateItem();
                    break;
                case 5:
                    obj.order();
                case 6:
                    System.exit(0);
            }
        }
    }
}