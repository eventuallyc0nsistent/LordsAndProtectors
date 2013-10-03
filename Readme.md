Problem
=======
This is a related to [nobles and warriors](https://github.com/kirankoduru/warrrios_and_nobles).

It turns out that there is more than one type of noble. Some nobles, instead of hiring others to fight their battles, actually do the fighting themselves! They have their own strength, rather than depending on the strengths of others. Nobles who can fight their own battles are commonly called Those With Strength, whereas the nobles who hire others to fight are known as Lords of the Land.

It also turns out that there are are more types of fighters than were known of before. Some warriors are archers and others are swordsmen. Not only that but there are others besides warriors who can be hired to protect the Lords.

There are also Wizards! Wizards are not Warriors!

How do these various Protectors differ? They differ in their ways of fighting:

+ Wizards state "POOF". It is such a hard job to control the strength expended with magic!
+ Archers who fight by stating "TWANG. Take that in the name of my lord, __________" (whence he shouts the name of the lord he is sworn to defend)
+ Swordsmen who fight by stating "CLANG. Take that in the name of my lord, __________" (whence he shouts the name of the lord he is sworn to defend)

Loss of Strength
================
Each entity that has strength loses it in the same manor as described in [nobles and warriors](https://github.com/kirankoduru/warrrios_and_nobles).

Death
=====
It's a sad topic, but one we do have to address (and probably should have addressed in the previous homework):

+ People die when they lose a battle, whether they are a Noble or a Protector. They cannot be dead unless they have actually been slain.
+ Lords who are dead are in no position to hire anyone. Any attempt by a dead Lord to hire someone will simple fail and the Protector will remain unhired.
+ However curiously, as has been seen before, Nobles can declare battle even though they are dead.
+ A Protector who is dead, however, cannot fight and so will not have anything to say, even if his Lord does go into battle again. (He also cannot runaway, be hired, etc.)

Sample Input
============

    class TestInheritance {
        public static void main(String[] args) {
    
            Lord sam = new Lord("Sam");
            Lord joe = new Lord("Joe");
            Lord janet = new Lord("Janet");
    
            PersonWithStrength randy = new PersonWithStrength("Randolf the Elder", 250);
            PersonWithStrength barclay = new PersonWithStrength("Barclay the Bold", 300);
    
            Swordsman hardy = new Swordsman("TuckTuckTheHardy", 60);
            Swordsman stout = new Swordsman("TuckTuckTheStout", 40);
            Archer samantha = new Archer("Samantha", 50);
            Archer pethora = new Archer("Pethora", 50);    
            Wizard thora = new Wizard("Thorapleth", 70);
     
            sam.hire(samantha);
            janet.hire(hardy);	
            janet.hire(stout);
    	
            janet.hire(thora);
            joe.battle(randy);        
            joe.battle(sam);	
            janet.battle(barclay);
    
            janet.hire(samantha);	
            janet.hire(pethora);
    	
            janet.battle(barclay);	
            sam.battle(barclay);	
            joe.battle(barclay);
    
            thora.runsaway();
    
            System.out.println(sam);
            System.out.println(joe);
            System.out.println(janet);
            System.out.println(randy);
            System.out.println(barclay);
        }    
    }
