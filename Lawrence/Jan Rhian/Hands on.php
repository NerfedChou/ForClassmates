<!DOCTYPE html>
    <html><head><title>Hands On</title></head>
    <style>
   
        body {
            background: black;
            color: white;
        }
        .a {
            font-size: 50px;
            justify-content: center;
            position: absolute;
        }
    </style>
    <body class="a">
        <?php 
            $firstName = "Jan Rhian";
            $lastName = "Angulo";
            $age = 21;
            $course = "Bachelor of Science in Computer Science.";
            
            echo "Hello my name is " . $firstName . " " . $lastName . ". " . $age . " years old. Taking up " . $course . "<br><br>";
            
            $num1 = 100;
            $num2 = 300;
            
            $sumnum = $num1 + $num2;
            
            $multiplynum = $num1 * $num2;
            $divisenum = $num1 / $num2;
            $subtractnum = $num1 - $num2;
            $modulonum = $num1 % $num2;
            
            echo " The Sum  of " . $num1 . " and " . $num2 . " is " . $sumnum . "<br>";
            echo "The Quotient of " . $num1 . " and " . $num2 ." is " . $divisenum . "<br>";
            echo "The Difference of " . $num1 . " and " . $num2 . " is " . $subtractnum . "<br>";
            echo "The Remainder of " . $num1 . " and " . $num2 . " is " . $modulonum . "<br>";
            echo "The Product of " . $num1 . " and " . $num2 ." is " . $multiplynum . "<br>";
        ?>
    </body>
</html>