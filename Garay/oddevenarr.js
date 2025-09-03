let num = parseInt(prompt("How many numbers do you want to enter?: "));
let arreven = [];
let arrodd = [];
    let arrofnumbers = [];
    for(let i = 0; i < num; i++){
        let number = parseInt(prompt("Enter a number: "));
        arrofnumbers.push(number);
    }
    console.log("All numbers " + arrofnumbers);

    for (let i = 0; i < arrofnumbers.length; i++) {
        if (arrofnumbers[i] % 2 === 0) {

            arreven.push(arrofnumbers[i]);
        } else {

            arrodd.push(arrofnumbers[i]);

        }
    }
console.log(`Even numbers: ${arreven}. Count: ${arreven.length}`);
console.log(`Odd numbers: ${arrodd}. Count: ${arrodd.length}`);