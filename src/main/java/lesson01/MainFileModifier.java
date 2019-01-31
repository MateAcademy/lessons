package lesson01;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author spasko
 */
public class MainFileModifier {

	public static void main(String[] args) {

		try (Scanner keyboard = new Scanner(System.in)) {

			System.out.print("Enter the input file name: ");
			String fileToRead = keyboard.nextLine();

			System.out.print("Enter the output file name: ");
			String outputFileName = keyboard.nextLine();

			String fileLocation = getFileLocation(fileToRead);

			Path inputPath = Paths.get(fileLocation);
			List<String> fileLines = java.nio.file.Files.readAllLines(inputPath);

			List<String> linesToUpperCase = fileLines.stream().map(s -> s.toUpperCase())
					.map(s -> s.replaceAll("S", "!!!!")).collect(Collectors.toList());

			Path outputPath = Paths.get("src/main/resources/lesson01/" + outputFileName);
			java.nio.file.Files.write(outputPath, linesToUpperCase, StandardOpenOption.CREATE,
					StandardOpenOption.WRITE);
			System.out.println("Done!!!");

		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}

	static String getFileLocation(String fileName) {
		return MainFileModifier.class.getResource(fileName).getPath().replaceFirst("/", "");
	}
}
