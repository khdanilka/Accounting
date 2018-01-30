package stat.khdanapp.com.accounting;


import java.text.SimpleDateFormat;

public class Transaction {

    private Double sum;
    private SimpleDateFormat dateTime;

    public Double getSum() {
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
