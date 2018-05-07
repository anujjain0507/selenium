package ActionUtilities;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Report {
	
	public static void iTextPDF() throws IOException, DocumentException{
		String File = "D://sample.pdf";
		Document doc = new Document();
		PdfWriter.getInstance(doc, new FileOutputStream(File));
		doc.open();
		doc.add(new Paragraph("Test Case Fail: 1"));
		doc.add(new Paragraph("Error Id not Found"));
		doc.close();
		
	}

}
