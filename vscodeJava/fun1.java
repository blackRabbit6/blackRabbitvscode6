package vscodeJava;

public class fun1 {
    public static void main(String[] args) {
        // 더하기, 빼기, 곱하기, 나누기 함수
        int iValue01 = 1; int iValue02 = 2;
        int iResult01 = 0;
        iResult01 = add(iValue01, iValue02); 
        System.out.println("더하기: " + iResult01);
        
        //빼기
        int iValue03 = 4; int iValue04 = 2;
        int iResult02 = 0;
        iResult02 = sub(iValue03, iValue04); 
        System.out.println("빼기: " + iResult02);

        //곱하기
        int iValue05 = 4; int iValue06 = 5;
        int iResult03 = 0;
        iResult03 = mul(iValue05, iValue06); 
        System.out.println("곱하기: " + iResult03);

        //나누기
        double iValue07 = 10; double iValue08 = 4;
        double iResult04 = 0;
        iResult04 = div(iValue07, iValue08); 
        System.out.println("나누기: " + iResult04);
    }
    // 더하기 함수
    public static int add(int iValue01, int iValue02){
        int iResult01 = 0;
        iResult01 = iValue01 + iValue02;
        return iResult01;
    }
    // 빼기 함수
    public static int sub(int iValue03, int iValue04){
        int iResult02 = 0;
        iResult02 = iValue03-iValue04;
        return iResult02;
    }
    // 곱하기 함수
    public static int mul(int iValue05, int iValue06){
        int iResult03 = 0;
        iResult03 = iValue05*iValue06;
        return iResult03;
    }
    // 나누기 함수
    public static double div(double iValue07, double iValue08){
        double iResult04 = 0;
        iResult04 = iValue07 / iValue08;
        return iResult04;
    }
}
