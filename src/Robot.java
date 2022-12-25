public class Robot {
    MarketProvider marketProvider= new MarketProvider();

    TradingProvider tradingProvider= new TradingProvider();
    public int Buy(String sym,int pri,int vol){
        return tradingProvider.SendOrders(sym, pri, vol, true);
    }
    public int Sell(String sym,int pri,int vol){
        return tradingProvider.SendOrders(sym, pri, vol, false);
    }
    public boolean Cancel(int id) {
        return tradingProvider.CancelOrder(id);
    }
    public void MarketInfo() {
        if (tradingProvider.HaveOrders()) {
            System.out.println("Current price: " + marketProvider.onMarketUpdate());
        } else {
            System.out.println("No have orders");
        }
    }
    public void ShowOrders(){
        if(tradingProvider.HaveOrders())
            tradingProvider.ShowAllOrders();
        else {
            System.out.println("No orders");
        }

    }
}
