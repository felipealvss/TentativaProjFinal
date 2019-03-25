
package tentativaprojfinal;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc) {
        int total = 0;
        if(porc <= 30) {
            total = 3;
        } else if(porc <= 50) {
            total = 5;
        } else if(porc <= 80) {
            total = 8;
        } else {
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }
    
    //CONSTRUCT
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    //TO_STRING
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    //GET & SET
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
}
