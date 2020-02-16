class Card extends Payment {
   String number;
   String dateCard;
   String cvv;

   public Card(Integer id, String number, String dateCard, String cvv) {
      super(id);
      this.number = number;
      this.dateCard = dateCard;
      this.cvv = cvv;
   }
}