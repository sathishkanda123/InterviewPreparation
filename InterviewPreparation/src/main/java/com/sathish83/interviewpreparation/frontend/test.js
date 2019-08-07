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
 
 // 6 Function.toString()
 
 function testTo(){
	 var name="sathish";
	 console.log('hello ${name}');
 }
 
console.log("tostring functions is"+testTo.name);

//##########ES2019 features end####################


//##############ES2018 Features start #############

// ObjectRest/SpreadOperations

const input ={x:1,y:2,z:3,a:7,b:9,c:10,d:11};
const{x,y,...z}=input;
console.log("spread x"+x);
console.log("spread z"+JSON.stringify(z));

//##############ES2018 Features End #############


//Destructions 

console.log("Destruction example");

const seeker ={
		firstName:"sathish",
		lastName:"kumar",
		company:"GE Healthcare"
}
//object assignment
const {firstName,lastName} = seeker;
console.log(firstName);

//variable asssignment

//let firstName="Krish";
//let company ="Infosys";
//
//({firstName,company}=seeker);
//
//console.log(company)

// call apply bind

const obj={
		firstName:"Yatheesh",
		lastName:"Konduru"
}

function callFunction(){
	console.log("call function with obj "+this.firstName+this.lastName)
}

function applyFunction(){
	console.log("Apply function with obj "+this.firstName+this.lastName)
}


callFunction.call(obj);

applyFunction.apply(obj)


console.log("clousres explanation");

function closures(val){

	var c=20;
	var b = function(){
	  c=c*20;	
	}
	return b;
}

console.log(closures(3));


console.log("prototypes explanation");

console.log("add new properties to object constructors:")

function Test(){
	this.firstName = "Tiru";
	this.lastName="D";
}
Test.prototype.newcompany="Flexara";
var testobj = new Test();
console.log(testobj.firstName+testobj.lastName+testobj.newcompany);

console.log("Object.create explanation");

console.log("var newobjcreate=Object.create null);"+"newobjcreate"); // empty object
//https://hackernoon.com/object-create-in-javascript-fa8674df6ed2
var prototypeObj={
		fullName:function(){
			return "kandaswamy"+"Indira";
		}		
}
var newObjCreate = Object.create(prototypeObj);
console.log(newObjCreate.fullName());

console.log("Asynchronous explanation");
console.log("A) CallBack");

function showCallBack(){
	
	printString("A",()=>{
		
		console.log("Call back A executed");
		
		  printString("B",()=>{
			  
			 console.log("Call back b executed"); 
		  
		  });
		
	});
	
}

function printString(string, callback){
  setTimeout(
    () => {
      console.log(string)
      callback()
    }, 
    Math.floor(Math.random() * 100) + 1
  )
}

showCallBack()



console.log("B) Promises");

function callPromises(){
	
	printPromise("A").then(()=>{
		return printPromise("B");
	}).then(()=>{
		return printPromise("C");
	})
	
}

function printPromise(string){
	  return new Promise((resolve, reject) => {
	    setTimeout(
	      () => {
	       console.log("Promise "+string)
	       resolve()
	      }, 
	     Math.floor(Math.random() * 100) + 1
	    )
	  })
	}

callPromises();


console.log("C) Async and Await");

async function asynFunc(){
	let promise = Promise.resolve(10);
	let result = await promise;  // We can’t use the await keyword inside of regular functions , should be aync
}












 












