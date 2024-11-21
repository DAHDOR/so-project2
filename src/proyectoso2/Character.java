package proyectoso2;
        
public class Character {
    int PID;
    int priority;
    int counter;
    
    //Atributes
    String name;
    int qualityAttrs = 0;
    int hitPoints, strength, agility;
    int nAbilities;
    String abilities;
    
    public Character(int PID, String name, int hitPoints, int stregth, int agility, String abilities){
        this.PID = PID;
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = stregth;
        this.agility = agility;
        this.abilities = abilities;
        this.nAbilities = abilities.split(",").length;
        counter = 0;
        getInitialPriority();
    }
    
    public void checkQuality(int probability){
        int random = (int)(Math.random() * 100);
        if(random <= probability){
            qualityAttrs++;
        }   
    }
    
    public boolean updateCounter(){
        counter++;
        if(counter == 8){
            if(priority != 1){
                counter = 0;
                priority -= 1;
                return true;
            }
        }
        return false;
    }
    
    public void getInitialPriority(){
        checkQuality(60); //Abilities
        checkQuality(70); // Hit Points
        checkQuality(50); // Strenght
        checkQuality(40); // Agility
        
        switch(qualityAttrs){
            case 0, 1 -> priority = 3;
            case 2 -> priority = 2;
            case 3, 4 -> priority = 1;                     
        }
    }
}
