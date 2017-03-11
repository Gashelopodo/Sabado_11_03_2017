package gashe.com.app_fragment;

/**
 * Created by cice on 11/3/17.
 */

public class Libro {

    private String titulo;
    private String autor;
    private String resumen;

    public Libro(String titulo, String autor, String resumen) {
        this.titulo = titulo;
        this.autor = autor;
        this.resumen = resumen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
}
