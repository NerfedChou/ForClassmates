<?php
session_start();
require_once 'connection.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $username = trim($_POST['user_name']);
    $email = trim($_POST['email']);
    $password = $_POST['user_password'];

    $stmt = $conn->prepare("SELECT id, user_password, user_name FROM accounts WHERE email=?");
    $stmt->bind_param("s", $email);
    $stmt->execute();
    $stmt->store_result();

    if ($stmt->num_rows > 0) {
        $stmt->bind_result($id, $hashed_password, $db_user_name);
        $stmt->fetch();

        if (password_verify($password, $hashed_password)) {
            $_SESSION['user_id'] = $id;
            $_SESSION['user_name'] = $db_user_name; // trust DB value
            $_SESSION['email'] = $email;
            header("Location: index.php");
            exit; // important to stop execution after redirect
        } else {
            $login_error = "Invalid password.";
        }
    } else {
        $login_error = "User not found.";
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
    <head><title>LOGIN</title></head>
    <body class="bg-white">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 m-auto">
                    <div class="card mt-5">
                        <div class="card-title">
                            <h3 class="bg-success text-white text-center py-3"> Login </h3>
                        </div>
                        <div class="card-body">
                            <?php if (!empty($login_error)): ?>
                                <div class="alert alert-danger" role="alert"><?php echo htmlspecialchars($login_error); ?></div>
                            <?php endif; ?>
                            <form method="POST" action="">
                                <input type="text" class="form-control mb-2" placeholder="User Name" name="user_name" required>
                                <input type="email" class="form-control mb-2" placeholder="Email" name="email" required>
                                <input type="password" class="form-control mb-2" placeholder="Password" name="user_password" required>
                                <button type="submit" class="btn btn-primary" name="submit">Login</button><br><br>
                                <p>Don't have an account <a href="reg.php">Signup</a></p>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
