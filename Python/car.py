from account import Account

class Car:
    id        = int
    licence   = str
    driver    = Account("","")
    passenger = int

    def __init__(self, license, driver):
        self.licence = license
        self.driver  = driver
        