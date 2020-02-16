class Main {
   public static void main(String[] args) {

      /*
       * UberX uberX = new UberX("AMQ123", new Account(1, "Andrés Herrera",
       * "AH3425534", "test@test.com", "1234"), "Chevrolet", "Spark");
       * uberX.setPassenger(4); uberX.printDataCar();
       * 
       * UberX uberX2 = new UberX("AMQ123", new Account(2, "Andrés Lolazo",
       * "AH3476324", "test2@test2.com", "5678"), "Chevrolet", "Spark");
       * uberX2.printDataCar();
       */

      UberVan uberVan = new UberVan("KFU890", new Account(3, "Andrés lol", "FJEM54355", "test@test.com", "1234"));
      uberVan.setPassenger(6);
      uberVan.printDataCar();
   }
}