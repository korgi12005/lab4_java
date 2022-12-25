public class Order {
    private String symb;
    private int pri;
    private int vol;
    private int index;
    private boolean oper;
    public Order(String symb, int pri, int vol, boolean oper, int index) {
        this.symb = symb;
        this.pri=pri;
        this.vol = vol;
        this.oper = oper;
        this.index = index;
    }

    public String getSymb() {
        return symb;
    }

    public int getPri() {
        return pri;
    }



    public int getVol() {
        return vol;
    }


    public int getIndex() {
        return index;
    }


    public String GetOper(boolean oper) {
        if(oper==true)
            return "Buy";
        else
            return "Sell";
    }

    @Override
    public String toString() {
        return "Order{" +
                "symb='" + symb + '\'' +
                ", pri=" + pri +
                ", vol=" + vol +
                ", index=" + index +
                ", oper=" + oper +
                '}';
    }
}
