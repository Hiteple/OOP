import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
   Map<String, Map<String, Integer>> typeCarAccepted;
   ArrayList<String> seatsMaterial;
   private Integer passengers;

   public UberVan(String license, Account driver) {
      super(license, driver);
   }

   @Override
   public void setPassenger(Integer passenger) {
      if (passenger == 6) {
         this.passengers = passenger;
         System.out.println(this.passengers);
      } else {
         System.out.println("You need to assign six passengers");
      }
   }

   @Override
   void printDataCar() {
      if (passengers != null) {
         System.out
               .println("License: " + getLicense() + ", driver: " + getDriver().name + ", passengers: " + passengers);
      }
   }
}