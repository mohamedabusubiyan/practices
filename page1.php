<!DOCTYPE html>
<html>
<head>
    <title>PHP Front Page</title>
</head>
<body>
    <h1>Welcome to My Page</h1>
    <?php
        $name = "Abu";
        $today = date("19"); 
        $year = date("2025");  
        echo "<p>Hello, <strong>$name</strong>!</p>";
        echo "<p>Today is $today.</p>";
        echo "<p>Current year: $year</p>";
        if ($today == "Sunday") {
            echo "<p>It's a holiday </p>";
        } else {
            echo "<p>Have a productive day</p>";
        }
    ?>
</body>
</html>