package stat.khdanapp.com.accounting;


import java.text.SimpleDateFormat;

public class Transaction implements SumInterface, Observer {

    private int id;
    private Double sum;
    private SimpleDateFormat dateTime;
    private String currency = "us";

    @Override
    public double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public SimpleDateFormat getDateTime() {
        return dateTime;
    }

    public void setDateTime(SimpleDateFormat dateTime) {
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void updateCurrency(String currency) {
        this.currency = currency;
    }
}
