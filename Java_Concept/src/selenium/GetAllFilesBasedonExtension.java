package ipp;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;


public class GetAllFilesBasedonExtension {

	public static void main(String[] args) throws IOException {
		File dir = new File("D:\\dirctory");
//		System.out.println(dir.getPath());
//		System.out.println(dir.getAbsolutePath());
//		System.out.println(dir.getCanonicalPath());
		String[] extension = new String[] {"xml"};
		System.out.println("Getting all XML files in " + dir.getCanonicalPath()+"including those in subdirectories");
		List<File>files=(List<File>)FileUtils.listFiles(dir, extension, true);
		for (File file :files) {
			System.out.println("files: "+file.getCanonicalPath());
		}

	}

}
