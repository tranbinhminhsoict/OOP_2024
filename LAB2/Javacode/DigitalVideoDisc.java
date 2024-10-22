package aims;

public class DigitalVideoDisc {

    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;	

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc() {
       
    }

    public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

}