public class Abdul {
    int n;

    int[] randomNum = {3, 4, 7};

    public void abdulMethod() {

        for(int pick: randomNum) {
            n = (int) Math.pow(pick, 2);
            System.out.println(n);
        }
    }
}