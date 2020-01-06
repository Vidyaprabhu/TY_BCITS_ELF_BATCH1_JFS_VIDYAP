function add(a,b){
    var c=a+b;
    return c;
}

var sum=add(10,20);
console.log('Sum is '+sum);
console.log('===============================');

var n1=10;
var str='10';
if(n1===str){
    console.log("equal");
}else{
    console.log("not equal");
}
console.log('==============================');

var num=[10,20,30];
console.log(typeof num);
console.log(typeof null);
console.log(typeof undefined)
console.log(typeof add);
console.log(typeof 10);
console.log(typeof 'abc');
console.log(typeof true);
console.log(Array.isArray(num));
console.log(Array.isArray([10,20,30,40,50]));
console.log('==============================');
var isAry = Array.isArray(num)
if(isAry===true){
    console.log('num is an array');
}else{
    console.log('num is not an array');
}
var a=function(a,b){
    return a+b;
}
console.log(a(20,30));
var sqr=a=>a*a;
console.log(sqr(2));
 var b=(a,b)=>a+b;
console.log(b(20,30));
console.log(`sum of 20 and 30 is ${a(20,30)} 
square of 4 is ${sqr(4)}`)
