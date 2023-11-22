# Printing normal helloworld
print("HelloWorld")

# Wishing the user hello
a = "Hello, "
b = input("Enter your name: ")
c = a + b
print(c)

# Adding two numbers which are given by the user
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))
c = a + b
print("The sum of two number's is: ",c)

# Telling the user whether his age is above or below 18
a = input("Enter your name: ")
b = int(input("Enter your age in number: "))
if b<18: 
    print("\"Your age is below 18\"")
else:
    print("\"Your age is above 18\"")

# Using while loop
i = 0 
while i < 550:
      print(i, str("Yes"))
      i = i + 1
