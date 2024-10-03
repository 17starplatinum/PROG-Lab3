package Run;
import characters.*;
public class Story {
    public static void main(String[] args){
        Carlson Carlsen = new Carlson();
        System.out.println(Carlsen.sew(false) + Carlsen.paint(true));
        Toddler Malysh = new Toddler();
        System.out.println(Malysh.know(false));
        System.out.println(Carlsen.know(true));
        Inspiration inspiration = new Inspiration();
        Carlsen.explain();
        System.out.println(inspiration.captivate());
    }
}
