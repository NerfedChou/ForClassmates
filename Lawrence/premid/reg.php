<?php
require_once 'connection.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $firstname = trim($_POST['first_name']);
    $middlename = trim($_POST['middle_name']);
    $lastname = trim($_POST['last_name']);
    $username = trim($_POST['user_name']);
    $email = trim($_POST['email']);
    $password = password_hash($_POST['user_password'], PASSWORD_DEFAULT);

    $stmt = $conn->prepare("INSERT INTO accounts (first_name, middle_name, last_name, user_name, email, user_password) VALUES (?, ?, ?, ?, ?, ?)");
    if (!$stmt) {
        die("SQL error: " . $conn->error);
    }
  
    $stmt->bind_param("ssssss", $firstname,$middlename,$lastname,$username,$email,$password);

    if ($stmt->execute()) {
            header("Location: login.php");
    } else {
        echo "Error: " . $stmt->error;
    }

    $stmt->close();
}
?>





<!DOCTYPE html>
     <html>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" type="text/css" href="CSS/bootstrap.css">
        <head><title>REGISTRATION</title>
         </head>
         <body class="bg-white">

              <div class="container">
              <div class="row">
                <div class="col-lg-6 m-auto">
                    <div class="card mt-5">
                    <div class="card-title">
                        <h3 class="bg-success text-white text-center py-3"> Registration </h3>
                </div>
                <div class="card-body">
                    <form method="POST" action="">
                    <input type="text" class="form-control mb-2" placeholder="First Name" name="first_name">
                    <input type="text" class="form-control mb-2" placeholder="Middle Name" name="middle_name">
                    <input type="text" class="form-control mb-2" placeholder="Last Name" name="last_name">
                    <input type="text" class="form-control mb-2" placeholder="User Name" name="user_name">
                    <input type="email" class="form-control mb-2" placeholder="Email" name="email">
                    <input type="password" class="form-control mb-2" placeholder="Password" name="user_password">
                    <button class="btn btn-primary" name="submit">Signup</button><br><br>
                    <p>already have an account <a href="login.php">Login</a></p>
                 
                </form>
           </div>
         </div>

        </div>
     </div>
</body>
</html>
  
