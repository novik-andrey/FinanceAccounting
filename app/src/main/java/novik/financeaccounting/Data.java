package novik.financeaccounting;

import java.util.ArrayList;

/**
 * Created by bigno on 02.12.2016.
 */

public class Data {
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private ArrayList<Wallet> wallets = new ArrayList<>();
    private int dayCount;

    private static Data instance = new Data();
    private Data() {
    }

    public static Data getInstance() {
        return instance;
    }
}
