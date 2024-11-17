package Synchronization.table;

public class TableThread extends Thread{

    Table table;
    int tableNo;

    TableThread(Table table, int n){
        this.table = table;
        this.tableNo = n;
    }

    @Override
    public void run(){
        table.printTable(tableNo);
    }
}
