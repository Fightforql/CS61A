package lec2;

class Loops_andArrays {
    public static int haha() {
        int vals[] = { 1, 2, 3, 4 };
        int minIdx = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] < vals[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static void main(String[] arguments) {
        System.out.println(haha());
    }
}