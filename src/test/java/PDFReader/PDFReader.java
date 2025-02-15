package PDFReader;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFReader {
    public static void main(String[] args) {
        try {
            File filePDF = new File("C:\\Users\\2052529\\OneDrive - Cognizant\\Documents\\2052529_Resume.pdf");
            PDDocument document = Loader.loadPDF(filePDF); // Load PDF file
            PDFTextStripper pdfStripper = new PDFTextStripper(); // Create PDFTextStripper object
            String text = pdfStripper.getText(document); // Extract text from PDF
            document.close();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


