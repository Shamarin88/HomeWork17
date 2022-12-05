public class Car extends Race implements Competing {
    private final String pitStop = " заезжает на Пит-Стоп";
    private final String bestLapTime = "2:14:18";
    private final Integer maxSpeed = 230;
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startRace() {
        System.out.println(getModel() + " " + getBrand() + " начинает движение");
        System.out.println(getModel() + " " + getBrand() + "набирает скорость");
    }

    @Override
    public void endRace() {
        System.out.println(getModel() + " " + getBrand() + " сбрасывает скорость");
        System.out.println(getModel() + " " + getBrand() + " останавливается");
    }

    @Override
    public void getPitStop() {
        System.out.println(getModel() + " " + getBrand() + pitStop);
    }

    @Override
    public void getBestLapTime() {
        System.out.println(getModel() + " " + getBrand() + " Лучшее время круга " + bestLapTime);
    }

    @Override
    public void getMaxSpeed() {
        System.out.println(getModel() + " " + getBrand() + " Максимальная скорость " + maxSpeed);
    }
}
