# deque example

class DequeClass:

    def __init__(self):
        self.elements = []

    def addingToFront(self, element):
        self.elements.append(element)

    def addingToBack(self, element):
        self.elements.insert(0, element)

    def removeFromFront(self):
        self.elements.pop()

    def removeFromBack(self):
        self.elements.pop(0)

    def isEmptyDeque(self):
        return self.elements == []

    def sizeOfDequeClass(self):
        return len(self.elements)


dequeObject = DequeClass()
print(dequeObject.isEmptyDeque())
dequeObject.addingToFront("John")
dequeObject.addingToFront("Json")
dequeObject.addingToBack(4)
print(dequeObject.isEmptyDeque())
print(dequeObject.sizeOfDequeClass())

for element in range(0, 1):
    print(dequeObject.elements)

dequeObject.addingToFront("Smith")
dequeObject.addingToFront(55)
dequeObject.addingToBack(40)
dequeObject.addingToBack("Web")

for elements in range(0, 1):
    print(dequeObject.elements)

dequeObject.removeFromBack()
dequeObject.removeFromFront()

for elements in range(0, 1):
    print(dequeObject.elements)





