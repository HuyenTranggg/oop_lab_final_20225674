package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media{
	
	private String director;
	private int length;

	
	
	
    
	public DigitalVideoDisc(String title) {
		super(title);
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}

	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}

	// Constructor by all attributes
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	

	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}



    public void setDirector(String director){this.director = director;}
    public void setLength(int length){this.length = length;}

}
