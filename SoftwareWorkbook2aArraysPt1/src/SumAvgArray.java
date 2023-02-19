public class SumAvgArray {
    public static void main(String[] args) {
        int [] myNum = {12, 22, 32, 42, 53, 61, 71, 82, 92, 10};
        int sum = 0;

        for(int i = 0; i < myNum.length; i++) {
            sum += myNum[i];
        }

        double avg = (double) sum/myNum.length;

        System.out.println("the average is " + avg);
    }
}
