package java;

class Calculator:
    def add(self, a, b):
        return a + b

    def add(self, a, b, c):
        return a + b + c

# create a calculator object
calc = Calculator()

# call the add method with two arguments
result1 = calc.add(3, 4)
print("Result with two arguments:", result1)

# call the add method with three arguments
result2 = calc.add(3, 4, 5)
print("Result with three arguments:", result2)