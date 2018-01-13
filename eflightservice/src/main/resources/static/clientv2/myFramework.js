/**
 * This is a sample how a library or framwork in JS can be written.
 */

// only define one variable on the global scope. 
// All functions or variables of the framework should be created in the context of this framework.
// jQuery for example creates the '$' variable in the global namespace, making it available for all other scripts.
var myFramework = {};

// define a variable in the scope of myFramework
myFramework.myVar = 999999999;

// define a function in the scope of myFramework
myFramework.myFunction = function() {
	console.log("myFramework says: " + this.myVar);
	
};

