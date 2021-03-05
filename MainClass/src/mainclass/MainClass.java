/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

/**
 *
 * @author ssyed
 */
public class MainClass {

   
    public static void main(String[] args) {
        // TODO code application logic here
       User user01 = new User("Syed", "Chicago");
       user01.tweet("My first tweet is presented here thanks for viewin it.").display();
     
       
       User user02 = new User("Uncle Sam");
       user02.tweet("This is Uncle Sam for real we want you").display();
       
       User user03 = new User("Bigfoot", "NYC");
       user03.tweet("It was an lovely day in New York City I got to play some cricket").display();
        
       user02.tweet("I wish I could get the PS5 right now.").display();
    }
    
}
