package com.company;

public class ConcreteBlueRicky extends Tetris {

    @Override
    public Figures tetrisFigures() {
        return new BlueRicky();
    }
}
