public class Grocery{
    public static void main(String[] args) {
        String [] groceryItems = {"bananas", "mangoes", "apples", "pens", "books", "cabbages"};
        Integer [] groceryPrices = {2, 3, 4, 5, 6, 7};

        for (String individualGroceryItems : groceryItems){
            System.out.println(individualGroceryItems);
        }
        Integer total = 0;
        for (Integer prices : groceryPrices){
            System.out.println(prices);
            total = total + prices;
        }
        System.out.println("your total is "+" "+total);
    }
}