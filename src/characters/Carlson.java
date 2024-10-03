package characters;
import utilities.*;
public class Carlson extends AbstractHero implements ToddlerInterface {
    private String name;
    public Carlson() {
        name = "Карлсон";
        joinToStory();
    }
    public Carlson(String name) {
        this.name = name;
        joinToStory();
    }
    @Override
    public void joinToStory() {
        System.out.println("Карлсон '" + name + "' присоединился к рассказу.");
    }
    public String sew(boolean hasTime) {
        String will;
        if(hasTime){
            will = "нынче";
        } else {
            will = "некогда";
        }
        return "Карлсону " + will + " шить одежду";
    }
    public String know(boolean doesKnow){
        if(doesKnow){
            return "В отличие от него, Карлсон отлично знал, что это за штука, так как желание артиста творить зависит от его вдохновения.";
        } else {
            return "Как и малыш, Карлсон к сожалению тоже не знал что это за штука, так как он не являлся настоящим артистом.";
        }

    }
    public String paint(boolean hasTime) {
        String intent;
        if(!hasTime) {
            intent = "не намерен";
        } else {
            intent = "намерен";
        }
        return ", потому что он " + intent + " срочно нарисовать картину.";
    }
    public void explain() {
        System.out.println("Карлсон объяснил, что...");
    }
    @Override
    public void leaveFromStory() {
        System.out.println("Карлсон " + name + " ливнул с рассказа.");
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return "Карлсон '" + name + "'";
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj instanceof Carlson){
            return name.equals(((Carlson) obj).getName());
        }
        return false;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
