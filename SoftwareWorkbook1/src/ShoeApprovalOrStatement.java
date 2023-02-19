public class ShoeApprovalOrStatement {
    public static void main(String[] args) {
        String shoeColor = "red";
        if (shoeColor == "red" || shoeColor == "brown") {
            System.out.println("YES! I like these shoes");
        } else {
            System.out.println("No! I want them red or brown, not " + shoeColor);
        }
    }
}

