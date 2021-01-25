function task1(){
    var getNumber = prompt("Enter number: ");
    for(let i = 0; i < getNumber;i++){
        var suma = i + (i+1);
        document.write(suma);
        document.write(" ");
    }
    
}
function task2(){
    var getNumber = prompt("Enter the nubmer: ");
    if(getNumber>0){
        alert("Number is positive");
    }else if(getNumber==0){
        alert("Number is 0");
    }else
    alert("Number is negative");
}
task2();
function task3(){
        var getGetNumber = prompt("6*6 = ?");
        if(getGetNumber==36){
            alert("Answer is correct!");
        }else{
            alert("Answer is incorrect!");
        }
}
task3();
function task4(){
    var validPassword = "pass123";
    var getPass = prompt("Enter password: ");
    if(validPassword==getPass){
        alert("Successfuly");
    }else {
        alert("Enter valid password!!!");
    }
    var admin = "admin";
    var getStr = prompt("Enter admin: ");
    if(admin==getStr){
        alert("You are admin");
    } 
}
task4();

function task5(){
    var n = 10; 
    var fibonacci = [0, 1]; 
    for (i = 2; i < n; i ++) {
     fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
     }
     alert(fibonacci);
    }
task5();

