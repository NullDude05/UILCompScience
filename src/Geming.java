public class Geming {
    int[] inputNums = {0, 1, -11};

    public void ezMath() {
        for (var pick: inputNums) {
            int result = ((pick * -1) - 1);
            System.out.println(pick + " " + result);
        }
    }
}
