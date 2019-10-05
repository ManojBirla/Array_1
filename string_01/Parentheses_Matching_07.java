package com.nt.string_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Parentheses_Matching_07 {

	public static void main(String[] args) {
		String s = "[()]{{}}{[()()]()}";
		System.out.println(balancedPara(s));
	}

	public static boolean balancedPara(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '[' || c == '(' || c == '{') {
				stack.add(c);
			} else if (c == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			} else if (c == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			} else if (c == '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			}

		}
		return stack.isEmpty();

	}

}
