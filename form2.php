<!DOCTYPE html>
<html>
<head>
    <title>PHP Form 2</title>
</head>
<body>
    <h1>PHP Form 2</h1>
    <form method="post" action="">
        <label for="name">Enter your name:</label>
        <input type="text" name="name" required>
        <br><br>

        <label for="age">Enter your age:</label>
        <input type="number" name="age" required>
        <br><br>

        <label for="city">Enter your city:</label>
        <input type="text" name="city" required>
<br><br>
   <label for="state">Select your state:</label>
   <select name="state" required>
            <option value="">-- Select State --</option>
            <option value="Tamil Nadu">Tamil Nadu</option>
            <option value="Kerala">Kerala</option>
            <option value="Karnataka">Karnataka</option>
            <option value="Andhra Pradesh">Andhra Pradesh</option>
            <option value="Telangana">Telangana</option>
        </select>
        <br><br>
      <input type="submit" value="Submit">
    </form>
    <hr>
<?php
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $name  = $_POST['name'];  
            $age   = $_POST['age'];    
            $city  = $_POST['city'];   
            $state = $_POST['state'];  

            echo "<h2>Form Output:</h2>";
            echo "<p><strong>Name:</strong> $name</p>";
            echo "<p><strong>Age:</strong> $age</p>";
            echo "<p><strong>City:</strong> $city</p>";
            echo "<p><strong>State:</strong> $state</p>";
            if ($age >= 18) {
                echo "<p>Status: You are an Adult </p>";
 } else {
                echo "<p>Status: You are a Minor </p>";
            }
        }
    ?>
</body>
</html>

