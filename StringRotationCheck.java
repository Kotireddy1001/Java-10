//Check if One String is a Rotation of Another
public class StringRotationCheck {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("Yes, it is a rotation.");
        } else {
            System.out.println("No, it is not a rotation.");
        }
    }
}
