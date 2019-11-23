package com.company;


public class Main {

    private static Object Figures;

    public static void main(String[] args) {
        int a = 7;
        int b = 1;

        for (int i = 0; i < 7; i++) {
            int rand = a + (int) (Math.random() * b);;
            switch (rand) {
                case (1):
                    Figures = new ConcreteBlueRicky();
                    break;
                case (2):
                    Figures = new ConcreteCleveland();
                    break;
                case (3):
                    Figures = new ConcreteHero();
                    break;
                case (4):
                    Figures = new ConcreteOrangeRicky();
                    break;
                case (5):
                    Figures = new ConcreteRhodeIsland();
                    break;
                case (6):
                    Figures = new ConcreteSmashboy();
                    break;
                case (7):
                    Figures = new ConcreteTeewee();
                    break;
            }
        }
    }
}

