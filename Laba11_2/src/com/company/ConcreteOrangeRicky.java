package com.company;

public class ConcreteOrangeRicky extends Tetris {
    @Override
    public Figures tetrisFigures() {
        return new OrangeRicky();
    }
}
