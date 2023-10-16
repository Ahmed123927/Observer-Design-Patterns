public interface observable {
    void attach(observer observer);
    void detach(observer observer);
    void notify_all();
   void addItem(Item item);
   void deleteItem(Item item);
}
