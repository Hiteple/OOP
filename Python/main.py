from car import Car
from account import Account
from uberX import UberX

if __name__ == "__main__":
    
    car = UberX("JDI786", Account("Andrés Herrera", "IP3534554"), "Chevrolet", "Spark")
    print(vars(car))
