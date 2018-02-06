package stat.khdanapp.com.accounting;


import java.text.SimpleDateFormat;

public class Transaction implements SumInterface {

    private Double sum;
    private SimpleDateFormat dateTime;

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
}
