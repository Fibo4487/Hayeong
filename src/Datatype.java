public class Datatype {
    public static void main(String[] args) {
        // 제일 작은 데이터의 단위는 bit
        // 8 bit = 1 byte, 1024 byte = 1 kilobyte
        /*
        데이터 타입에 따라 표현할 수 있는 정수의 범위가 다르다
        byte = 1 byte = -128 ~ 127
        short = 2 byte = -32,768 ~ 32,767
        int = 4 byte = -2,147,483,648 ~ 2,147,483,647
        long = 8 byte = -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
         */
        // 변수의 값이 적더라도 설정하는 타입의 데이터값은 절대적이다
        long A = 2147483647;
        long B = 1;
        // 이 경우 데이터의 값은 똑같이 8 byte
        // 최근에는 byte 와 short 는 잘 쓰지않고 int, long 등 을 많이쓴다 일반적으로는 int만


        // 알파벳은 아스키코드를 사용하므로 1바이트(8bit) 한글은 유니코드 사용하기 때문에 2바이트(16bit)
        // 아스키코드 변환법 (8bit)
        int a = 97; // a의 아스키코드
        System.out.println((char)a);
        char b='A';
        System.out.println((int)b); // 문자 A를 아스키코드로 변환
        //유니코드 변환법 (16bit)
        int c = 0xAC00; // 가 의 유니코드
        System.out.println((char)c);
        char d = '나';
        System.out.println((int)d); // 문자 나를 유니코드로 변환

        /*
        실수형 데이터 값 두가지
        float = 4 byte = ±(1.40129846432481707e-45 ~ 3.40282346638528860e+38)
        double = 8 byte = ±(4.94065645841246544e-324d ~ 1.79769313486231570e+308d)
         */

        /*
        문자형 데이터 값 두가지
        char = 2 byte = 모든 유니코드
        String = 6 byte
         */






    }
}
