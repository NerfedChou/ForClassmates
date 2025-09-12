<?php
include "conn.php";
if (isset($_POST["signup"])) {

    $conn = new mysqli("localhost", "root", "", "finals");
    $name = $_POST["name"];
    $email = $_POST["email"];
    $password = $_POST["password"];
    $sql = "INSERT INTO accounts (name, email, password) VALUES ('$name', '$email', '$password')";

    $check = "SELECT * FROM accounts WHERE email = '$email'";
    $result = mysqli_query($conn, $check);
    if (mysqli_num_rows($result) > 0) {
        echo "Email already exists <br><br>";
    } else {
        mysqli_query($conn, $sql);
        echo "Account created successfully <br><br>";
    }
    mysqli_close($conn);
}

if (isset($_POST["login"])) {

    $conn = new mysqli("localhost", "root", "", "finals");
    $email = $_POST["email"];
    $password = $_POST["password"];
    $sql = "SELECT * FROM accounts WHERE email = '$email' AND password = '$password'";
    $result = mysqli_query($conn, $sql);
    if (mysqli_num_rows($result) > 0) {
        $row = mysqli_fetch_assoc($result);
        echo "Welcome " . $row["NAME"] . "<br><br>";
        echo "<a href='Form.html'>Click here to go back to the home page</a>";
    } else {
        echo "Login failed <br><br>";
    }
    mysqli_close($conn);
}



