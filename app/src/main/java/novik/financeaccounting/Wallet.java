package novik.financeaccounting;

/**
 * Created by bigno on 02.12.2016.
 */

public class Wallet {
    private int id;
    private String name;
    private int sum_remainder;

    public Wallet(int id, String name, String currency, int sum_remainder, int type) {
        this.id = id;
        this.name = name;
        this.sum_remainder = sum_remainder;
    }
}