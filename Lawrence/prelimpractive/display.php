<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel = "stylesheet" href = "styles.css"/>
    <title>Display</title>
</head>
<body>
    <?php
       $name =  $_POST["name"];
       $username = $_POST["username"];
       $password = $_POST["password"];
        
       echo "Your name is: " . $name . "<br>";
       echo "Your username is: " . $username . "<br>";
       
       $masked = str_repeat("*", strlen($password));
       echo "Your password is: " . $masked . "<br>";
    ?>  
    <form action="prelim.php">
        <input type="submit" value="Submit">
    </form>

</body>
</html>