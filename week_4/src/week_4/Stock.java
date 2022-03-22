package week_4;

public class Stock {
    
    private String store;
    private int totalProduct;
    private int totalCost;
    
    public Stock(String theStore){
        if(theStore==null){
            throw new NullPointerException();
        }
        store = theStore;
        totalProduct = 0;
        totalCost = 0;
    }
    
    public int getProfit(int currentPrice){
        if(currentPrice<0){
            throw new NullPointerException();
        }
        
        int marketValue = totalProduct * currentPrice;
        return marketValue - totalCost;
    }
    
    public void purchase(int shares, int pricePerShare){
        if(shares<0 || pricePerShare<0){
            throw new IllegalArgumentException();
        }
        
        totalProduct += shares;
        totalCost += shares * pricePerShare;
    }
}
