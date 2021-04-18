/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author S541669
 */
public class Dog extends Animal {

    public void sound() {
        System.out.println("Woof");
    }

    public static void main(String[] args) {

        Animal obj = new Dog();
        obj.sound();

    }

}
