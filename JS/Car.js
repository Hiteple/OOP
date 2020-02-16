class Car {
	constructor(id, license, driver, passenger) {
		this.id = id;
		this.license = license;
		this.driver = driver;
		this.passenger = passenger;
	}

	printDataCar() {
		console.log(this.driver);
		console.log(this.driver.name);
		console.log(this.driver.document);
		console.log(this.license);
	}
}
