<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/09/2023
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
<h1>Join our email list</h1>
<p>To join our email list, enter your name and
    email address below.</p>
<c:if test="${not empty eror}">
    <p>${eror}</p>
</c:if>
<form action="test" method="get">
    <input type="hidden" name="action" value="add"/>

    <div class="form-row">
        <label for="firstName">First Name:</label>
        <input type="text" name="firstName" id="firstName"/>
    </div>

    <div class="form-row">
        <label for="lastName">Last Name:</label>
        <input type="text" name="lastName" id="lastName"/>
    </div>

    <div class="form-row">
        <label for="email">Email:</label>
        <input type="text" name="email" id="email"/>
    </div>

    <h1>How did you here about us?</h1>

    <p>
        <input type="radio" name="HearAboutUs" value="Search engine" checked/>Search engine
        <input type="radio" name="HearAboutUs" value="Word of mouth"/>Word of mouth
        <input type="radio" name="HearAboutUs" value="Other"/>Other
    </p>
    <h1>
        Would you like to receive announcements about new CDs and special offers?
    </h1>
    <p>
        <input type="checkbox" name="yesILikeThat"/>Yes, I'd like that<br/>
    </p>
    Please contact me by:
    <select name="contactMethod">
        <option value="Email or postal mail" selected>Email or postal mail</option>
        <option value="Other">Other</option>
    </select><br/>

    <label>&nbsp;</label>
    <input type="submit" value="Join Now" id="submit">
</form>
</body>
</html>
