package com.java.keyword;

public class InstanceofTest8 {
	public static void main(String[] args) {
		invoke(new MusicPlayer());
		invoke(new VideoPlayer());
	}

	public static void invoke(Player player) {
		if (player instanceof MusicPlayer) {
			((MusicPlayer) player).playMusic();
		}
		if (player instanceof VideoPlayer) {
			((VideoPlayer) player).playVideo();
		}
	}
}

class Player {
}

class MusicPlayer extends Player {
	void playMusic() {
		System.out.println("≤•∑≈“Ù¿÷");
	}
}

class VideoPlayer extends Player {
	void playVideo() {
		System.out.println("≤•∑≈ ”∆µ");
	}
}