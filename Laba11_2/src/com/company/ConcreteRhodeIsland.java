package com.company;

public class ConcreteRhodeIsland extends Tetris {
    @Override
    public Figures tetrisFigures() {
        return new RhodeIsland();
    }
}
