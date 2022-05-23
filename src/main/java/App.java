import model.Car;
import model.Color;

public class App {
    public static void main(String[] args) {

        Car ferrari = new Car("ferrari");
        Car lamborghini = new Car("lamborghini");
        Car fiat = new Car("fiat");

        ferrari.setColor(Color.RED);
        ferrari.setMaxSpeed(299);
        ferrari.getEngine().setCapacity(5700);
        ferrari.getEngine().setPower(720);

        lamborghini.setColor(Color.YELLOW);
        lamborghini.setMaxSpeed(302);
        lamborghini.getEngine().setCapacity(6000);
        lamborghini.getEngine().setPower(800);

        fiat.setColor(Color.BLUE);
        fiat.setMaxSpeed(160);
        fiat.getEngine().setCapacity(1600);
        fiat.getEngine().setPower(90);

        System.out.println(fiat);
    }
}
