//##########ES2019 features start####################

// Array flat
var arr=[10,11,12,[4,5,6]];
console.log("Flat array of [10,11,12,[4,5,6]] is "+arr.flat()); // The flat() method creates a new array with all sub-array
                         // elements concatenated into it recursively up to the specified depth.
//op - [10,11,12,4,5,6]


//Array flatmap
/*The flatmapfunction method first maps each element using a mappingfunction, 
then flattens the result into a new array. 
It is identical to a map followed by a flat of depth 1*/

var fmar=[10,20,30];
var newarr=fmar.flatMap(val=>[val,val*2]);
console.log("Flat map of 10,20,30 is " + newarr);
//op- is 10,20,20,40,30,60


//Object.fromEntries()

 /*
  * The Object.fromEntries() method transforms a list of key-value pairs into an object.
  * Object.fromEntries only accept iterable (i.e) Object.fromEntries(iterable)
  * It will accept only Map or Array
  */

var entries=new Map([
	
	['name','sathish'],
	['age',25]
	
]);
var newobj = Object.fromEntries(entries);
console.log("Object.fromEntries age:"+newobj.age);
console.log("Object.fromEntries  name:"+newobj.name);
	

// 4.String.trimStart() & String.trimEnd()
//The trimStart() method removes whitespace from the beginning of a string.
//The trimEnd() method removes whitespace from the end of a string.

var jobsekker=" sathish  ";
var company ="Ge "
console.log(jobsekker.trimStart());
console.log(company.trimEnd());

// 5.optional catch binding with out param in catch
 
 try{
	 throw new Error("Hai got the error in try");
 }catch{
	 console.log("some error exists unable to find since its a optional catch");
 }
 
 


//##########ES2019 features end####################



