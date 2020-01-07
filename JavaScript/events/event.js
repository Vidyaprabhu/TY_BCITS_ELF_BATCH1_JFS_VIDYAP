var ele = document.createElement('p')
function showAlert() {
    alert("Hi Welcome to cinema hall!!")
}

function create() {
    ele.textContent = 'hi..'
    document.body.appendChild(ele)
}
var dispEle = document.getElementById('disp')
var btnEle=document.getElementById('disp1')
// var count=0;
// function displayElement() {  
//     if(count%2==0){
//     dispEle.style.display = 'block'
//      btnEle.textContent= 'hide h1 element'
//     }else{
//         dispEle.style.display =' none '
//       btnEle.textContent= 'show h1 element'
//     }
//     count++
// }
function displayElement(){
if(dispEle.style.display===' '
   || dispEle.style.display==='none'){
       dispEle.style.display='block'
       btnEle.textContent= 'hide h1 element'
   }else{
       dispEle.style.display='none'
       btnEle.textContent= 'show h1 element'
   }
}  
