package ex03;

public class Cd {
    private String title;
    private String artist;
    private int qtd;
    private double price;
    private String comment;

    public Cd(String title, String artist, int qtd, double price, String comment) {
        this.title = title;
        this.artist = artist;
        this.qtd = qtd;
        this.price = price;
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Cd = {" +
                "title='" + title + "'\n" +
                "artist='" + artist + "'\n" +
                "qtd=" + qtd + "\n" +
                "price=" + price + "\n" +
                "comment='" + comment + "'\n" +
                '}';
    }
}
