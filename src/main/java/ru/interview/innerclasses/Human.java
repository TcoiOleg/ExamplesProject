package ru.interview.innerclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: 1
 * Date: 15.09.15
 */
public class Human {

    public static String id;

    public CompositeLimb limbs;

    public Human() {
        Arm leftArm = new Arm();
        Arm rightArm = new Arm();

        Leg leftLeg = new Leg();
        Leg rightLeg = new Leg();

       this.limbs = new CompositeLimb(leftArm, rightArm, leftLeg, rightLeg);

    }

    public void walk() {
        System.out.println("I am walking");
    }

    public class Arm extends Limb {

        public Arm() {
            name = "Arm";
        }

        @Override
        public void move() {
            System.out.println(name + " limbArm");
        }
    }

    public class Leg extends Limb {

        public Leg() {
            name = "Leg";
        }

        @Override
        public void move() {
            System.out.println(name + " limbLeg");
        }
    }

    public abstract class Limb {
        public String name;

        public abstract void move();
    }

    // composite template
    public class CompositeLimb extends Limb {

        public List<Limb> limbs;

        public CompositeLimb() {
            limbs = new ArrayList<>();
        }

        public CompositeLimb(Limb ... limbs) {
            this();
            this.limbs.addAll(Arrays.asList(limbs));
        }

        public CompositeLimb(List<Limb> limbs) {
            this.limbs = limbs;
        }

        @Override
        public void move() {
            for (Limb limb : limbs) {
                limb.move();
            }
        }

        public void addLimb(Limb limb) {
            limbs.add(limb);
        }
    }

    public static class HumanFunctionsNestedClass {
        public static void moveLegs() {
            id = "moveLegs";
        }
    }

    public class ActionInnerClass {
        public void run() {
            id = "actionRun";
            walk();
        }
    }

}
