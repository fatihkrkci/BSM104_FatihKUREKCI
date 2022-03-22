package week_4;

import java.util.Scanner;

public class StockMain {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        
        System.out.println("ilk magaza ismi: ");
        String store1 = console.next();
        Stock stock1 = new Stock(store1);
        int profit1 = makePurchases(stock1, console);
        
        System.out.println("ikinci magaza ismi: ");
        String store2 = console.next();
        Stock stock2 = new Stock(store2);
        int profit2 = makePurchases(stock1, console);
        
        if(profit1>profit2){
            System.out.println(store1 + " daha yararlý");
        }
        else if(profit2>profit1){
            System.out.println(store2 + " daha yararlý");
        }
        else{
            System.out.println("eþittir");
        }
    }
    
    
    public static int makePurchases(Stock currentStock, Scanner console){
        System.out.println("kaç kez satýn alma yaptýn");
        int numPurchases = console.nextInt();
        
        for(int i=1;i<=numPurchases;i++){
            System.out.println(i + " alýmda kaç tane aldýn - birim fiyat?");
            int numShares = console.nextInt();
            int priceShare = console.nextInt();
            currentStock.purchase(numShares, priceShare);
        }
        System.out.println("güncel birim fiyat");
        int currentPrice = console.nextInt();
        
        int profit = currentStock.getProfit(currentPrice);
        System.out.println("net kazanc/kayýp: " + profit + " TL");
        System.out.println();
        
        return profit;
    }
}
