public class Variable {
    public static void main(String[] args) {
        int a; //integer, 정수
        a = 1;
        System.out.println(a+1); //2
        System.out.println(a+2); //3

        a = 2;
        System.out.println(a+2); //4

        double b = 1.1; //double, 실수
        System.out.println(b+1); //2.1

        b = 2.1;
        System.out.println(b+1.1); //3.2

        String first = "Hayeong"; //Stirng, 문자열
        System.out.println(first+" "+"Kim");

        String c, d;
        c = "Hayeong";
        d = "Kim";
        System.out.println(c+" "+d);

        //단순한 사칙연산을
        System.out.println(100 + 10);
        System.out.println((100 + 10) / 10);
        System.out.println(((100 + 10) / 10) - 10);
        System.out.println((((100 + 10) / 10) - 10) * 10);

        //변수를 활요한다면?
        int e = 100;
        int f = 10;

        System.out.println(e + f);
        System.out.println((e + f) / f);
        System.out.println(((e + f) / f) - f);
        System.out.println((((e + f) / f) - f) * f);

        //수정할 때 로직을 그대로 두고 변수의 정수만 수정해준다면 좀더 편하다

        //*자바 스크립트에서는 정수와 실수를 구분하지 않는다



    }
}
