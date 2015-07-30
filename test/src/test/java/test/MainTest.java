package test;

import java.io.IOException;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		try {
			Main.main(new String[] {});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
