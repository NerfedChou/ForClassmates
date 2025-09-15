<?php

 $name = $_POST["name"];
 $email = $_POST["email"];


 $serverName = "localhost";
 $connectionOptions = [
    "Database"=>"form",
     "UID"=>"",
     "PWD"=>""
 ];
$conn = sqlsrv_connect($serverName, $connectionOptions);

if ($conn === false) {
    die(print_r(sqlsrv_errors(), true));
}

sqlsrv_query($conn, "INSERT INTO dbo.signin (name, email) VALUES ('$name', '$email')");

$res = Sqlsrv_query($conn, "SELECT * FROM dbo.signin");

while ($row = sqlsrv_fetch_array($res, SQLSRV_FETCH_ASSOC)) {
    echo $row['name'] . " " . $row['email'] . "<br>";
}
