package FileFacedeApi;

import java.io.IOException;

public class Driver {
	public static void main(String[] args) {
		
		try {
			FacedeAPI.demo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
