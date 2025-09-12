let acc = [];

while(true) {
        console.log("=========MENU======");
        let choice = parseInt(prompt("1.Login 2.Signup 3.Exit"));
    if (choice === 2) {
        let username = prompt("Enter username: ");
        let password = prompt("Enter password: ");
        acc.push({username, password});
        console.log("Account created successfully");

    } else if (choice === 1) {

        let loguser = prompt('Enter username: ');
        let logpass = prompt('Enter Password: ');
        for (let i = 0; i < acc.length; i++) {
            if (acc[i].username === loguser && acc[i].password === logpass) {
                console.log('Login successful');
                break;
            } else {
                console.log('Invalid username or password');
            }

        }

    }
    else if (choice === 3){
        console.log('Goodbye!');
        break;
    }
}