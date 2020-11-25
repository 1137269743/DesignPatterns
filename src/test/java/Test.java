/**
 * @Author Flagship
 * @Date 2020/11/20 23:04
 * @Description 比较三目运算符和if else
 */
public class Test {
    public static void main(String[] args) {
        int max = 100;

        long startTime1 = System.nanoTime();
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100000000; i++) {
                max = max > i%2 ? 0 : 1;
            }
        }
        long endTime1 = System.nanoTime();
        System.out.println("Time1: " + (endTime1 - startTime1));

        long startTime2 = System.nanoTime();
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100000000; i++) {
                if (max > i % 2) {
                    max = 0;
                } else {
                    max = 1;
                }
            }
        }
        long endTime2 = System.nanoTime();
        System.out.println("Time2: " + (endTime2 - startTime2));

    }
}
