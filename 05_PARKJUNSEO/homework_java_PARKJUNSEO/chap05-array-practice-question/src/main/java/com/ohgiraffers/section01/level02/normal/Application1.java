package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         * */

        /* 문자열 클래스에서 제공하는 length(), charAt() */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String str = sc.nextLine();
        char[] cArr = new char [str.length()];
        for (int i = 0 ; i < str.length() ; i++) {
            cArr[i] = str.charAt(i);
        }

        System.out.print("찾을 문자를 하나 입력하세요 : ");
        char ch = sc.next().charAt(0);
        int sum = 0;
        for (int i = 0 ; i < str.length() ; i++) {
            if (ch == cArr[i]) {
                sum += 1;
            }
        }

        System.out.println("입력하신 문자열 " + str + "에서 찾으시는 문자 " + ch + "은 " + sum + "개입니다.");


    }
}
