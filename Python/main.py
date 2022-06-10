from car import Car

if __name__ == "__main__":
    print("Hola mundo")
    car = Car()
    car.licence = "AMS234"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.licence = "QWE567"
    car2.driver = "Matha"
    print(vars(car2))
