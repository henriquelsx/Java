package ex03;

public class Main {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();
        locadora.addDvd(new Dvd(
                "Doutor Estranho no Multiverso da Loucura",
                "Sam Raimi",
                2022,
                "Marvel"
        ));
        locadora.addDvd(new Dvd(
                "The Batman",
                "Matt Reeves",
                2022,
                "DC"
        ));
        locadora.addCd(new Cd(
                "Paradise",
                "Coldplay",
                20,
                10.99,
                "pop"
        ));
        locadora.addCd(new Cd(
                "Applause",
                "Lady Gaga",
                30,
                9.99,
                "pop"
        ));

        System.out.println("Buscando DVDs e CDs por nome: ");
        System.out.println(locadora.getCdPorNome("Applause").toString());
        System.out.println(locadora.getDvdPorNome("The Batman"));
        System.out.println("Buscando DVDs e Cds por Artista ou diretor: ");
        System.out.println(locadora.getCdPorArtista("Lady Gaga"));
        System.out.println(locadora.getDvdPorDiretor("Matt Reeves"));
        System.out.println("Lista de CDs: ");
        locadora.listaCd();
        System.out.println("Lista de DVDs: ");
        locadora.listaDvd();
    }
}
