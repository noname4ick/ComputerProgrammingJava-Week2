public class Problem8 {
    public static void main(){
        double populatin = 100000;
        double rate = 1.05;
        int count = 0;
        while(populatin <= 200000){
            populatin = populatin * 1.05;
            count++;
            System.out.printf("Year %d : %.0f\n",count,populatin);
        }
        System.out.println("It takes "+count+" years to reach 200,000 people");
    }
}