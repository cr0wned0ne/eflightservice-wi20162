/**
 * this file illustrated the basic use of javascript.
 */
// define a variable in the global namespace:
var myVar = "Hello World";

// create a function function in global namespace, this means it can be called by any other javascript script in this website.
// if another skript also creates a function with the same name, it will be overwritten!
function sayHello() {
		//define a variable with "var" in the scope of this function
	  	// this variable is not available outside of this function.
		var greeting = 1;
		//javascript is not strongly typed, so you can assign everything to a variable:
		greeting = "Hello";
		// you can also define arrays:
		var myGreetings = new Array();
		// push elements to it:
		myGreetings.push(greeting);
		myGreetings.push("Hi");
		
		// log stuff in the console, this can be used for error handling
		console.log("Inital greeting: " + greeting);
		
		// repeat stuff with loops, for example for:
		for (var i = 0; i < myGreetings.length; i++) {
			// this loop goes over every element of our myGreetings array.
			
		   // program conditions using if-else blocks:
			if (myGreetings[i] == "Hello") {
				//access elements of an array with "[]", for example [0] returns the first, [1] the second and so on:
				console.log("Greeting from the for loop: " + myGreetings[i]);
			} else {
				console.log("Also in the for loop: not an appropriate greeting: " + myGreetings[i])
			}	
		}
		// while loops are also possible:
		var i = 0;
		while (i < myGreetings.length) {
			console.log("Greeting from the while loop: " + myGreetings[i]);
			i++;
		}
		
		// all of this code is encapsuled in a function so we can control when to execute it.
	};
	// execute the above function with "()":
	sayHello();
	
	// this is another way to create a function.
	// this time we create a variable and say it is a function with the "function" keyword
	var createPersonFunction = function() {
		// we can create objects using the JSON syntax
		var person = {
				// simple key, value pairs:
				name: "doe",
				firstname: "john",
				// more complex structures like nested objects:
				adress: {
					street: "Main street",
					number: "1"
				},
				// arrays:
				hobbies: [
					"football", "music"
				],
				// even functions! Here we give the person object a the sayHello function we defined above:
				sayHello : sayHello
		};
		console.log("We created a person:")
		// we can access the attributes of an object like this:
		console.log("persons firstname: " + person.name);
		// or we can look at the whole object:
		console.log(person);
		// or call the function of an object:
		console.log("the person just said hello! " + person.sayHello());
	}
	// execute the function defined above:
	createPersonFunction();	
	
	// here we create a function to manipulate some HTML elements on the page:
	var applyJavascriptToManipulateHtml = function() {
		// we can select every element of the html document using the document.getElementById function:
	    // here we also add a new function to the onclick event, this is triggered 
	    // if someone clicks the element (in this case the button):
		document.getElementById("changeFlight").onclick= function(){
			// we can change then the innerHTML of a selected document
			document.getElementById("formHeader").innerHTML="Edit Flight";
		};
		// same here!
		document.getElementById("createFlight").onclick= function(){
			// change the h1 header:
			document.getElementById("formHeader").innerHTML="Create new Flight";
			// get all elements with a specified class and reset them to empty!
			var flightInputElements = document.getElementsByClassName("flightInput");
			for (var j = 0; j < flightInputElements.length; j++) {
				flightInputElements[j].value = "";
			}
		};
		
		// we can react on events, here the onblur event, this is triggered if an element loses focus:
		document.getElementById("flightId").onblur = function () {
			if (document.getElementById("flightId").value.length < 4) {
				document.getElementById("errorArea").innerHTML="Not a valid flight id, at least 4 characters!";
			} else {
				document.getElementById("errorArea").innerHTML="";
			}
		};
		// onmouseover is another event, triggered when someone hovers the element:
		document.getElementById("sendFlightButton").onmouseover = function() {
			console.log("hovered!");
			// we can also manipulate the style DOM element to change the styling of elements:
			document.getElementById("sendFlightButton").style.backgroundColor = "rgb(212,212,212)";
		};
		// equivalent: onmouseout when leaving the element:
		document.getElementById("sendFlightButton").onmouseout = function() {
			document.getElementById("sendFlightButton").style.backgroundColor = "white";
		};	
	}
	// call the function to apply it:
	applyJavascriptToManipulateHtml();
	
	// we can also use the functions provided by our own framework (see myFramework.js):
	myFramework.myFunction();
	
	
	/** This function can be used to load the flight data from the backend service.
	 * It sends a HTTP GET request to our /api/flight endpoint to fetch the flight data.
	 * The flight data is returned as JSON object array to this method.
	 * We then process the data and create a HTML table with it dynamically.*/
	var loadFlightData = function() {
		//XMLHttpRequest is the Javascript native object for HTTP Operations:
		var request = new XMLHttpRequest();
		var method = "GET";
		var url = "/api/flight";
		
	    // Assign a function to the "onreadystatechange" event of the request. 
		// This function gets called when the request was send and a response was received:
		request.onreadystatechange = function() {
			// only process successfull responses (HTTP Code 200):
			if (this.readyState == 4 && this.status == 200) {
				// The response is returned as plain String, we can parse a JSON object array from it:
				var flights = JSON.parse(request.responseText);
				// we want to create a table that displays our flight.
				// we create html code dynamically here.
				// first we create a variable where we will append the html code for our table.
				// first the table header:
				var tableContent =  "<tr><th>Id</th><th>destination</th><th>origin</th><th>departure</th><th>arrival</th></tr>"
				for(var i = 0; i < flights.length; i++) {
					// then we iterate over the flights array and append a new table row for every flight where we put in the flights data:
					tableContent = tableContent + "<tr><td>"+ flights[i].flightId +"</td><td>"+ flights[i].destination +"</td><td>"+ flights[i].origin +"</td><td>"+ new Date(flights[i].startDate) +"</td><td>"+ new Date(flights[i].endDate) +"</td></tr>";
					
				}
				// At last we set the content to the table elment on the page:
				document.getElementById("flightsTable").innerHTML = tableContent;
			}
		}
		// we open the request and send it.
		request.open(method, url, true);
		request.send();	
	}
	// call the load flightData whenever the page gets refreshed:
	loadFlightData();
	// also add the loadFlightData as function to the refreh button to be able to call it manually:
	// here we use query with the "$" character to get the element and register a listener function to the "click" event.
	$('#refresh').click(loadFlightData);
	
	// here we add a function to the sendFlightButton to send a 
	// HTTP POST request with the data from the form.
	// this gets called when the "click" event of the sendFlightButton is clicked.
	$('#sendFlightButton').click(function(event) {
		// first prevent the default behaviour of the form, this prevents the form to execute its "action".
		event.preventDefault();
		// use querys post function, this takes the following parameters:
		$.post('/api/flight', {
			flightId : $("#flightId").val(),
			destination : $("#destination").val(),
			origin : $("#origin").val(),
			endDate : $("#endDate").val(),
			startDate : $("#startDate").val()
		}, function(response) {
			// this callback function is called when the request succeeded.
			// we want to refresh the flight data and log the response.
			loadFlightData();
			console.log(response);
		});
	});
