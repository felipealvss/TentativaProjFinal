
package tentativaprojfinal;

public class Video implements AcoesVideo {
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //CONSTRUCT
    public Video(String titulo) {
        this.setTitulo(titulo);
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
    }

    //TO_STRING
    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    //GET & SET
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
//        this.avaliacao = avaliacao;
        int n_ava;
            n_ava = (int) ((this.avaliacao = avaliacao)/this.getViews());
        this.avaliacao = n_ava;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //MET. ABSTRATOS
    @Override
    public void play() {
        this.setReproduzindo(true);
        System.out.println("Video iniciado.");
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
        System.out.println("Video pausado.");
    }

    @Override
    public void like() {
        this.setCurtidas(getCurtidas() + 1);
        System.out.println("Like! (y)");
    }
    
}
