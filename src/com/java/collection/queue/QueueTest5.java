package com.java.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest5 {
	public static void main(String[] args) {
		Queue<Patient> queue = new PriorityQueue<Patient>();
		queue.offer(new Patient("С��", "��ͨ1��"));
		queue.offer(new Patient("С��", "��ͨ2��"));
		queue.offer(new Patient("С��", "����1��"));
		queue.offer(new Patient("С��", "��ͨ3��"));
		queue.offer(new Patient("С��", "����2��"));
		for (int i = 0; i < 5; i++)
			System.out.print(queue.poll().name + " ");
	}
}

class Patient implements Comparable<Patient> {
	String name;
	String ticket;

	public Patient(String name, String ticket) {
		this.name = name;
		this.ticket = ticket;
	}

	public int compareTo(Patient o) {
		if (this.ticket.startsWith("��ͨ") && o.ticket.startsWith("����"))
			return 1;
		if (this.ticket.startsWith("����") && o.ticket.startsWith("����"))
			return 0;
		return -1;
	}
}