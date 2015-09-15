package ru.interview;

import ru.interview.innerclasses.Human;

/**
 * User: 1
 * Date: 15.09.15
 */
// inner and nested classes example
public class InterViewMain {
    public static void main(String[] args) {
        Human human = new Human();
        Human.ActionInnerClass action = human.new ActionInnerClass();
        action.run();
        human.limbs.move();
        Human.HumanFunctionsNestedClass.moveLegs();
        System.out.println(Human.id);
    }
}
