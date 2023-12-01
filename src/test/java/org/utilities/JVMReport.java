package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJvmReport(String jsonPath) {
		
		//Business Logic
		
//1.Mention the Target folder
		
		File f = new File(System.getProperty("user.dir")+"\\target\\Report\\JvmReport");
		
	//2. Add details to the report using configuration class
		
		Configuration con = new Configuration(f, "Facebook");
		con.addClassifications("Domain", "Travel");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Browser version", "103");
		con.addClassifications("Os", "Windows");
		con.addClassifications("Windows version ", "Windows 11");
		
		//3.Add json file paths into List<String>
		
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);
		
		
		
		//4.Create object for ReportBuilder class
		
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
	}

}
	