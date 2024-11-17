package Synchronization.table;

public class TableMain {

    public static void main(String[] args) {
        Table table = new Table();
        TableThread thread1 = new TableThread(table,3);
        TableThread thread2 = new TableThread(table,4);
        thread1.start();
        thread2.start();
    }
}
