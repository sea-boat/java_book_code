package com.java.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("С��");
		queue.offer("С��");
		queue.offer("С��");
		queue.offer("С��");
		System.out.println("��ʼ");
		System.out.println("��һ����ҵ����ˣ�" + queue.poll());
		System.out.println("�ڶ�����ҵ����ˣ�" + queue.poll());
		System.out.println("��������ҵ����ˣ�" + queue.poll());
		System.out.println("���ĸ���ҵ����ˣ�" + queue.poll());
		System.out.println("����");
	}
}
