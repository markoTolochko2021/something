<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<hyml>
    <body>
    <h2>Dear Employee, you are WELCOME!!!</h2>
    <br>
    <br>
    <br>
    Your name: ${employee.name}
    <br><br>
    Your surname: ${employee.surname}
    <br><br>
    Your salary: ${employee.salary}
    <br><br>
    Your department: ${employee.department}
    <br><br>
    Your car: ${employee.carBrand}
    <br><br>
    Your language(s):
    <ul>
        <c:forEach var="lang" items = "${employee.language}">
            <li>${lang}</li>
        </c:forEach>
    </ul>
    <br><br>

    Phone number: ${employee.phoneNumber}
    <br><br>

    Email: ${employee.email}
    <br><br>

    </body>
</hyml>