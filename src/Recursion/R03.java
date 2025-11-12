public class R03 {

    public void recursion3() {

        Integer a = 23;
        Integer b = 85;
        System.out.println(multiplicacionRecursiva(a, b));

    }

    public static Integer multiplicacionRecursiva(int a, int b) {

        if (b == 0) {
            return 0;
        }
        if (b == 1 || b == -1) {
            return a;
        }
        if (b < 0) {
            return -(multiplicacionRecursiva(a, Math.abs(b)));
        }
        return a + multiplicacionRecursiva(a, b - 1);
    }
}
