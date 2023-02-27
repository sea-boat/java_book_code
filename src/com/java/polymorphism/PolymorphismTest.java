package com.java.polymorphism;

public class PolymorphismTest {
	public static void main(String[] args) {
		Player player = new MusicPlayer();
		player.play();
		player = new PicturePlayer();
		player.play();
		player = new VideoPlayer();
		player.play();
	}
}

class Player {
	void play() {
	}
}

class MusicPlayer extends Player {
	void play() {
		System.out.println("≤•∑≈“Ù¿÷");
	}
}

class PicturePlayer extends Player {
	void play() {
		System.out.println("≤•∑≈Õº∆¨");
	}
}

class VideoPlayer extends Player {
	void play() {
		System.out.println("≤•∑≈ ”∆µ");
	}
}
