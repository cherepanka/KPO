package com.company;

public class ConcreteSmashboy extends Tetris {
    @Override
    public Figures tetrisFigures() {
        return new Smashboy();
    }
}
