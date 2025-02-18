package PriorityQueue;
/*
import java.util.*;
public class LaunchPQ {

	public static void main(String[] args)
	{
		PriorityQueue pq=new PriorityQueue();
		
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		//pq.add("PW");//-->PriorityQueue ની અંદર string data ના નાંખી શકાય. 
		System.out.println(pq);
		
		pq.add(25);
		System.out.println(pq);
	}

}
*/

//Extra

import java.util.PriorityQueue;

public class LaunchPQ {
    public static void main(String[] args) {
        // Create a PriorityQueue of strings
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Add strings to the PriorityQueue
        priorityQueue.add("banana");
        priorityQueue.add("apple");
        priorityQueue.add("orange");
        priorityQueue.add("grape");
        //priorityQueue.offerFirst("watermelon"); ->Not Allow

        // Poll elements from the PriorityQueue
        while (!priorityQueue.isEmpty()) {
            System.out.println("Element polled: " + priorityQueue.poll());
        }
    }
}
