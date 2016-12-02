package novik.financeaccounting;

/**
 * Created by bigno on 02.12.2016.
 */

public class Transaction {
    private int id;
    private Wallet wallet;
    private int sum;
    private int day;
    private int month;
    private int year;

    public Transaction(int id, int day, int month, int year, int sum, int wallet_id, int category_id) {
        this.id = id;
        this.day = day;
        this.month = month;
        this.year = year;
        this.sum = sum;
    }
}
