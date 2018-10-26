import java.util.Random;

public class RepeatedPattern {

    String line1 = "COMPUTERSCIENCEUILISSOAWESOMED";
    String line2 = "OJAIDGFJHOIADSHGOIAHGOAHIUFAGG";
    String letterappend = "";

    String [] letters = {"S", "U", "R", "T", "O", "L"};
//            SURTOLADMNPSUYRT"


    public void RepeatLetter() {
        for (var pick: letters) {
            for (int i = 1; i <= 30; i++) {
                letterappend += pick;
                if (letterappend.length() == 30) {
                    System.out.println(letterappend + " Length: " + letterappend.length());
                    System.out.println(line1 + " Length: " + line1.length());
                    System.out.println(line2 + " Length: " + line2.length());
                    letterappend = "";
                    break;
                }

            }
        }

    }

}
