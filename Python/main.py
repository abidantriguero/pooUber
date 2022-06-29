from lib2to3.pgen2 import driver
from car import Car
from UberX import UberX
from account import Account

if __name__ == "__main__":
    print("Hola mundo")
    
    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))

    uberX = UberX("AS678", Account("Andrea Ferran", "ANDA765"), "Chevrolet", "Spark")
    print(vars(uberX))
    print(vars(uberX.driver))