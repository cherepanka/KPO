package com.company;


    public abstract class Tetris {

        public void tetris(){
            Figures figures = tetrisFigures();
            figures.figures();
        }

        public abstract  Figures tetrisFigures();
}
