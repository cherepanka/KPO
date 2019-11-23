package com.company;

public class ConcreteCleveland extends Tetris {
    @Override
    public Figures tetrisFigures() {
        return new Cleveland();
    }
}
