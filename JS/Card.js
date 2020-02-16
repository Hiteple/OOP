class Card extends Payment {
	constructor(id, number, dateCard, cvv) {
		super(id);
		this.number = number;
		this.dateCard = dateCard;
		this.cvv = cvv;
	}
}
