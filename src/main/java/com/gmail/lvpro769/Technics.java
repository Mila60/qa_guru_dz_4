package com.gmail.lvpro769;

public class Technics {

     static class Technics.Cars {
        String brand;
        int power;
        int speed;

        public void sayBrand() {
            System.out.println(brand);
        }

            public static void main(String[] args) {
                System.out.println("Tехника");

                Technics.Cars volga = new Technics.Cars();
                volga.brand = "Волга";
                     volga.power = 90;
                volga.speed = 120;

                System.out.println(volga.brand);
                System.out.println(volga.power);
                System.out.println(volga.speed);

            }
        }
}
