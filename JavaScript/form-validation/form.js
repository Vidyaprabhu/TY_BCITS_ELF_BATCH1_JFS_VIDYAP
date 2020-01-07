function validateForm(){
    var loginForm = document.forms['loginForm']
    var userMail = loginForm['userEmail'].value;
    var pwd = loginForm['userPwd'].value;

    console.log(loginForm);
    console.log('User Mail:',userMail);
    console.log('User password:',pwd);  
    if(userMail.trim().length>5){
        document.getElementById('emailErr').style.display= 'none'
        console.log('user mail is valid');
    } else{
        document.getElementById('emailErr').style.display= 'block'
        console.log('user mail is invalid');    
    }
    if(pwd.trim().length>5){
        document.getElementById('pwdErr').style.display= 'none'
        console.log('Password is valid');
    } else{
        document.getElementById('pwdErr').style.display= 'block'
        console.log('Password is invalid');    
    }
    
}