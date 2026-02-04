public class Problem2 {
    public static void main(){
        final double fuel_price = 12000;
        double distance = 570;
        double feul_needed = distance/100*8.5;
        double total_price = feul_needed*fuel_price;
        System.out.printf("Distance %.2f\nFuel needed %.2f Liters\nTotal price of fuel: %.2f UZS",distance,feul_needed,total_price);
    }
}