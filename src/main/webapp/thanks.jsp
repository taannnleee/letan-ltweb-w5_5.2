<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css">
</head>

<body>
<h1>Thanks for joining our email list</h1>

<p>Here is the information that you entered:</p>

<label>Email:</label>
<span>${user.email}</span><br>
<label>First Name:</label>
<span>${user.firstName}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>

<label>How did you here about us:</label>
<span>${user.hearAboutUs}</span><br>

<label>Would you like to receive announcements about new CDs and special offers?</label>
<span>${user.receiveAnnouncements}</span><br>

<label>Please contact me by:</label>
<span>${user.contact}</span><br>

<p>To enter another email address, click on the Back
    button in your browser or the Return button shown
    below.</p>

<form action="" method="get">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
</form>

</body>
</html>