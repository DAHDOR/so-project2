package proyectoso2;

public class Administrator extends Thread{
    IA cpu;
    BattleArena arena;
    int turn = 0;
    
    public Administrator(BattleArena arena, IA cpu){
        this.arena = arena;
        this.cpu = cpu;
    }
    
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            Character[] fighters = arena.getFighters();
            if(fighters[0] != null || fighters[1] != null){
                continue;
            }
                          
            turn++;
            
            // Set fighters in arena
            arena.fighter1 = arena.chooseFighter(arena.studio1);
            arena.fighter2 = arena.chooseFighter(arena.studio2);
            if(arena.fighter1 == null || arena.fighter2 == null){
                Thread.currentThread().interrupt();
                cpu.interrupt();
                arena.GUI.updateIAStatus("Fin de Simulación");
                arena.GUI.updateResult("Fin de Simulación");
                break;
            }
            
            arena.GUI.updateArenaS1();
            arena.GUI.updateArenaS2();
            
            // Update queues
            arena.studio1.updateCounter();
            arena.studio2.updateCounter();
            arena.studio1.checkReinforcement();
            arena.studio2.checkReinforcement();
            
            if(turn % 3 == 0){
                int random = (int)(Math.random() * 100);
                if(random <= 80){
                    arena.studio1.addNewCharacterToQueue();
                    arena.studio2.addNewCharacterToQueue();
                }
            } 
        }   
    }
}
