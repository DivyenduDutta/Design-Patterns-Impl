from Singleton import Singleton_API 
from models.Models import Car

def main():
    class_name = Car 
    uniqueInstance1 = Singleton_API(class_name, 40, "BMW")
    uniqueInstance2 = Singleton_API(class_name, 50, "Ferrari")

    uniqueInstance1.getUniqueInnerInstance().printDetails()
    uniqueInstance2.getUniqueInnerInstance().printDetails()

if __name__ == "__main__":
    main()
