package proyectoso2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Studio {
    String name;
    int winners;
    Queue<Character> p1, p2, p3, reinforcement;
    LinkedList<Character> characters;
    Proyecto2GUI GUI;
    
    public Studio(String name, Proyecto2GUI GUI){
        this.name = name;
        this.GUI = GUI;
        p1 = new Queue<>();
        p2 = new Queue<>();
        p3 = new Queue<>();
        reinforcement = new Queue<>();
        characters = new LinkedList<>();
        loadCharacters();
    }
    
    public void loadCharacters(){
        String filename = System.getProperty("user.dir") + "\\src\\" + name + "Characters.txt" ;
      
        try{
           File myObj = new File(filename);
           Scanner myReader = new Scanner(myObj);
           
           for(int i=0; i < 30; i++){
                String line = myReader.nextLine();
                String nameC = line;
                line = myReader.nextLine();
                int hp = Integer. parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int strength = Integer. parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int agility = Integer. parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                String abilities = line.split(": ")[1];
                line = myReader.nextLine();
                Character newCharacter = new Character(GUI.getPID(), nameC, hp, strength, agility, abilities);
                
                if(i < 10){
                    switch(newCharacter.qualityAttrs){
                        case 0, 1 -> p3.enqueue(newCharacter);
                        case 2 -> p2.enqueue(newCharacter);
                        case 3, 4 -> p1.enqueue(newCharacter);                     
                    }
                
                }  else{
                    characters.append(newCharacter);
                }
           }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void addToP1(Character fighter){
        p1.enqueue(fighter);
    }
    
    public void addToReinforcement(Character fighter){
        reinforcement.enqueue(fighter);
    }
    
    public void addNewCharacterToQueue(){
        if(characters.size > 0){
            Character c = characters.get(0);
            characters.delete(c);
            switch(c.qualityAttrs){
                case 0, 1 -> p3.enqueue(c);
                case 2 -> p2.enqueue(c);
                case 3, 4 -> p1.enqueue(c);                     
            }
        }
    }
    
    public void checkReinforcement(){
        if(!reinforcement.isEmpty()){
            Character c = reinforcement.dequeue();
            int random = (int)(Math.random() * 100);
            if(random <= 40){
                p1.enqueue(c);
                if(name.equals("Star Wars")){
                    GUI.updateP1QueueS1();
                    GUI.updateRefQueueS1();
                }else{
                    GUI.updateP1QueueS2();
                    GUI.updateRefQueueS2();
                }
            }else{
                reinforcement.enqueue(c);
                if(name.equals("Star Wars")){
                    GUI.updateRefQueueS1();
                }else{
                    GUI.updateRefQueueS2();
                }
            }
        }
    }
    
    public void updateCounter(){
        Node<Character> node = p2.front;
        while(node != null){
            Character c = node.data;
            boolean movePriority = c.updateCounter();
            if(movePriority){
                p2.remove(c);
                p1.enqueue(c);
                
                if(name.equals("Star Wars")){
                    GUI.updateP1QueueS1();
                    GUI.updateP2QueueS1();
                }else{
                    GUI.updateP1QueueS2();
                    GUI.updateP2QueueS2();
                }
            }
            node = node.next;
        }
        
        node = p3.front;
        while(node != null){
            Character c = node.data;
            boolean movePriority = c.updateCounter();
            if(movePriority){
                p3.remove(c);
                p2.enqueue(c);
                
                if(name.equals("Star Wars")){
                    GUI.updateP2QueueS1();
                    GUI.updateP3QueueS1();
                }else{
                    GUI.updateP2QueueS2();
                    GUI.updateP3QueueS2();
                }
            }
            node = node.next;
        }
    }
}
