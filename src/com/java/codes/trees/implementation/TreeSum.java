package com.java.codes.trees.implementation;
import java.util.*;
public class TreeSum {
	public Node root;
	public TreeSum(){
		root = null;
	}
//	ArrayList<Integer> listElements = new ArrayList<Integer>();
	public ArrayList<Integer> printInorder(Node node,ArrayList<Integer> a) {
		if(node == null)
			return a;
		printInorder(node.left,a);
		a.add(node.key);
		printInorder(node.right,a);
		
		return a;
	}
	public void insert(int key) {
		root= insertRec(root,key);
	}
	public Node insertRec(Node root,int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key < root.key)
			root.left = insertRec(root.left,key);
		else if(key > root.key)
			root.right = insertRec(root.right,key);
		return root;
	}
	public void checkSum(Node node,int sum) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = printInorder(node,arr1);
		int start =0;
		int end  = arr2.size()-1;
		int sumValue=0;
		boolean conditionPair=false;
		while(start < end) {
			sumValue = arr2.get(start) + arr2.get(end);
			if(sumValue < sum)
				start++;
			else if(sumValue > sum)
				end--;
			else if (sumValue == sum)
			{

				conditionPair=true;
				System.out.println("Pair is ("+ arr2.get(start)+","+arr2.get(end)+")");
				break;
			}
		}
		if(!conditionPair)
			System.out.println("Pair not found");
	}
}
