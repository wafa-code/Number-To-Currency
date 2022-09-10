import java.text.NumberFormat;

public class NumberToCurrency {

// Convert Number to Algerian Currency ----> Example: 600000000 ==> 600,000,000.00 DZD
  public static String NumtoCurrency(Number money){
    String value = "";
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    String moneyString = formatter.format(money);
    if(moneyString.contains("€") || moneyString.contains("$")) {
      value=moneyString.replace("€","");
      value=moneyString.replace("$","");
      value=value+" DZD";
    }
    return value;
}  

public static void main(String[] args) {
    // Convert Number to Algerian Currency
    System.out.println("Currency : "+NumtoCurrency(600000000));
}
}
