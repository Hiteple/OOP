<?php 
   require_once('Payment.php');

   class Card extends Payment {
      public $number;
      public $dateCard;
      public $cvv;

      public function __construct($id, $number, $dateCard, $cvv) {
         parent::__construct($id);
         $this->number = $number;
         $this->dateCard = $dateCard;
         $this->cvv = $cvv;
      }
   }
?>