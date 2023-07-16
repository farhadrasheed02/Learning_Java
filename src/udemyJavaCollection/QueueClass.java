package udemyJavaCollection;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueClass {

	public static void main(String[] args) {
		try {
		Queue<Integer> queue = new ArrayBlockingQueue<>(3);
		queue.add(20);
		queue.add(40);
//		queue.add(80);
		if(queue.offer(10)==false)
		{
			System.out.println("offer failed to add in the queue");
		}
		
		System.out.println("The head of the Queue is "+queue.element());
		for(Integer integer : queue)
		
			System.out.println(integer);		
		System.out.println("The peek/head of the queue is "+queue.peek());
		}
		
		catch(IllegalStateException e)
		{
			System.out.println("The size of the queue is smaller than its elments added"+e.toString());
		}
		catch(NoSuchElementException e)
		{
			System.out.println("The  element in the Queue is  "+e.getMessage());
		}
		}

}









