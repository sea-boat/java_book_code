package com.java.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("�й�");
		queue.offer("����");
		queue.offer("�¹�");
		queue.offer("Ӣ��");
		System.out.println("���д�С��" + queue.size());
		System.out.println("ִ��һ�γ��Ӳ�����" + queue.poll());
		System.out.println("ִ�ж��γ��Ӳ�����" + queue.poll());
		System.out.println("��ȡԪ�ص���ִ�г��Ӳ�����" + queue.peek());
		System.out.println("ִ�����γ��Ӳ�����" + queue.poll());
		System.out.println("ִ���Ĵγ��Ӳ�����" + queue.poll());
		System.out.println("���д�С��" + queue.size());
	}
}
