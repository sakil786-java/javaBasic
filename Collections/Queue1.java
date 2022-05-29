package Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue1 {

	public static void main(String[] args) {
		
		Queue<Integer> q1=new ArrayBlockingQueue<>(6);
		q1.offer(10);
		q1.offer(15);
		q1.offer(12);
		q1.offer(17);
		q1.offer(19);
		q1.offer(25);
		q1.offer(11);
		
		
		for(int i : q1)
		{
			System.out.println(i);
		}
		System.out.println("____");
		
		
		Queue<Integer> q2=new PriorityQueue<>();
		q2.offer(15);
		q2.offer(9);
		q2.offer(45);
		q2.offer(3);
		q2.offer(2);
		
		System.out.println("Peek: "+q2.peek());
		
		for(int i : q2)
		{
			System.out.println(i);
		}
		
		System.out.println("**********");
		ArrayDeque<Integer> q3=new ArrayDeque<>();
		q3.offer(15);
		q3.offer(9);
		q3.offerFirst(10);
		q3.offer(3);
		q3.offerLast(2);
		
		
		
		for(int i : q3)
		{
			System.out.println(i);
		}

	}

}
