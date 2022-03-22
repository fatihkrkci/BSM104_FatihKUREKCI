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
            System.out.println(store1 + " daha yararl�");
        }
        else if(profit2>profit1){
            System.out.println(store2 + " daha yararl�");
        }
        else{
            System.out.println("e�ittir");
        }
    }
    
    
    public static int makePurchases(Stock currentStock, Scanner console){
        System.out.println("ka� kez sat�n alma yapt�n");
        int numPurchases = console.nextInt();
        
        for(int i=1;i<=numPurchases;i++){
            System.out.println(i + " al�mda ka� tane ald�n - birim fiyat?");
            int numShares = console.nextInt();
            int priceShare = console.nextInt();
            currentStock.purchase(numShares, priceShare);
        }
        System.out.println("g�ncel birim fiyat");
        int currentPrice = console.nextInt();
        
        int profit = currentStock.getProfit(currentPrice);
        System.out.println("net kazanc/kay�p: " + profit + " TL");
        System.out.println();
        
        return profit;
    }
}
