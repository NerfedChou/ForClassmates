<?php

require_once 'connection.php';//gi balhin nako

//antido ikaw sa system nato
// --- SIGN UP LOGIC ---
if (isset($_POST["signup"])) {

    $name = $_POST["name"];
    $email = $_POST["email"];
    $password = $_POST["password"];

    // Check if email already exists
    $check_sql = "SELECT * FROM accounts WHERE email = '$email'";
    $result = $conn->query($check_sql); // Use the object-oriented method: $conn->query()

    if ($result->num_rows > 0) {
        echo "Email already exists <br><br>";
    } else {
        // Insert the new account
        $insert_sql = "INSERT INTO accounts (name, email, password) VALUES ('$name', '$email', '$password')";
        if ($conn->query($insert_sql) === TRUE) {
            echo "Account created successfully <br><br>";
        } else {
            // If the query fails, show the error
            echo "Error: " . $insert_sql . "<br>" . $conn->error;
        }
    }
}


// --- LOGIN LOGIC ---
if (isset($_POST["login"])) {

    $email = $_POST["email"];
    $password = $_POST["password"];

    $login_sql = "SELECT * FROM accounts WHERE email = '$email' AND password = '$password'"; //CONSTRUCTOR NI UNTA
    $result = $conn->query($login_sql); // Use the object-oriented method

    if ($result->num_rows > 0) {
        $row = $result->fetch_assoc();
        // Use the correct column case: "name" not "NAME"
        echo "Welcome " . $row["name"] . "<br><br>";
        echo "<a href='Form.html'>Click here to go back to the home page</a>";
    } else {
        echo "Login failed <br><br>";
    }
}

// Close the connection at the end of the script

//GI CHATGPT NINNIYO KLARO KAAYO DAKPAN TANG SIR ANI
$conn->close();
?>


