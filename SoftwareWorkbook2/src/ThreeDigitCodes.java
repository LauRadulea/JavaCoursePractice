public class ThreeDigitCodes {
    public static void main(String[] args) {
    int codeNo = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if( j != i) {
                    for (int k = 1; k <= 4; k++) {
                        if (k != i && k != j ) {
                            System.out.println(i + " " + j + " " + k);
                            codeNo++;
                        }
                    }
                }
            }
        }
        System.out.println(codeNo);
    }
}
