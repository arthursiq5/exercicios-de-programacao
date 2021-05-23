class Cat:
    def __init__(self, color, legs):
        self.color = color
        self.legs = legs
    
    def sound(self):
        print('Meow')

felix = Cat('Siamês', 4)
print('Felix { Cor:', felix.color, ', Patas:', felix.legs, '}')
felix.sound()
tigre = Cat('Laranja', 4)
print('Tigre { Cor:', tigre.color, ', Patas:', tigre.legs, '}')
