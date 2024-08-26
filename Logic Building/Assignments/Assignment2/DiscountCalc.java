public class DiscountCalc {

    public static void main(String[] args) {
       
        double totalPurchase = 1200;  

        String membershipCardStatus = "Yes";  

        
        double discount = 0.0;

        
        if (totalPurchase >= 1000) {
            discount = 20.0;
        } else if (totalPurchase >= 500) {
            discount = 10.0;
        } else {
            discount = 5.0;
        }

        if (membershipCardStatus=="Yes") {
            discount += 5.0;
        }

        
        double discountAmount = (discount / 100) * totalPurchase;

        
        double finalPrice = totalPurchase - discountAmount;

        System.out.println("Total Purchase: Rs." + totalPurchase);
        System.out.println("Discount amount: Rs." + discountAmount);
        System.out.println("Final price after discount: Rs." + finalPrice);
    }
}
