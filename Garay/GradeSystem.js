function gradeconverter(grades) {
    if (grades === 100) return "Excellent: 1";
    else if (grades === 98 || grades === 99) return "Excellent - 1.1";
    else if (grades === 96 || grades === 97) return "Excellent - 1.2";
    else if (grades === 94 || grades === 95) return "Excellent - 1.3";
    else if (grades === 92 || grades === 93) return "Very Good - 1.4";
    else if (grades === 90 || grades === 91) return "Very Good - 1.5";
    else if (grades === 89) return "Very - 1.6";
    else if (grades === 88) return "Very - 1.7";
    else if (grades === 87) return "Good - 1.8";
    else if (grades === 86) return "Good - 1.9";
    else if (grades === 85) return "Good - 2";
    else if (grades === 84) return "Good - 2.1";
    else if (grades === 83) return "Average - 2.2";
    else if (grades === 82) return "Average - 2.3";
    else if (grades === 81) return "Average - 2.4";
    else if (grades === 80) return "Average - 2.5";
    else if (grades === 79) return "Below Average - 2.6";
    else if (grades === 78) return "Below Average - 2.7";
    else if (grades === 77) return "Below Average - 2.8";
    else if (grades === 76) return "Below Average - 2.9";
    else if (grades === 75) return "Passing - 3";
    else if (grades < 74) return "Failed - 5.0";
    else return "Invalid";
}
function cleanSpace(str) {
    return str.replace(/\s+/g, "");
}
let input = prompt("Enter Grades: ");
let grade = cleanSpace(input);
console.log(gradeconverter(parseInt(grade)));
