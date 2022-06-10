package ex03;

public class Dvd {
    private String title;
    private String diretor;
    private int anoLancamento;
    private String comment;

    public Dvd(String title, String diretor, int anoLancamento, String comment) {
        this.title = title;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Dvd = {" +
                "title='" + title + "'\n" +
                "diretor='" + diretor + "'\n" +
                "anoLancamento=" + anoLancamento + "'\n" +
                "comment='" + comment + "'\n" +
                '}';
    }
}
