num = int(input("Enter how many numbers you will enter: "))
arrnum = []
arreven = []
arrodd = []

for i in range(num):
    numput = int(input("Enter number: "))
    arrnum.append(numput)

for j in range(num):
    if arrnum[j] % 2 == 0:
        arreven.append(arrnum[j])
    else:
        arrodd.append(arrnum[j])

print(f"All numbers: {arrnum}")

print(f"Even Numbers: {arreven} Count: {len(arreven)}")

print(f"Odd Numbers: {arrodd} Count: {len(arrodd)}")

