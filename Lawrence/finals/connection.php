<?php


$hostname = "localhost";
$username = "root";
$password = "";
$dbname = "finals";

$conn = new mysqli($hostname, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

echo "BACK END 202 SUCCESSFULLY STATUS RUNNING";