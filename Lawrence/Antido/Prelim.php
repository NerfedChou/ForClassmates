<!DOCTYPE html>
<html>
 <head><title>Prelim</title></head>
  <body>
	<h1>Echo and Print</h1>
	<?php
	 echo "Hello, World! <br>";
	 print "Hello," . "<br>" . "World! <br><hr>";
	?>
	<h1>Concatinating</h1>
	<?php
	$firstName = "Jan Rhian";
	$lastName = "Angulo";
	echo  $firstName . " " . $lastName . "<br><hr>";
	?>
	<h1>Basic Operators</h1>
	<?php
	$num = 100;
	$num2 = 300;
	
	$sum = $num + $num2;
	$difference = $num - $num2;
	$product = $num * $num2;
	$qoutient = $num / $num2;
	
	echo "The sum of " . $num . " and " . $num2 . " is " . $sum . "<br>"; 
	echo "The difference of " . $num . " and " . $num2 . " is " . $difference . "<br>"; 
	echo "The product of " . $num . " and " . $num2 . " is " . $product . "<br>"; 
	echo "The qoutient of " . $num . " and " . $num2 . " is " . $qoutient . "<br><hr>"; 
	?>
	<h1>BASIC STRINGS</h1>
	<?php
	$var_str = "This is just a basic String. ";
	echo  "<br>";
	$var_con = "And I just concantinate them using + operator"; 
	echo $var_str . $var_con . "<br><hr>";
	?>
	<h1>Basic Integers</h1>
	<?php
	$var_int = 10;
	$var_int2 = 20;

	echo $var_int . "<br>";
	echo $var_int2 . "<br><hr>";  
	?>
	<h1>Basic Double</h1>
	<?php
	$var_double = 10.1;
	$var_doubles = 21.4;

	echo $var_double . "<br>";
	echo $var_doubles . "<br><hr>"; 
	?>
	<form action = "Form.php">
	<input type = "submit">
	</form>
  </body>
</html>