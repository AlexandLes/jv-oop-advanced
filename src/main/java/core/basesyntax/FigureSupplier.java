package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double LENGHT = 50.0;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getFigureType() {
        int numOfTypes = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[numOfTypes]) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), randomVal());
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), randomVal());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), randomVal(), randomVal());
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(), randomVal());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomVal(), randomVal(), randomVal());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE,10);
    }

    private double randomVal() {
        return random.nextDouble() * LENGHT;
    }
}