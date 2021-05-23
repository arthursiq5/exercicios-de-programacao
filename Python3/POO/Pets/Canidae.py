from Animal import Animal

class Wolf(Animal):
    def bark(self):
        print('Grrr...')

class Dog(Wolf):
    # exemplo de sobrescrita de método
    def bark(self):
        print('Woof!')
