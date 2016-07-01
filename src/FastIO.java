import java.io.BufferedInputStream;
import java.io.IOException;

class FastIO {

	BufferedInputStream in;
	
	public FastIO() {
		in = new BufferedInputStream(System.in);
	}
	
	public int nextInt(){
		try {
			boolean start = false;
			int val = 0;
			while (true){
				int b = in.read();
				if (b > 47 && b < 58){
					if (!start)
						start = true;
					
					val = val*10+b-'0';
				}
				else if (start){
					return val;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}

	public static void main(String[] args) {
		FastIO in = new FastIO();
		System.out.println(in.nextInt());
	}

}
