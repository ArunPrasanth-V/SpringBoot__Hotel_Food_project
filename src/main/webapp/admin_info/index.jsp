<%@ page import="java.io.* ,
                 java.text.SimpleDateFormat ,
                  java.util.Date" %>
<html>
<head>
  <title>welcome to hotel</title>
</head>

<body>
  <h1>Your order Please</h1>
  <h2>thoosa</h2>
  <h2>baroota</h2>
  <h2>kooruma karikolabu</h2>
  <h2>podi thoosa</h2>
  <form action="adduser">
Enter ID <input type="text" name="id"><br>
Enter Name<input type="text"name="name"><br>
<input type="submit"><br>
</form>
   ${details.name}
   
   ${details.age}
   
   ${details.city}
  <p>we are reputed company which we can serve everything that you need!</p>
</body>

</html>