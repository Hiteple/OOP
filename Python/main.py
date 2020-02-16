from car import Car
from account import Account

if __name__ == "__main__":
    print("Hello World!!!")
    
    car = Car("JDI786", Account("Andrés Herrera", "IP3534554"))
    print(vars(car))
    print(vars(car.driver))
