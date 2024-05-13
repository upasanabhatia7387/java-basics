package java11feature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//		var path = "/Users/upasanabhatia/Documents/JavaBasics/data.txt";
//		Files.writeString(Path.of(path), "Welcome", StandardOpenOption.CREATE);
//		String result = Files.readString(Path.of(path));
//		System.out.println(result);
		
		var path = "data.txt";
		Files.writeString(Path.of(path), "Welcome to Cogent", StandardOpenOption.CREATE);
		String result = Files.readString(Path.of(path));
		System.out.println(result);

	}

}
