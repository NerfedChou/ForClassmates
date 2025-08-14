let number = parseInt(prompt("Enter a number: "));

    for (let i = 1; i <= 10; i++) {
        let answer = number * i;
        console.log(`${number} x ${i} = ${answer}`);
    }