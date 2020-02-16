class Main {
   public static void main(String[] args) {
      System.out.println("Hello World!!!");

      Car car = new Car();
      car.license = "AMQ123";
      car.driver = "Andrés Herrera";
      car.passengers = 4;
      car.printDataCar();

      Car car2 = new Car();
      car2.license = "AUB355";
      car2.driver = "Julio Verne";
      car2.passengers = 3;
      car2.printDataCar();
   }
}