package Exercicio1.entities;

public class Rectangle {
        public double width, height;

        public double Area(){
            return width * height;
        }

        public double Perimeter(){
            return 2 * (width + height);
        }

        public double Diagonal(){
            return Math.sqrt(width * width + height * height);
        }
}
