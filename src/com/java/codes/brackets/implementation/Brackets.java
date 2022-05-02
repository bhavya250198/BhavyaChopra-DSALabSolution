package com.java.codes.brackets.implementation;
import java.util.*;
public class Brackets {
		public boolean showBalanced(String str) {
			int n = str.length();
			char ch[] = new char[n];
			int count=0;
//			int half = n/2;
			boolean condition=false;
			Stack<Character> stack = new Stack<Character>();
			Stack<Character> stack1 = new Stack<Character>();
			for(int i =0;i<n;i++)
			{
				ch[i] = str.charAt(i);
				if(ch[i] == '}')
				{
					if(stack.peek() == '{')
					{
						stack.pop();
					}
					else {
						count++;
						break;
					}
				}
				else if(ch[i] == ']')
				{
					if(stack.peek() == '[')
					{
						stack.pop();
					}
					else {
						count++;
						break;
					}
				}
				else if(ch[i] == ')')
				{
					if(stack.peek() == '(')
					{
						stack.pop();
					}
					else {
						count++;
						break;
					}
				}
				else
				stack.push(ch[i]);
			}
			condition = stack.size() == 0 ? true:false;
			
				
				
			return condition;
		}
}
