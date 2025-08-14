<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="styles.css">
    <title>Prelim</title>
</head>
<body>
<h1>ECHO AND PRINT</h1>
<?php
    echo "Hello, World <br>";
    print "Hello, <br> World" . "<br><hr>";
    ?>
<h1>Concantination</h1>
<?php
    $firstname = "Jan Rhian";
    $lastname = "Angulo";
    echo $firstname . " " . $lastname . "<br><hr>";
?>
<h1>Operations</h1>
<?php
    $num1 = "100";
    $num2 = "300";
    $sum = $num1 + $num2;
    $difference = $num1 - $num2;
    $product = $num1 * $num2;
    $quotient = $num1 / $num2;
    $remainder = $num1 % $num2;
    
    echo "The sum of ". $num1 . " and " . $num2 . " is " . $sum . "<br>";
    echo "The difference of ". $num1 . " and " . $num2 . " is " . $difference . "<br>";
    echo "The product of ". $num1 . " and " . $num2 . " is " . $product . "<br>";
    echo "The quotient of ". $num1 . " and " . $num2 . " is " . $quotient . "<br>";
    echo "The remainder of ". $num1 . " and " . $num2 . " is " . $remainder . "<br><hr>";
?>
<h1>Variables</h1>
<?php
$simpleString  = "Hello World";
$simpleInt = 10;
$simpleDouble = 10.6;

echo $simpleString . "<br>";
echo $simpleInt . "<br>";
echo $simpleDouble . "<br><hr>";
?>

</body>
</html>