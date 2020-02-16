from car import Car

if __name__ == "__main__":
    print("Hello World!!!")
    car = Car()
    car.license = "AMS343"
    car.driver = "Andrés Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "AKT432"
    car2.driver = "Lorena Herrera"
    print(vars(car2))
