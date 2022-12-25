import java.util.ArrayList;

public class TradingProvider {
    ArrayList<Order> orders;
    {orders=new ArrayList<>();}
    public boolean HaveOrders(){
        return !orders.isEmpty();
    }
    public int SendOrders(String symb, int pri, int vol, boolean oper){
        int index=orders.size();
        orders.add(new Order(symb,pri,vol,oper,index));
        return index;
    }
    public boolean CancelOrder(int index){
        if(orders.get(index)!=null) {
            orders.remove(index);
            return true;
        }
        else{
            return false;
        }
    }
    public void ShowAllOrders(){
        System.out.println("All orders {");
        for(Order iter:orders){
            System.out.println(iter.toString());

        }
        System.out.println("}");

    }
}
