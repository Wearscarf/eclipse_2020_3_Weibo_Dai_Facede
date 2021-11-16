package FileFacedeApi;
import java.util.*;
import java.io.*;

public class FacedeAPI {
	String filename;
	public FacedeAPI(String filename) {
		this.filename = filename;
	}
	public void save(List<String> data) {
		try {
			FileWriter w = new FileWriter(filename);
			
			// save data from string to file
			for(String str: data) {
				w.write(str + System.lineSeparator());
			}
			w.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<String> load() throws IOException{
		BufferedReader in = null;
		List<String> myList = new ArrayList<>();
		try {
			in = new BufferedReader(new FileReader(filename));
			String str;
			while((str = in.readLine()) != null) {
				myList.add(str);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		in.close();
		return myList;
	}
	
	public static void demo() throws IOException{
		List<String> datas = new ArrayList<>();
		datas.add("1");
		datas.add("2");
		datas.add("3");
		String name = "text.txt";
		FacedeAPI fapi = new FacedeAPI(name);
		
		// save data
		System.out.println("data is saved to " + name + "  ");
		fapi.save(datas);
		System.out.println("saved data");
		
		
		//load data
		List<String> list = fapi.load();
		System.out.println(list);
		
	}
}
