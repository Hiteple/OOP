from payment import Payment

class Card(Payment):
   number = str
   dateCard = str
   cvv = str

   def __init__(self, id, number, dateCard, cvv):
      super().__init__(id)
      self.number = number
      self.dateCard = dateCard
      self.cvv = cvv