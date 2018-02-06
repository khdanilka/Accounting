package stat.khdanapp.com.accounting;


import java.util.ArrayList;
import java.util.List;

public final class TransactionList implements SumInterface {

    private static TransactionList instance;
    private TransactionList(){
    }

    public static TransactionList getInstance(){
        if (instance == null) {
            synchronized (TransactionList.class) {
                if (instance == null) {
                    instance = new TransactionList();
                }
            }
        }
        return instance;
    }


    private List<Transaction> listT = new ArrayList<>();

    public void add(Transaction t){
        listT.add(t);
    }

    public void delete(Transaction t){
        listT.remove(t);
    }


    @Override
    public double getSum() {
        double m = 0;
        for(Transaction t: listT){
            m += t.getSum();
        }
        return m;
    }
}
