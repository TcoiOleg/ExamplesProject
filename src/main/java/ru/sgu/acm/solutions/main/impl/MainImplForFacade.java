package ru.sgu.acm.solutions.main.impl;

import ru.sgu.acm.solutions.main.Main;
import ru.patterns.facade.Computer;

/**
 * User: 1
 * Date: 09.09.15
 */
public class MainImplForFacade implements Main {
    @Override
    public void runMain() {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
