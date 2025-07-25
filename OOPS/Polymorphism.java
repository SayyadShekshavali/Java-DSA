//! Polymorphism:
//--> Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Polymorphism {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  
    Animal myPig = new Pig();  
    Animal myDog = new Dog(); 
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}

