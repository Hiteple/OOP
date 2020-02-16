class Main {
   public static void main(String[] args) {
      System.out.println("Hello World!!!");

      Car car = new Car("AMQ123", new Account("Andrés Herrera", "AH3425534"));
      car.passengers = 4;
      car.printDataCar();

      Car car2 = new Car("AMQ123", new Account("Andrés Lolazo", "AH3345464"));
      car2.passengers = 3;
      car2.printDataCar();
   }
}