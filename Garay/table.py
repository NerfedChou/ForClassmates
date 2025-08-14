number = int(input("Enter: "))
x = 1

while x <= 10:
    ans = number * x
    print(f'{number} x {x} = {ans}')
    x += 1
    
for i in range(1,11):
    product = number * i
    print(f"{number} x {i} = {product}")