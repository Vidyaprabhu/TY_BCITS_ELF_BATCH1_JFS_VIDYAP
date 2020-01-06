var element=document.getElementById(`demo`)
console.log(element);
console.log(element.textContent);
element.textContent='content changed'
console.log(element.textContent);
var pElement=document.createElement('p')
pElement.textContent='Hi'
document.body.appendChild(pElement)
console.log(pElement.textContent);
pElement.style.fontSize='40px'
pElement.style.color='red'
console.log(pElement.textContent);