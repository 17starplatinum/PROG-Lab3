package characters;
import utilities.*;
public class Toddler extends AbstractHero implements ToddlerInterface {
    private String name;
    public Toddler(){
        name = "Малыш";
        joinToStory();
    }
    public Toddler(String name){
        this.name = name;
        joinToStory();
    }
    @Override
    public void joinToStory(){
        System.out.println("Малыш '" + name + "' присоединился к рассказу.");
    }
    @Override
    public void leaveFromStory() {
        System.out.println("Малыш" + name + "ливнул с рассказа.");
    }
    @Override
    public String know(boolean doesKnow){
        if(doesKnow){
            return "Малыш '" + name + "' знал, что это за штука такая -- вдохновение.";
        } else {
            return "Малыш '" + name + "' не знал, что это за штука такая -- вдохновение.";
        }
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Малыш '" + name + "'";
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj instanceof Toddler){
            return name.equals(((Toddler) obj).getName());
        }
        return false;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
