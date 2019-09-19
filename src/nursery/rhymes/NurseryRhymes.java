/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nursery.rhymes;

/**
 *
 * @author mlarrubia
 */
public class NurseryRhymes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Old MacDonald had a farm");
        
        farm("cow", "moo");
        farm("duck", "quack");
        farm("turkey", "glu");
        System.out.println("");
        System.out.println("");
        monkeys(10);
        System.out.println("");
        monkeys(9);
        System.out.println("");
        monkeys(8);
        System.out.println("");
        
        hickory_dickory(1);
        System.out.println("");
        hickory_dickory(2);
        System.out.println("");
        hickory_dickory(3);
        System.out.println("");
        
        milk(99);
        System.out.println("");
        milk(98);
        System.out.println("");
        milk(97);
        System.out.println("");
        // TODO: call your new methods here ( you must write them first! ) 
        
        
    }
    
    
    
    public static void farm(String animal, String sound){
        System.out.print("Old MacDonald had a farm \n"
                        +"e-i-e-i-o \n"
                        +"And on the farm, he had a "+animal+"\n"
                        +"e-i-e-i-o \n"
                        +"With a "+sound+" "+sound+" here \n"
                        +"And a "+sound+" "+sound+" there \n"
                        +"Here a "+sound+", there a "+sound+"\n"
                        +"Everywhere a "+sound+" "+sound+" \n"
                        +"Old MacDonald had a farm \n"
                        +"e-i-e-i-o");
        System.out.println("");
    }
    
    public static void monkeys(int number){
        System.out.print(number+" little monkeys jumping on the bed \n"
                               +"One fell off and bumped his head \n"
                               +"Mama called the doctor, and the doctor said: \n"
                               +"\"No more jumping on the bed!\"");
        System.out.println("");
    }
    
    public static void hickory_dickory(int time){
        System.out.println(time);
    }
    
    public static void milk(int bottles){
        System.out.print(bottles +" bottles of milk on the wall \n"
                        +bottles +" bottles of milk \n"
                        +         "Take one down and pass it around \n");
                        bottles -= 1;
                        
        System.out.print (bottles+ " bottles of milk on the wall");
    }
    
    public static void hokey_pokey(String booty){
        System.out.print("You put your "+booty+" in \n"
                        +"You put your "+booty+" out \n"
                        +"You put your "+booty+" in \n"
                        +"And you shake it all about \n"
                        +"You do the Hokey Pokey \n"
                        +"And you turn yourself about \n"
                        +"That's what it's all about!");
    }
    
}
