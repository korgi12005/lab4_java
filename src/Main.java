public class Main {
    public static void main(String[] args) {
        Robot robot=new Robot();
        //robot.tradingProvider.orders.add(new Order("test",100,3,false,1));
        int a = robot.Buy("test",100,3);
        robot.MarketInfo();
        robot.Sell("test",100,4);
        robot.ShowOrders();
        robot.Cancel(a);
        robot.ShowOrders();
        robot.MarketInfo();
        robot.Cancel(a);
        robot.ShowOrders();
        robot.MarketInfo();
    }
}