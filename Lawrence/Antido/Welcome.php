<!DOCTYPE html>
 <html>
  <head><title>Welcome</title></head>
  <body>
   <h1>Welcome</h1>
   <?php 
    $name = $_POST["name"];
    $email = $_POST["email"];
    $password = $_POST["password"];
    $masked = str_repeat("*", strlen("password"));

    echo "Your name: " . $name . "<br>";	
    echo "Your email: " . $email . "<br>";
    echo "Your password: " . $masked . "<br>";
	?>
<form action = "Prelim.php">
	<input type = "submit" value = "Go to the next page">
  </body>
 </html>