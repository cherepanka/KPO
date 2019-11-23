package com.company;

public class ConcreteTeewee extends Tetris {
    @Override
    public Figures tetrisFigures() {
        return new Teewee();
    }
}
