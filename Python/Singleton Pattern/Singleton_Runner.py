from Singleton import Singleton_API 
from models.Models import Car

def main():
    class_name = Car 
    uniqueInstance1 = Singleton_API(class_name, 40, "BMW")
    uniqueInstance2 = Singleton_API(class_name, 50, "Ferrari")

    uniqueInstance1.getUniqueInnerInstance().printDetails()
    uniqueInstance2.getUniqueInnerInstance().printDetails()
    
    Singleton_API.free_instance()
    uniqueInstance3 = Singleton_API(class_name, 60, "Mercedes")
    
    print("After free_instance() call")
    uniqueInstance1.getUniqueInnerInstance().printDetails()
    uniqueInstance2.getUniqueInnerInstance().printDetails()
    uniqueInstance3.getUniqueInnerInstance().printDetails()


if __name__ == "__main__":
    main()
