import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    	ArrayList<Hero> heroes = new ArrayList<Hero>(); 
    	
    	
        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
    		Hero blackWidow= new Hero("black Widow", 34);
    		heroes.add(blackWidow);
        // name: Captain America, age: 100
    		Hero captainAmerica= new Hero("captain america", 100);
    		heroes.add(captainAmerica);
        // name: Vision, age: 3
    		Hero vision= new Hero("vision", 3);
    		heroes.add(vision);
        // name: Iron Man, age: 48
    		Hero ironMan= new Hero("iron man", 48);
    		heroes.add(ironMan);
        // name: Scarlet Witch, age: 29
    		Hero scarletWitch= new Hero("scarlet witch", 29);
    		heroes.add(scarletWitch);
        // name: Thor, age: 1500
    		Hero thor= new Hero("thor", 1500);
    		heroes.add(thor);
        // name: Hulk, age: 49
    		Hero hulk= new Hero("hulk", 49);
    		heroes.add(hulk);
        // name: Doctor Strange, age: 42
    		Hero doctorStrange= new Hero("doctor strange", 42);
    		heroes.add(doctorStrange);

    		
    		
    		
    		
        // TODO 3 : It's Thor birthday, now he's 1501
    		thor.setAge(1501);
    		System.out.println("age of heroes is : ");
    		for(Hero hero : heroes) {
    			System.out.println(" " + hero.getAge() + " and their name is " + hero.getName() );
    		}
    		
    		
    		
        // TODO 4 : Shuffle the heroes list
    		Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
    		List<Hero> halfHero = heroes.subList(0, heroes.size()/2);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    		System.out.println("Thanos's survivor are : " );
    		for(Hero aliveHero : halfHero) {
    			System.out.println("- " + aliveHero.getName());
    		}
    }
}
