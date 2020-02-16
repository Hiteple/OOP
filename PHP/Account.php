<?php
   class Account {
      public $id;
      public $name;
      public $document;
      public $email;
      public $password;

      public function __construct($id, $name, $document, $email, $password){
         $this->id = $id;
         $this->name = $name;
         $this->document = $document;
         $this->email = $email;
         $this->password = $password;
      }
   }
?>