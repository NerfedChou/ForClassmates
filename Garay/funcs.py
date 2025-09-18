#normal
def my_func():
    print("Hello")

my_func()

#parameterize
def my_parameterize_func(name):
    print(f"Hello {name}")

my_parameterize_func("Antido")

#Arbitrary
def my_arbitrary_func(* name):
    print(f"Hello {name[2]}")

my_arbitrary_func("Antido", "Angulo", "ALice")

#keyword arguments

def my_keyword_func2(name3, name2, name1):
    print(f"Hello {name3}")

my_keyword_func2(name1= "Antido", name2= "Angulo", name3= "ALice")

#Arbitrary keyword arguments

def my_keyword_func3(** name):
    print(f"Hello {name["lname"]}")

my_keyword_func3(lname= "Antido", fname= "Juniferio")

def my_function_list(list_names):
    for x in list_names:
        print(x)


my_function_list([1, 2, 3])

#Not yet implemented

def my_function_list2(list_names):
    pass