package ex2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dslr dslr = new Dslr();
		FilmCamera filmcamera = new FilmCamera();
		
		dslr.takePicture();
		dslr.extraPicture();
		filmcamera.takePicture();
		filmcamera.smallPicture();
		
	}

}
