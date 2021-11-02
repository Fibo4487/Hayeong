public class Basic {
    public static void main(String[] args) {
    //숫자
        //따옴표가 없는 숫자는 숫자로 인식
        System.out.println(1+1); //2
        System.out.println(1*2);
        System.out.println(3-1);
        System.out.println(4/2);

    //문자와 문자열
        //자바는 문자(Character)와 문자열(String)을 구분한다 문자는 작은 따옴표 문자열은 큰 따옴표
        //문자는 한글자, 문자열은 여러개의 문자조합
        System.out.println('하');
        System.out.println("하영");
        //System.out.println('하영'); '하'와 '영' 이라는 문자의 조합을 작은 따옴표로 감쌋으므로 에러
        System.out.println("하"); //한글자도 문자열이 될수 있으므로 에러가 발생하지는 않는다

        //문자에도 연산자+ 사용가능
        System.out.println("Hayeong"+"Kim");

    //이스케이프
        //큰따옴표를 문자열안에 넣고싶은 경우?
        System.out.println("Fibo said \"Hayeong Kim\"");

        //특수문자 앞에 \ 입력시 이스케이프되는 것
        System.out.println("Fibo\\Kim\\Hayeong");

        //여러줄을 표현하고 싶을 때에도 사용
        System.out.println("김\n하\n영");

    //주석
        //주석은 프로그래밍적으로 해석되지 않는다
        /*
        여러줄
        주석
        표현하는법
         */
        /**
         * JavaDoc 주석은 자바의 문서를 만들 때 사용한다.
         */

    //세미콜론
        //문자의 끝을 의미하는 세미콜론 한줄에 여러개의 세미콜론을 사용할수도 있다
        int a = 10; double b = 1.1;




    }
}
