package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("Report.txt")));
		writer.write(UUID.randomUUID().toString());
		writer.flush();
		writer.close();
	}
}
