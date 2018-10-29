package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class VarifyPDF {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Anuj\\CP_AnnualPremium_57128566_FY 2017-2018.pdf");
		ileInputStream fis = new FileInputStream(file);
		
		PDFParser parser = new PDFParser(fis);
		parser.parse();
		
		COSDocument cosDoc = parser.getDocument();
		PDDocument pdDoc = new PDDocument(cosDoc);
		
		PDFTextStripper stripper = new PDFTextStripper();
		String data = stripper.getText(pdDoc);
		
		System.out.println(data);
		

	}

}
