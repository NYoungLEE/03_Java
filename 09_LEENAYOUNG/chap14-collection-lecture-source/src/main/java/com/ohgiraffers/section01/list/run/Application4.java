package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {

        /*
        * Stack 이란?
        * 후입선출(LIFO)의 자료구조로 push(), pop(), peek() 등의 메소드를 활용하여 자료를 처리할 수 있다.
        * */

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        System.out.println("peek() : " + stack.peek()); // 제일 마지막에 있는 요소 반환
        System.out.println(stack);

        System.out.println("search() : " + stack.search(2));  // 값이 어디에 있는지 확인

        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
        System.out.println("pop() : " + stack.pop());
//        System.out.println("pop() : " + stack.pop());  // 더이상 값이 없을 때 pop을 하면 EmptyStackException 발생
        System.out.println("stack : " + stack);
    }
}