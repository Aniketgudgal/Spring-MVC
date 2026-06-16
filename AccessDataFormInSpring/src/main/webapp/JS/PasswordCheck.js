function passCheck() {
	let val1 = document.getElementById("pass1").value;
	let val2 = document.getElementById("pass2").value;
	console.log(val1);
	console.log(val2);
	let span = document.getElementById("spn");
	if (val1.length != val2.length) {
		span.innerHTML = "Password is not Match";
		span.style.color = "red"; 
	}
	else
	{
		let flag = true;
		for(let i = 0; i < val1.length; i++)
		{
			if(val1.charAt(i) != val2.charAt(i))
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			span.innerHTML = "Password Match";
			span.style.color = "green";	
		}else
		{
			span.innerHTML = "Password is not Match";
			span.style.color = "red"; 
		}
	}
}