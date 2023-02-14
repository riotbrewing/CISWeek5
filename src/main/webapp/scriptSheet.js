/**
 * 
 */

 //create variable and get event handler for the view characters button
 let add = document.querySelector("#viewAll");
 add.addEventListener("click", addServlet);
 
 function addServlet()
 {
	 document.location.href="viewCastServlet"
 }