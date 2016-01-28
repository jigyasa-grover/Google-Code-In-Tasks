function change(id) {
    var img = document.getElementById(id);
    var but = document.getElementById((parseInt(id) + 3).toString());
    if (img.src.match("off")){
        img.src = "on.jpg";
        but.innerHTML = "Click to switch OFF";
        but.style.backgroundColor = "#ff0000";
    }else{
        img.src = "off.jpg";
        but.innerHTML = "Click to switch ON";
        but.style.backgroundColor = "#09A503";
    }
}

status = "off"

function masterchange() {
    if (status == "off") {
        for (var i = 1; i < 4; i++) {
            var img = document.getElementById(i.toString());
            var but = document.getElementById((i + 3).toString());
            img.src = "on.jpg";
            but.innerHTML = "Click to switch OFF";
            but.style.backgroundColor = "#ff0000";
        }
        document.getElementById("master").style.backgroundColor = "#ff0000";
        document.getElementById("master").innerHTML = "Click to switch all OFF";
        status = "on";
    }else{
        for (var i = 1; i < 4; i++) {
            var img = document.getElementById(i.toString());
            var but = document.getElementById((i + 3).toString());
            img.src = "off.jpg";
            but.innerHTML = "Click to switch ON";
            but.style.backgroundColor = "#09A503";
        }
        document.getElementById("master").style.backgroundColor = "#09A503";
        document.getElementById("master").innerHTML = "Click to switch all ON";
        status="off";
    }
}
