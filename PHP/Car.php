<?php 
   class Car {
      public $id;
      public $license;
      public $driver;
      public $passengers;

      public function __construct($license, $driver) {
         $this->license = $license;
         $this->driver = $driver;
      }

      public function printDataCar() {
         echo "License: " . $this->license . ", driver: " . $this->driver;
      }
   }
?>