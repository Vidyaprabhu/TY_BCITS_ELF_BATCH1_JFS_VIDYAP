function validateForm(){
    var loginForm = document.forms['loginForm'];
    var userMail = loginForm['Email'].value;
    var pwd= loginForm['userPassword'].value;
    var mblNo= loginForm['mobileNo'].value;

    if(userMail.trim().length>6){
        document.getElementById('emailErr').style.display= 'none'
        console.log('user mail is valid');
    } else{
        document.getElementById('emailErr').style.display= 'block'
        console.log('user mail is invalid');   
        document.getElementById('usermail').style.border='1px solid red' 
    }
    if(mblNo.trim().length>10){
        document.getElementById('mobileNoErr').style.display= 'none'
        console.log('Mobile number is valid');
    } else{
        document.getElementById('mobileNoErr').style.display= 'block'
        console.log('Mobile number is invalid');    
        document.getElementById('mobilenumber').style.border= '1px solid red'
    }
    if(pwd.trim().length>5){
        document.getElementById('pwdErr').style.display= 'none'
        console.log('Password is valid');
    } else{
        document.getElementById('pwdErr').style.display= 'block'
        console.log('Password is invalid');    
        document.getElementById('userpassword').style.border= '1px solid red'
    }
}