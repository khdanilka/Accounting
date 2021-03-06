package stat.khdanapp.com.accounting;


import java.util.ArrayList;
import java.util.List;

public final class TransactionList implements SumInterface {

    private static TransactionList instance;
    private BDmapper bd;
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

    public void setBd(BDmapper bd) {
        this.bd = bd;
    }

    private List<Transaction> listT = new ArrayList<>();

    public void add(Transaction t){
        listT.add(t);
    }

    public void delete(Transaction t){
        listT.remove(t);
    }

    public Transaction findTransaction(int id){
        for(Transaction t: listT){
            if (t.getId() == id) return t;
        }
        Transaction t1 = bd.findByTrId(id);
        if (t1 != null) return t1;
        return null;
    }


    @Override
    public double getSum() {
        double m = 0;
        for(Transaction t: listT){
            m += t.getSum();
        }
        return m;
    }

    protected  void notifyChangeCurrency(String  arg){
        for(Observer  observer  :  listT )  {
            observer.updateCurrency(arg); }
    }
}
