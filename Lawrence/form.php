<!DOCTYPE html>
    <html>
<head><title>Form</title></head>
<link rel="stylesheet" type="text/css" href="theme.css">
<body>
    <div class = "login">
    <h1>Form</h1>
        <img src="reCAPTCHA.png" alt="logo" class="recapcha">
        <div>
        <form action="welcome.php" method="post">
            <div class = "log-label">
            <label for="firstName">First Name:</label>
            <label for="lastName">Last Name: </label>
            <label for="email">E-mail:</label>
                <label for="password">Password:</label>
            </div>
            <div>
                <input class = "input-box" type="text" id="firstName" name="firstName" required><br><br>
                <input class = "input-box" type="text" id="lastName" name="lastName" required><br><br>
                <input class = "input-box" type="text" id="email" name="email" required><br><br>
                <input class = "input-box" type="text" id="password" name="password" required><br><br>
            </div>

            <div class = "sub"><input type="submit" value="Login"></div>
        </form>
        </div>
    </div>
</body>
    </html>