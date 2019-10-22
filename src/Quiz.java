public class Quiz {
    public static void main(String[] args) {
        /*
        문제. while 문을 사용해서 1~100까지 숫자 중 3의 배수를 추출하시오(for문은 사용금지)
        for뮨의 경우
        for(i = 1 ; i <101; i ++)

        int i=33 ;
        while ( i-- > 0 ) {
                System.out.println(3*i);
            }
        */
        int i = 1 ;
        while (i ++ < 101) {
            if(i%3 == 0) {
                System.out.println("i = " + i) ;
            }
        }

        int i3 ;
        for (i3 = 1 ; i3 ++< 101; ) {
            if(i3%3 == 0) {
                System.out.println("i3 = "+ i3) ;
            }
        }

        int i2 = 1 ;
        while(i2 < 101) {
            if(i2%3 == 0) {
                System.out.println("i2 = " + i2);
            }
            i2++ ;
        }
        /*숙제. 아래와 같은 수열이 존재한다.
        while문 사용
        1 1 3 4 5 8 12 17 25 37 ...
        키보드 입력을 받아 몇번째 항까지 합치기(sigmo)를 수행할지 정한다
        합치기 결과를 출력하시오
         */
    }
}
