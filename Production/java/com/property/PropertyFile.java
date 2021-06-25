package com.property;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p=new Properties();
		OutputStream out=new FileOutputStream("data.properties");
		
		p.setProperty("url", "jdbc:mysql://localhost:8080/genesissql");
		p.setProperty("uname", "root");
		p.setProperty("passwd", "Mrinal@9902");
		
		p.store(out, "data info");
	}

}
