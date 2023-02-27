package com.java.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("小明");
		queue.offer("小红");
		queue.offer("小东");
		queue.offer("小燕");
		System.out.println("开始");
		System.out.println("第一个办业务的人：" + queue.poll());
		System.out.println("第二个办业务的人：" + queue.poll());
		System.out.println("第三个办业务的人：" + queue.poll());
		System.out.println("第四个办业务的人：" + queue.poll());
		System.out.println("结束");
	}
}
