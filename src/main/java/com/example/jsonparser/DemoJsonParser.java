/**
 * 
 */
package com.example.jsonparser;
import org.springframework.boot.SpringApplication;    
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.util.LinkedHashMap; 
import java.util.Map; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 


@SpringBootApplication 
public class DemoJsonParser   {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// creating JSONObject 
		
				JSONObject jo = new JSONObject(); 
				
				// putting data to JSONObject 
				jo.put("name", "Test Lead"); 
				jo.put("phone", "111-222-3333"); 
				jo.put("email", "testlead@gmail.com"); 
				jo.put("beds", 3); 
				jo.put("baths", 2); 
				jo.put("address", "43824 W Sagebrush Trl, Maricopa, AZ 85138"); 
				
				PrintWriter pw = new PrintWriter("F:/JSON/output.json");
				pw.write(jo.toJSONString()); 
				
				pw.flush(); 
				pw.close(); 
		SpringApplication.run(DemoJsonParser.class, args);    

	}

}
