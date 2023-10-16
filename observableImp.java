import java.util.ArrayList;
import java.util.List;

public class observableImp implements observable{

    List<observer> observers=new ArrayList<>();
    List<Item> items=new ArrayList<>();
    @Override
    public void attach(observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify_all() {
        observers.forEach(observer -> observer.update(items.size(), calculateTotalPrice()));
    }

    @Override
    public void addItem(Item item) {
        System.out.println("---- Item Added----");
       items.add(item);
       notify_all();
    }

    @Override
    public void deleteItem(Item item) {
        System.out.println("---- Item Deleted----");

        items.remove(item);
        notify_all();
    }
    private double calculateTotalPrice() {
        double total = 0.0;

        // Check for null and handle it if necessary
        if (items != null) {
            total = items.stream()
                    .mapToDouble(item -> item.getPrice())
                    .sum();
        }

        return total;
    }
}
