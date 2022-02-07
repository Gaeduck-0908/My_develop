package tutorial.ch01.ex_array;

public class Main {
    public static void main(String[] args) {
// 1학년 1반
        int[] korean_1_1 = {100, 90, 50, 30, 99, 75, 99, 21, 55, 88};
        int[] english_1_1 = {45, 90, 30, 77, 99, 60, 88, 99, 22, 45};
        int[] math_1_1 = {99, 78, 92, 79, 90, 89, 85, 83, 71, 69};
// 1학년 2반
        int[] korean_1_2 = {90, 90, 50, 30, 79, 65, 99, 11, 25, 78};
        int[] english_1_2 = {45, 30, 90, 67, 99, 60, 48, 99, 12, 15};
        int[] math_1_2 = {33, 78, 92, 19, 10, 89, 85, 93, 71, 29};

// 설계도를 바탕으로 객체 생성함
        Test test_1_1 = new Test(korean_1_1, english_1_1, math_1_1);
        Test test_1_2 = new Test(korean_1_2, english_1_2, math_1_2);

// 1학년 1반
        System.out.printf("1-1 국어 점수 평균 : %.2f\n", test_1_1.getAverage(test_1_1.getTotal(test_1_1.korean), test_1_1.korean.length));
        System.out.printf("1-1 영어 점수 평균 : %.2f\n", test_1_1.getAverage(test_1_1.getTotal(test_1_1.english), test_1_1.english.length));
        System.out.printf("1-1 수학 점수 평균 : %.2f\n", test_1_1.getAverage(test_1_1.getTotal(test_1_1.math), test_1_1.math.length));
// 1학년 2반
        System.out.printf("1-2 국어 점수 평균 : %.2f\n", test_1_2.getAverage(test_1_2.getTotal(test_1_2.korean), test_1_2.korean.length));
        System.out.printf("1-2 영어 점수 평균 : %.2f\n", test_1_2.getAverage(test_1_2.getTotal(test_1_2.english), test_1_2.english.length));
        System.out.printf("1-2 수학 점수 평균 : %.2f\n", test_1_2.getAverage(test_1_2.getTotal(test_1_2.math), test_1_2.math.length));
    }
}

// 객체 지향 클래스 (설계도)
class Test {
    int[] korean;
    int[] english;
    int[] math;

    public Test(int[] k, int[] e, int[] m) { //초기화
        korean = k;
        english = e;
        math = m;
    }

    public int getTotal(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++)
            total += values[i];
        return total;
    }

    public double getAverage(int total, int count) {
        return (double) total / (double) count;
    }
}