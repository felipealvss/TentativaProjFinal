
package tentativaprojfinal;

public class TentativaProjFinal {

    public static void main(String[] args) {
        Video v = new Video("Hitorias das Lompiculas");
        Video v1 = new Video("Caralitos de Gumercindo");
            
        Gafanhoto g[] = new Gafanhoto[2];
            g[0] = new Gafanhoto("Felipe", 24, "M", "fela.alves");
            g[1] = new Gafanhoto("Rute", 18, "F", "anaRuts");
        
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println(v.toString());
        System.out.println(v1.toString());
        
        Visualizacao vis = new Visualizacao(g[0], v1);
        System.out.println(vis.toString());
    }
    
}
