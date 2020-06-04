<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Form</title>
<script>
	function nullcheck(){
		var Name=document.Loginform.name.value;
		var Age=document.Loginform.age.value;
		var Email=document.Loginform.email.value;
		var Phonenumber=document.Loginform.phonenumber.value;
			if(Name==null||Name==""){
			alert("Username can't be blank");
			return false;
			}
			else if(Age==null||Age==""){
			alert("Age can't be blank");
			return false;
			}
			else if(Email==null||Email==""){
			alert("Email can't be blank");
			return false;
			}
			else if(Phonenumber==null||Phonenumber==""){
			alert("Phone Number can't be blank");
			return false;
		}
			else if(Name.length<3){
				alert("Please enter valid name more than 3char");
				return false;
			}
			else if(Phonenumber.length!=10){
				alert("Please enter valid phone number must 10nums");
				return false;
			}
			
	}
	function validateinput(input,event){
		var inp=input.name;
		if(inp =='name'){
		 var key=event.keyCode;
		 if((key>=33 && key<=64)||(key>=91 && key<=96)){
			alert("Numbers and Characters are not allowed");
			return false;
		 }
     }
		 else if(inp == 'age'){
		 var key=event.keyCode;
		 if(key>=32 && (key<=47 || key>=58)){
			alert("Space and Arth are not allowed");
			return false;
			}
		}
		else if(inp=='phonenumber'){
		var key=event.keyCode;
		if(key>=32 && (key<=47 || key>=58)){
			alert(" Character and Spl Character are not allowed");
			return false;
		}
		}
	}
	function checkage(){
		var age=document.Loginform.age.value;
		var a= /^([0-9]{2})$/;
		if(!age.match(a)){
			alert("age must contain atleast one number and special char[7-15]");
			return false;
		}
	}
	function checkmail(){
	var email=document.Loginform.email.value;
	var mail=/^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
	if(!email.match(mail)){
		alert("Email must be contain @ and .[5,8]");
		return false;
	}
	}
	function validatesubmit(){
	var retvalue;
	
	retvalue = nullcheck();
		if(retvalue == false){
		return retvalue;
		}
		
	retvalue = checkage();
		if(retvalue == false){
		return retvalue;
		}
		
	retvalue = checkmail();
		if(retvalue == false){
		return retvalue;
		}
	}
	
</script>
</head>
<body>
	<h3>Student Register Form</h3>
	<form name="Loginform" action="StudentRegServlet" method="get">	
	Name:<input type="text" name="name" onkeypress="return validateinput(this,event)"/><br>
	Age:<input type="text"  maxlength=2 name="age" onkeypress="return validateinput(this,event)"/><br>
	Phonenumber:<input type="text" maxlength=10 name="phonenumber"onkeypress="return validateinput(this,event)"/><br>
	Email:<input type="text" name="email"/><br>
	Date of join:<input type="text" name="doj"/><br/>
	<input type="submit" value="AddStudent"onclick="return validatesubmit();"/>
	</form>
</body>
</html>