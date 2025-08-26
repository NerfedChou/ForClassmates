let letters = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'];

for (let i = 0; i < letters.length; i++) {
    console.log(letters[i]);
}

let len = letters.length - 1;

for (let i = len; i >= 0; i--) {
    console.log(letters[i]);
}

//methods

letters.push('I');
console.log(letters);
letters.pop();
console.log(letters);
letters.shift();
console.log(letters);
letters.unshift("A");
console.log(letters);
letters.splice(0,1 );
console.log(letters);