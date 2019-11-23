package com.company;

public class ConcreteHero extends Tetris {
    @Override
    public Figures tetrisFigures() {
        return new Hero();
    }
}
