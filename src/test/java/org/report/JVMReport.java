package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	
	
	public static void GenerateJVMReport(String jsonfile) {
		File file = new File("//Users//presidio//eclipse-workspace//DemoBlaze//target");
		
		Configuration configuration = new Configuration(file, "DemoBlaze");
		
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Version", "129.0.6668.90");
		configuration.addClassifications("OS", "MacOS");
		
		List<String> jsonfiles = new ArrayList<String>();
		
		jsonfiles.add(jsonfile);
		ReportBuilder builder = new ReportBuilder(jsonfiles, configuration);
		builder.generateReports();
		
		
		
		
		
		
		
	}

}
