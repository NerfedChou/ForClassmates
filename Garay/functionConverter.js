function degreeConverter(temp) {
    return temp * 1.8 + 32;
}

function meterConverter(meter) {
    return meter * 3.281;
}

function kilogramConverter(kg) {
    return kg * 2.205;
}


while (true) {
    console.log("Choose a conversion type: ");
    console.log("1. Degree Celsius to Fahrenheit");
    console.log("2. Meter to Feet");
    console.log("3. Kilogram to Gram");
    console.log("4. Exit");

    const choice = prompt("Enter your choice (1-4): ");

    if (choice === '4') {
        console.log("Exiting the program.");
        break;
    } else if (choice === '1') {
        const celsius = parseFloat(prompt("Enter temperature in Celsius: "));
        const fahrenheit = degreeConverter(celsius);
        console.log(`${celsius}°C is ${fahrenheit}°F`);
    } else if (choice === '2') {
        const meter = parseFloat(prompt("Enter length in meters: "));
        const feet = meterConverter(meter);
        console.log(`${meter} meters is ${feet} feet`);
    } else if (choice === '3') {
        const kg = parseFloat(prompt("Enter weight in kilograms: "));
        const grams = kilogramConverter(kg);
        console.log(`${kg} kg is ${grams} grams`);
    } else {
        console.log("Invalid choice. Please try again.");
    }
}