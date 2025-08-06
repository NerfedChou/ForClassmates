inputs = input("Enter Grades: ")
grade = int(inputs)
if grade == 100:
    print("Excellent - 1")
elif grade == 98 or grade == 99:
    print("Excellent - 1.1")
elif grade == 96 or grade == 97:
    print("Excellent - 1.2")
elif grade == 94 or grade == 95:
    print("Excellent - 1.3")
elif grade == 92 or grade == 93:
    print("Very Good- 1.4")
elif grade == 90 or grade == 91:
    print("Very Good - 1.5")
elif grade == 89:
    print("Very Good - 1.6")
elif grade == 88:
    print("Very Good - 1.7")
elif grade == 87:
    print("Good - 1.8")
elif grade == 86:
    print("Good - 1.9")
elif grade == 85:
    print("Good - 2.0")
elif grade == 84:
    print("Good - 2.1")
elif grade == 83:
    print(" Average - 2.2")
elif grade == 82:
    print(" Average - 2.3")
elif grade == 81:
    print(" Average - 2.4")
elif grade == 80:
    print(" Average - 2.5")
elif grade == 79:
    print(" Below Average - 2.6")
elif grade == 78:
    print(" Below Average - 2.7")
elif grade == 77:
    print(" Below Average - 2.8")
elif grade == 76:
    print(" Below Average - 2.9")
elif grade == 75:
    print("Passing - 3.0")
elif grade <= 74:
    print("Failed - 5.0")
else:
    print("Invalid")
