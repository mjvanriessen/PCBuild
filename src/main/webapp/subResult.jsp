<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sub-Results</title>
</head>
<body>
	<p>GPU Component Selection: ${userPCBuild.getGpuComponent()} <br/>
	CPU Component Selection: ${userPCBuild.getCpuComponent()} <br/>
	
	Recommended Memory Capacity: ${userPCBuild.recommendMemoryCap()} <br/>
	Recommended Power Source Capacity: ${userPCBuild.recommendedWattCap()} <br/>
	</p>
	
	<form action="pcBuildResultServlet" method="post">
		Choose desired memory (RAM) capacity: <br/>
		<input type="radio" name="desiredRAM" value="8 GB"> 8 GB
		<input type="radio" name="desiredRAM" value="16 GB"> 16 GB
		<input type="radio" name="desiredRAM" value="32 GB"> 32 GB
		<input type="radio" name="desiredRAM" value="64 GB"> 64 GB
		
		<br/><br/>
		
		Choose desired power source capacity: <br/>
		<input type="radio" name="desiredPS" value="650W"> 650W
		<input type="radio" name="desiredPS" value="750W"> 750W
		<input type="radio" name="desiredPS" value="850W"> 850W
		<input type="radio" name="desiredPS" value="1000W"> 1000W
		<input type="radio" name="desiredPS" value="1600W"> 1600W
		
		<br/><br/>
		
		GPU/CPU Component Confirmation:
		<input type="radio" name="desiredGPU" value= ${ userPCBuild.getGpuComponent()}> ${userPCBuild.getGpuComponent()}
		<input type="radio" name="desiredCPU" value= ${ userPCBuild.getCpuComponent()}> ${userPCBuild.getCpuComponent()}
		
		<br/><br/>
		
		<input type="submit" value="Submit build plans"/>
		
		<br/><br/>
		
	</form>
	
	<a href="index.jsp">Select another GPU/CPU component combination</a>
</body>
</html>