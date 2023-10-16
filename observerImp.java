public class observerImp implements observer {

    @Override
    public void update(int itemCount, double amount) {
        System.out.println("Total Price Display - Items: " + itemCount + ", Total Price: $" + amount);

    }
}

