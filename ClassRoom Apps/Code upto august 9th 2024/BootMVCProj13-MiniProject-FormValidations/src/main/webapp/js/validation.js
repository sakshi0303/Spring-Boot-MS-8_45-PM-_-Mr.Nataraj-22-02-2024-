
function validate(frm){
	 alert("client side form validations");
	//read form data
	let ename=frm.ename.value;
	let job=frm.job.value;
	let sal=frm.sal.value;
	let deptno=frm.deptno.value;
	let validationFlag=true;
	
	//form  validation logic  (client side)
	if(ename==""){  //required rule
		document.getElementById("enameErr").innerHTML="employee  name is mandatory (cs)";
		validationFlag=false;
	}
	else if(ename.length<3 || ename.length>10){  //length rule
		document.getElementById("enameErr").innerHTML="employee name must  have min of 3 chars and max of 10 chars(cs)";
		validationFlag=false;
	}
	
	if(job==""){  //required rule
		document.getElementById("jobErr").innerHTML="employee  job is mandatory (cs)";
		validationFlag=false;
	}
	else if(job.length<3 || job.length>10){  //length rule
		document.getElementById("jobErr").innerHTML="employee job must  have min of 3 chars and max of 10 chars(cs)";
		validationFlag=false;
	}
	
	if(sal==""){  //required rule
		document.getElementById("salErr").innerHTML="employee  salary is mandatory (cs)";
		validationFlag=false;
	}
	else if(isNaN(sal)){  //numeric value rule
		document.getElementById("salErr").innerHTML="employee salary must be numeric value(cs)";
		validationFlag=false;
	}
	else if(sal<100 ||  sal>200000){  //range rule
		document.getElementById("salErr").innerHTML="employee salary must be in the range of 1000 to  200000";
		validationFlag=false;
	}
	
	if(deptno==""){  //required rule
		document.getElementById("deptnoErr").innerHTML="employee  dept no is mandatory (cs)";
		validationFlag=false;
	}
	else if(isNaN(deptno)){  //numeric value rule
		document.getElementById("deptnoErr").innerHTML="employee depno must be numeric value(cs)";
		validationFlag=false;
	}
	else if(deptno<10||  deptno>90){  //range rule
		document.getElementById("deptnoErr").innerHTML="employee dept must be in the range of 10 to  90";
		validationFlag=false;
	}
	
	// set  vflag value(hidden box)  to "enabled" indicating  that client side form validations done
	  frm.vflag.value="enabled"; 
	
	return validationFlag;
}