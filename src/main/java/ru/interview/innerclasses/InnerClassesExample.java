package ru.interview.innerclasses;


import ru.interview.Example;

/**
 * User: 1
 * Date: 15.09.15
 */
// inner and nested classes example
public class InnerClassesExample implements Example {


    public void runMain() {
        Human human = new Human();
        Human.ActionInnerClass action = human.new ActionInnerClass();
        action.run();
        human.limbs.move();
        Human.HumanFunctionsNestedClass.moveLegs();
        System.out.println(Human.id);
    }
}
