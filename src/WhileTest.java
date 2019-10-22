import java.util.Scanner ;

public class WhileTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;

        System.out.println("몇 번 반복할까요 ? ");
        int num = in.nextInt() ;
        /*
        while은 말 그대로
        ~을 하는 한을 그대로 보여주는 구문이다.
        < while을 사용하는 방법 >
        1. 일단 반복이 필요한 부분에 while()을 적는다
        2. 조건을 괄호 안에 적는다
        3. block 안에 조건이 만족된 경우 동작할 반복 패턴을 작성한다
         */
        /*전위연산자와 후위연산자
        전위연산자 : 먼저 계산을 하게된다.
        (그 어떤 무엇보다도 계산이 먼저 진행됨.)
        후위 연산자 : 경우 계산은 나중에 적용된다)
        나중이란 의미는다음 줄을 진행하기 전에 진행한다
         */
        while(--num > 0) {
            System.out.println("바안보옥");
        }


    }
}
