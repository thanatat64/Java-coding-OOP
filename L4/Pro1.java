public class Pro1 {
    static Stock stock;
    public static void main(String[] args) {
       stock = new Stock("ORCL","Oracle Coperation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.println("Symbol: " + stock.symbol);
        System.out.println("Name: "+stock.name);
        System.out.println("Previous Closing Price: "+stock.previousClosingPrice);
        System.out.println("Current Price: "+ stock.currentPrice);
        System.out.println("Price change: "+ stock.getChangePercent());
    }   
}
class Stock{
    String symbol;
    String name;
    Double previousClosingPrice;
    Double currentPrice;
    public Stock(String symbol,String name){
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercent(){
        return (currentPrice-previousClosingPrice)/previousClosingPrice* 100;
    }

}