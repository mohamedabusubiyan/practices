<!DOCTYPE html>
<html>
<head>
    <title>PHP Form</title>
</head>
<body>
    <h1>PHP Form </h1>
    <form method="post" action="">
        <label for="name">Enter your name:</label>
        <input type="text" name="name" required>
        <br><br>

        <label for="age">Enter your age:</label>
        <input type="number" name="age" required>
        <br><br>

        <input type="submit" value="Submit">
    </form>
    <hr>
<?php
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $name = $_POST['name'];  
            $age  = $_POST['age'];  
            echo "<h2>Form Output:</h2>";
            echo "<p>Hello, <strong>$name</strong>!</p>";
            echo "<p>You are $age years old.</p>";
             if ($age >= 18) {
                echo "<p>Status: You are an Adult </p>";
            } else {
                echo "<p>Status: You are a Minor </p>";
            }
        }
    ?>
</body>
</html>