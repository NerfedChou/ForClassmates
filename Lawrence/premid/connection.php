<?php


$hostname = "localhost";
$username = "root";
$password = "";
$dbname = "premid";

$conn = mysqli_connect($hostname, $username, $password, $dbname);

if($conn===false){
        die("Error: Could not connect" . mysqli_connect());

}

//configure session cookie parameters