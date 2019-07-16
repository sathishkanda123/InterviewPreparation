

function getLocation() {
	var location = document.getElementById("locationame");
    
	if (navigator.geolocation) {
        console.log(navigator.geolocation.getCurrentPosition());
    } else {
        location.innerHTML = "Geolocation is not Supported";
    }
}
document.getElementById("locationname").innerHTML = location;