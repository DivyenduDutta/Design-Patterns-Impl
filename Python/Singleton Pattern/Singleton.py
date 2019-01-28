class Singleton_API(object):
    ''' [Singleton_API class]
        Singleton API in python '''

    '''Do not access _uniqueInnerInstance directly. Access it via getUniqueInnerInstance()'''
   # _uniqueInnerInstance = None

    def __new__(cls, class_name, *args):
        ''' Overriding __new__() to customize object creation '''
        if not hasattr(cls, 'instance'):
            cls.instance = super(Singleton_API, cls).__new__(cls)
        return cls.instance

    def __init__(self, class_name, *args):
        self._uniqueInnerInstance = class_name(*args)

    def getUniqueInnerInstance(self):
        return self._uniqueInnerInstance 


