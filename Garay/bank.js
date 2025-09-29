let money = 0;

while (true) {
    console.log("==========Wellcome to the Bank==========");
    console.log("1. Add Money");
    console.log("2. Withdraw Money");
    console.log("3. Check Balance");
    console.log("4. Exit");
    const choice = parseInt(prompt("Enter your choice (1-4): "));

    if (choice === 1) {
        money = addMoney(money);
    } else if (choice === 2) {
        money = subtractMoney(money);
    } else if (choice === 3) {
        checkMoney(money);
    } else if (choice === 4) {
        console.log("Exiting the program.");
        break;
    } else {
        console.log("Invalid choice. Please try again.");
    }
}

function addMoney(money) {
    let deposit = parseFloat(prompt("Enter amount to deposit: "));
    money += deposit;
    return money;
}

function subtractMoney(money) {
    let withdraw = parseFloat(prompt("Enter amount to withdraw: "));
    if (withdraw > money) {
        console.log("Insufficient funds.");
        return money;
    } else {
        money -= withdraw;
        return money;
    }
}

function checkMoney(money) {
    console.log(`Current balance: $${money}`);
}

