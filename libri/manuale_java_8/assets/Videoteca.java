import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Videoteca {

    class Film{
        String nome;
        String genere;

        public Film(String nome, String genere){
            this.nome = nome;
            this.genere = genere;
        }
    }
    interface FilterThis{
        public boolean doFilter(Film film);
    }

    private List<Film> listaFilm;

    public Videoteca(){
        listaFilm = new ArrayList<>();
    }
    public void addFilm(Film f){
        listaFilm.add(f);
    }
    public Film creaFilm(String nome, String genere){
        return new Film(nome, genere);
    }

    public List<Film> filmFiltrati(FilterThis filer){
        ArrayList<Film> list = new ArrayList<>();

        for (Film f : listaFilm)
            if (filer.doFilter(f))
                list.add(f);
        return list;
    }

    enum Tipi{
        AVVENTURA {
            @Override
            public String toString() {
                return "Avventura";
            }
        },
        AZIONE {
            @Override
            public String toString() {
                return "Azione";
            }
        };
    }

    public static void main(String[] args) {
       Videoteca v = new Videoteca();
        v.addFilm(v.creaFilm("Il signore della strada", Tipi.AVVENTURA.toString()));
        v.addFilm(v.creaFilm("Rambo spara soffitto", Tipi.AZIONE.toString()));
        v.addFilm(v.creaFilm("Giggo e Conca", Tipi.AVVENTURA.toString()));
        v.addFilm(v.creaFilm("Super Daddy", Tipi.AZIONE.toString()));
        v.addFilm(v.creaFilm("4 Computer e 2 tastiere", Tipi.AVVENTURA.toString()));

        for (Film f : v.filmFiltrati(new FilterThis() {
            @Override
            public boolean doFilter(Film film) {
                return  film.genere.equals(Tipi.AZIONE.toString()) ? true : false;
            }
        }))
            System.out.println(f.nome);

    }


}
