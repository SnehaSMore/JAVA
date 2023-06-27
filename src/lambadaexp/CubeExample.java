package lambadaexp;

public class CubeExample {

	public static void main(String[] args) {
		
		Cube result=(int n)->
		{
			return n*n*n;
		};
		System.out.println(result.cubeNum(4));

	}

}


