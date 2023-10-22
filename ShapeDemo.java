public class ShapeDemo {
    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            System.out.println(shape + " - Area: " + shape.calculateArea() + ", Perimeter: " + shape.calculatePerimeter());
        }
    }

    public enum Shape {
        CIRCLE {
            @Override
            public double calculateArea() {
                double radius = 5.0; // Replace with the actual radius
                return Math.PI * radius * radius;
            }

            @Override
            public double calculatePerimeter() {
                double radius = 5.0; // Replace with the actual radius
                return 2 * Math.PI * radius;
            }
        },
        SQUARE {
            @Override
            public double calculateArea() {
                double sideLength = 4.0; // Replace with the actual side length
                return sideLength * sideLength;
            }

            @Override
            public double calculatePerimeter() {
                double sideLength = 4.0; // Replace with the actual side length
                return 4 * sideLength;
            }
        },
        TRIANGLE {
            @Override
            public double calculateArea() {
                double base = 6.0; // Replace with the actual base length
                double height = 4.0; // Replace with the actual height
                return 0.5 * base * height;
            }

            @Override
            public double calculatePerimeter() {
                double side1 = 3.0; // Replace with the length of the first side
                double side2 = 4.0; // Replace with the length of the second side
                double side3 = 5.0; // Replace with the length of the third side
                return side1 + side2 + side3;
            }
        };

        public abstract double calculateArea();
        public abstract double calculatePerimeter();
    }
          }
