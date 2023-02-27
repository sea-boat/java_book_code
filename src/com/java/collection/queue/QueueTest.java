package com.java.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("中国");
		queue.offer("美国");
		queue.offer("德国");
		queue.offer("英国");
		System.out.println("队列大小：" + queue.size());
		System.out.println("执行一次出队操作：" + queue.poll());
		System.out.println("执行二次出队操作：" + queue.poll());
		System.out.println("获取元素但不执行出队操作：" + queue.peek());
		System.out.println("执行三次出队操作：" + queue.poll());
		System.out.println("执行四次出队操作：" + queue.poll());
		System.out.println("队列大小：" + queue.size());
	}
}
