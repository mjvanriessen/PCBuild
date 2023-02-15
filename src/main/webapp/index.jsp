<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PC Component Selection Tool</title>
</head>
<body>
	<h1>Welcome to the PC Component Selection Tool!</h1>
	<form action="pcBuildServlet" method="post">
	Enter the GPU component you want to use: 
	<select name="gpuComponent">
		<option>NVIDIA RTX 3060</option>
		<option>NVIDIA RTX 3070</option>
		<option>NVIDIA RTX 3080</option>
		<option>NVIDIA RTX 3090</option>
		<option>NVIDIA RTX 4090</option>
		<option>AMD Radeon RX 6600XT</option>
		<option>AMD Radeon RX 6700XT</option>
		<option>AMD Radeon RX 6900XT</option>
		<option>AMD Radeon RX 7900XTX</option>
	</select>
	<br/><br/>
	Enter the CPU component you want to use: 
	<select name="cpuComponent">
		<option>Intel Core i7-12700KF</option>
		<option>Intel Core i7-12700K</option>
		<option>Intel Core i9-12900K</option>
		<option>Intel Core i9-13900K</option>
		<option>AMD Ryzen 9 5950X</option>
		<option>AMD Ryzen 9 5900X</option>
		<option>AMD Ryzen 7 5800X</option>
		<option>AMD Ryzen 7 5700X</option>
	</select>
	<br/><br/>
	<input type="submit" value="Submit build plans"/>
	</form>
</body>
</html>