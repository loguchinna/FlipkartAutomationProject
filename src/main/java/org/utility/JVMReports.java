package org.utility;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JVMReports {
	
	public static void generateJVMReport(String json) {
		
		File loc= new File(System.getProperty("user.dir")+"\\src\\main\\resources\\Reports\\JVMReports");
		Configuration conf =new Configuration(loc, "FlipKart");
		conf.addClassifications("Browser", "Chrome");
		conf.addClassifications("OS", "Window");
		List<String> jsonfiles=new LinkedList<>();
		jsonfiles.add(json);		
		ReportBuilder r=new ReportBuilder(jsonfiles, conf);
		r.generateReports();
		
	}

}
