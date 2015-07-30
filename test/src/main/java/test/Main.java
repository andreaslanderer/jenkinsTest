package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("Report.txt")));
		for (int i = 0; i < 1000000; i++) {
			writer.write(UUID.randomUUID().toString());
			writer.newLine();
		}
		writer.flush();
		writer.close();
	}
}
