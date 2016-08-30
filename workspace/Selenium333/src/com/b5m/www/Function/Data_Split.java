package com.b5m.www.Function;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Data_Split {
	
	//读取CSV中的文件
			public static Collection<String[]> getTestData(String path){
			List<String[]> records = new ArrayList<String[]>();
			String row;
			try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((row = br.readLine())!=null) {
			String fields[] = row.split(",");
			records.add(fields);
			}
			br.close();
			} catch (Exception e) {
			e.printStackTrace();
			}
			
			return records;
			}
}
