<?php
require 'connection.php';
session_start();
// If not logged in, redirect to login
if (empty($_SESSION['user_id'])) {
    header('Location: login.php');
    exit;
}

if (isset($_GET['logout'])) {
    session_unset();
    session_destroy();
    header('Location: login.php');
    exit;
}
?>
<!DOCTYPE html>
<html>
<head>
	<title>My website</title>
</head>
<body>
	<a href="index.php?logout=1">Logout</a>
	<h1>This is the index page</h1>
    <p>Welcome, <?php echo htmlspecialchars($_SESSION['user_name'] ?? 'User'); ?>!</p>
</body>
</html>
