const person = {
    Name: "John",
    Age: 29,
    Gender: "Male",
    Country: "United Kingdom"
};

console.log(person);

console.log(person.Name);

console.log(person["Name"]);

person.Name = "Antido";
person.course = "IT"; //adds a property

console.log(person);

delete person.course;

console.log(person);

for (let key in person) {

    console.log(person[key]);

    delete person[key];
}

console.log(person);

const car = {
    brand: "Toyota",
    model: "Raize"
}