public class Main {
    public static void main(String[] args) {

    Item item=new Item("Mobile",1000);
    Item item2=new Item("charger",30);

    observableImp observable=new observableImp();
    observerImp observer=new observerImp();



    observable.attach(observer);
    observable.addItem(item);
    observable.addItem(item2);
    observable.deleteItem(item2);





    }
}