
public class Album extends Product {

	private String artist;
	private String album;

	public Album() {
		super();
		artist = "";
		count++;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public String toString() {
		return album + "( " + artist + ")";
	}
}