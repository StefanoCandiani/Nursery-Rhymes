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
        System.out.println("Here's a little Nursery Rhyme for your kids:");
        System.out.println("");
        farm("cow", "moo");
        System.out.println("");
        System.out.println("");
        farm("duck", "quack");
        System.out.println("");
        System.out.println("");
        farm("turkey", "glu");
        System.out.println("");
        System.out.println("");
      
        monkeys(10);
        System.out.println("");
        System.out.println("");
        monkeys(9);
        System.out.println("");
        System.out.println("");
        monkeys(8);
        System.out.println("");
        System.out.println("");
        
        hickory_dickory(1);
        System.out.println("");
        System.out.println("");
        hickory_dickory(2);
        System.out.println("");
        System.out.println("");
        hickory_dickory(3);
        System.out.println("");
        System.out.println("");
        
        milk(99);
        System.out.println("");
        System.out.println("");
        milk(98);
        System.out.println("");
        System.out.println("");
        milk(97);
        System.out.println("");
        System.out.println("");
    
        bingo("B-I-N-G-O");
        System.out.println("");
        System.out.println("");
        bingo("B-I-N-G-O");
        System.out.println("");
        System.out.println("");
        
        frogs(3);
        System.out.println("");
        System.out.println("");
        frogs(2);
        System.out.println("");
        System.out.println("");
        frogs(1);
        System.out.println("");
        System.out.println("");
        
        
        
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
    }
    
    public static void monkeys(int number){
        System.out.print(number+" little monkeys jumping on the bed \n"
                               +"One fell off and bumped his head \n"
                               +"Mama called the doctor, and the doctor said: \n"
                               +"\"No more jumping on the bed!\"");
    }
    
    public static void hickory_dickory(int time){
        System.out.print("Hickory dickory dock \n"
                        +"The mouse ran up the clock \n"
                        +"The clock struck "+time+"\n"
                        +"The mouse ran down \n"
                        +"Hickory dickory dock");
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
    
   public static void bingo(String name){
       System.out.print("There was a farmer who had a dog \n"
                       +"And Bingo was his name-o \n"
                       +""+name+"\n"
                       +""+name+"\n"
                       +""+name+"\n"
                       +"And Bingo was his name-o");
   }
   
   public static void frogs(int num){
       System.out.print(num+" little speckled frogs \n"
                           +"sitting in a speclked log \n"
                           +"eating the most delicious bugs \n"
                           +"yum, yum \n"
                           +"one jumped into the pool \n"
                           +"where it is nice and cool");
       num -= 1;
       System.out.print(    "now there are " +num+ " little speckled frogs! \n"
                           +"ribbit, ribbit");
   }
    
}
