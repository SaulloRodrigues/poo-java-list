package questao8;

import java.util.Date;

public class Transaction {
    private Double value;
    private Date date;
    private String type;

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getData() {
        return this.date;
    }

    public void setData(Date date) {
        this.date = date;
    }

}
