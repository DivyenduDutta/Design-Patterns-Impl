from Singleton import Singleton_API 
from models.Models import Car

def main():
    class_name = Car 
    uniqueInstance1 = Singleton_API(class_name)
    uniqueInstance2 = Singleton_API(class_name)

    uniqueInstance1.getUniqueInnerInstance().printDetails()

if __name__ == "__main__":
    main()
