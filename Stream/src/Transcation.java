public class Transcation {
    Trade t;
    int year;
    int value;
    public Transcation(Trade t, int year, int value) {
        super();
        this.t = t;
        this.year = year;
        this.value = value;
    }
    public Trade getT() {
        return t;
    }
    public void setT(Trade t) {
        this.t = t;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Transaction [t=" + t + ", year=" + year + ", value=" + value + "]";
    }


}

