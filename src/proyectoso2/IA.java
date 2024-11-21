package proyectoso2;

public class IA extends Thread{
    BattleArena arena;
    int velocity;
    
    public IA(BattleArena arena, int velocity) {
        this.arena = arena;
        this.velocity = velocity;
    }
    
    public void processWinner(Character f1, Character f2){
        // Choose who hits first (if they tie, the street fighters characters go first)
        Character fighting, getHit, aux;
        if(f1.agility > f2.agility){
            fighting = f1;
            getHit = f2;
        }else{
            fighting = f2;
            getHit = f1;
        }
        while(f1.hitPoints > 0 && f2.hitPoints > 0){
            getHit.hitPoints -= fighting.strength + (fighting.nAbilities * 5);
            // Swap fighters positions
            aux = fighting;
            fighting = getHit;
            getHit = aux;
        } 
        
        arena.winners.append(getHit);
        if(getHit.name.equals(f1.name)){
            arena.studio1.winners++;
            arena.GUI.updateGamesWonS1(); 
            arena.GUI.updateS1Winners(f1.name + " (PID: " + f1.PID + ")");
        }else{
            arena.studio2.winners++;
            arena.GUI.updateGamesWonS2();
            arena.GUI.updateS2Winners(f2.name + " (PID: " + f2.PID + ")");
        }
        
        arena.GUI.updateResult("Ganó " + getHit.name);
    }
    
    public void processTie(Character fighter1, Character fighter2){
        // Put both caracters in their priority 1 queue
        arena.studio1.addToP1(fighter1);
        arena.studio2.addToP1(fighter2);
        arena.GUI.updateP1QueueS1();
        arena.GUI.updateP1QueueS2();
        arena.GUI.updateResult("Empate");
    }
    
    public void processNull(Character fighter1, Character fighter2){
        // Put both caracters in their reenforcement queue
        arena.studio1.addToReinforcement(fighter1);
        arena.studio2.addToReinforcement(fighter2);
        arena.GUI.updateRefQueueS1();
        arena.GUI.updateRefQueueS2();
        arena.GUI.updateResult("No se realizo");
    }
    
    public void setVelocity(int velocity){
        this.velocity = velocity;
    }
    
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                arena.GUI.updateIAStatus("Esperando");
                Character[] fighters = arena.getFighters();
                if(fighters[0] == null || fighters[1] == null){
                    continue;
                }
                // Wait for result
                arena.GUI.updateIAStatus("Decidiendo");
                Thread.sleep(10*1000/(velocity));
                
                // Process result
                int random = (int)(Math.random() * 100);
                if(random <= 40){
                    processWinner(fighters[0], fighters[1]);
                } else if(random <= 67){
                    processTie(fighters[0], fighters[1]);
                } else {
                    processNull(fighters[0], fighters[1]);
                }     
                
                arena.GUI.updateIAStatus("Anunciando Resultado");
                Thread.sleep(3*1000/(velocity));
                
                arena.GUI.updateResult("Procesando");
                arena.fighter1 = null;
                arena.fighter2 = null;
            }   
        } catch(InterruptedException e){
            //Thread killed
        }
        
    }
}
