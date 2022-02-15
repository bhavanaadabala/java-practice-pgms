<html>
<body bgcolor="wheat">
<br><br><br>
<h1 align="center">WELCOME TO PATIENT HOME
<br><br><br>
<a href="apply_appointment.jsp">Apply Appointment</a>
<a href="index.html">Logout</a>
</h1>
<br><br>
<form action="./patient_appointment.jsp" align="center">
<center>
<input type ="text" name = "pname" placeholder="Enter patient name">
<br><br>
<input type ="date" name = "doa" placeholder="Select Date">
<br><br>
<input type ="text" name = "toa" placeholder="Enter time ">
<br><br>
</center>
<select name ="specialist">
<option value ="ENT"> ENT </option>
<option value ="Dentist"> Dentist </option>
<option value ="Orthopedic"> Orthopedic </option>
</select>
<br><br>
<input type ="submit" value ="Apply">
</form>
</body>
</html>