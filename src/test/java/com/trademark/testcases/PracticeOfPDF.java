package com.trademark.testcases;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeOfPDF {
	
	@Test
	 public void pdf() throws IOException {
		String pdf_filepath="C:/Users/Tolik/Downloads/TMOGIssue_20190917_SN_74698385.pdf";
		
		FileInputStream fis=new FileInputStream(pdf_filepath);
		BufferedInputStream fileParse=new BufferedInputStream(fis);
		
		PDDocument doc=null;
		
		doc=PDDocument.load(fileParse);
		String pdfContain=new PDFTextStripper().getText(doc);
		
		System.out.println(pdfContain);
		
		Assert.assertTrue(pdfContain.contains("Currently 44D"), "Currently 44D: is present .");
	}

}
