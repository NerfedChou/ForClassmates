<!DOCTYPE html>
<html>
    <body>
    Your first name is <?php echo $_POST["firstName"]; ?><br>
    Your last name is <?php echo $_POST["lastName"]; ?><br>
    Your Email is <?php echo $_POST["email"];  ?><br>
    Your password is <?php echo $_POST["password"]; ?><br>
    <?php
    echo "Welcome to the website";
        $conn = mysqli_connect("localhost", "root", "", "jan");

        if (!$conn) {
            die("Connection failed: " . mysqli_connect_error());
        }
        $firstName = $_POST["firstName"];
        $lastName = $_POST["lastName"];
         $email = $_POST["email"];
         $password = $_POST["password"];
         $sql = "INSERT INTO angulo (firstName, lastName, email, password) VALUES ('$firstName', '$lastName', '$email', '$password')";// Change angulo to your database name
         if (mysqli_query($conn, $sql)) {
             echo "New record created successfully";
         } else {
             echo "Error: " . $sql . "<br>" . mysqli_error($conn);
         }
         mysqli_close($conn);
    ?>
    </body>
</html>