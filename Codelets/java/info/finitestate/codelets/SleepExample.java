package info.finitestate.codelets;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class SleepExample {

	public static void main(String[] args) {
		try {
			System.out.println(LocalDateTime.now());
			TimeUnit.SECONDS.sleep(5);
			System.out.println(LocalDateTime.now());
			TimeUnit.MILLISECONDS.sleep(2);
			System.out.println(LocalDateTime.now());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
