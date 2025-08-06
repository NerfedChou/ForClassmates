<!DOCTYPE html>
    <html>
<head><title>Form</title></head>
<link rel="stylesheet" type="text/css" href="theme.css">
<body>
    <div class = "login">
    <h1>Form</h1>
        <form action="welcome.php" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br><br>
            <div class = "sub"><input type="submit" value="Login"></div>
        </form>
    </div>
</body>
    </html>