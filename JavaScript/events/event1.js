function mouseOver() {
    var ele = document.getElementById('a')
    ele.style.background = 'pink'
    ele.style.fontSize = '30px'
}
function mouseOut() {
    var ele = document.getElementById('a')
    ele.style.background = 'white'
    ele.style.fontSize = '18px'
}
function showData() {
    console.log('working!!');
}

function showDetail() {
    console.log('on key down executed');
}

function getInputValue() {
    var inpElement = document.getElementById('inp')
    console.log(inpElement.value);
    var ele1 = document.getElementById('pr')
    ele1.textContent = inpElement.value

}