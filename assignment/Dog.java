package stringClass;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }


//public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();
        StringBuilder sb = new StringBuilder();
        
        
        String s = "Java";
        String s1 = "Java";
        String s3 = new String("Java");
        System.out.println(s.equals(s1) && s.equals(s3));
        
       StringBuffer sb1 = new StringBuffer();
 sb1.ensureCapacity(5);
     // sb1.capacity();
      sb1.ensureCapacity(40);
     
        
    



	}

}
