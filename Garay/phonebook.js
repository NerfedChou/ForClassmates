const phonebook = {};

while (true) {
    console.log(`=========PhoneBook Menu=========`);
    let user = parseInt(prompt("1) Add new contact 2) Delete Contact 3) List Contacts 4) Exit?: "));

    if (user === 1) {
        const contactname = prompt("Enter contact name: ").toLowerCase().trim();
        const contactnumber = prompt("Enter contact number: ");
        phonebook[contactname] = contactnumber;
        console.log(`Contact ${contactname} added successfully.`);
    } else if (user === 2) {
        const contactname = prompt("Enter contact name to delete: ").toLowerCase().trim();
        if (phonebook.hasOwnProperty(contactname)) {
            delete phonebook[contactname];
            console.log(`Contact ${contactname} deleted successfully.`);
        } else {
            console.log(`Contact ${contactname} not found.`);
        }
    } else if (user === 3) {
        console.log("Contacts List:");
        for (let name in phonebook) {
            console.log(`${name}: ${phonebook[name]}`);
        }
    } else if (user === 4) {
        console.log("Exiting PhoneBook. Goodbye!");
        break;
    } else {
        console.log("Invalid option. Please try again.");
    }
}