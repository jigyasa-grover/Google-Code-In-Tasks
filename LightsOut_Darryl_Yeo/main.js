/**
 * Light Switches
 * Copyright © 2015 Darryl Yeo
 * http://darryl-yeo.com
*/

for(var i = 0; i <= 1; i += 1/10){
	var lightWrapper = document.createElement("div");
	var lightSwitch = document.createElement("button");
	
	lightSwitch.addEventListener("click", function(){
		this.parentNode.classList.toggle("active");
	})	
	lightWrapper.appendChild(lightSwitch);
	
	for(var l = 0; l < Math.random() * 10; l++){
		var light = document.createElement("span");
		light.style.width = light.style.height = 10 + Math.random() * 30 + "px";
		light.style.left = Math.random() * 100 + "%";
		light.style.top = Math.random() * 100 + "%";
		light.style.webkitAnimationDuration = light.style.mozAnimationDuration = light.style.animationDuration = 0.5 + Math.random() * 4 + "s, " + (0.1 + Math.random()) + "s";
		lightWrapper.appendChild(light);
	}
	
	lightWrapper.style.backgroundColor = "hsl(" + i * 255 + ", 70%, 50%)"
	lightWrapper.style.color = "hsl(" + i * 255 + ", 50%, 40%)"
	document.body.appendChild(lightWrapper);
}
