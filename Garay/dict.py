name = {
    "Name": "Alex",
    "Age": 20,
    "Gender": "Male",
}

print(name)

print(name["Name"])

print(len(name))

print(name.keys())

print(name.values())

for k, v in name.items():
    print(k, v)

for k in name:
    print(name[k])

name["Name"] = "Jane"
name["Age"] = 22
name["Gender"] = "Female"

name["Course"] = "Bachelor"

name.pop("Course")

name.clear()

print(name)