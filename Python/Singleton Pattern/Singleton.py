class Singleton_API(object):
    ''' [Singleton_API class]
        Singleton API in python 
        [Usage] : uniqueInstance1 = Singleton_API(<class_name>, <arguments to constructor>)
                  uniqueInstance1.getUniqueInnerInstance() to get reference to the passed type object.  '''

    '''Do not access _uniqueInnerInstance directly. Access it via getUniqueInnerInstance()'''
    _uniqueInnerInstance = None
    _is_instance_present = False

    def __new__(cls, class_name, *args):
        ''' Overriding __new__() to customize object creation '''
        if not hasattr(cls, 'instance'):
            cls.instance = super(Singleton_API, cls).__new__(cls)
            return cls.instance 
        cls._is_instance_present  = True
        return cls.instance

    def __init__(self, class_name, *args):
        print(self._is_instance_present)
        if not self._is_instance_present:
            self._uniqueInnerInstance = class_name(*args)

    def getUniqueInnerInstance(self):
        return self._uniqueInnerInstance 


