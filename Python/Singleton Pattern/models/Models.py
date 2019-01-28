''' Defined models - Car and Person to be tested with Singleton impl'''
class Car:
    def __init__(self, model = "Hyundai", speed = 0):
        self.speed = speed
        self.model = model

    def printDetails(self):
        print("The details are: Car {} has speed {}".format(self.model, self.speed))

class Person:
    def __init__(self, name = "Ram", id_number = 1):
        self.id_number = id_number
        self.name = name

    def printDetails(self):
        print("{} has identity number {}".format(self.name, self.id_number))
