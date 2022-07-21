window.onload=function(){


    /*문제1*/
    document.getElementById('plus').addEventListener("click",click)
    var numbox=document.getElementById('numbox')
    var i = 0;
    function click (){
        numbox.value=++i;
    }


    document.getElementById('minus').addEventListener("click",click2)
    function click2(){
        if(numbox.value>=2){
            numbox.value=--i;}
            else if(numbox.value<1){
                numbox.value=1;
            }

    }



    /*문제2*/
document.getElementById('result').addEventListener("click",click3)

function click3(){
    document.getElementById('text1').innerText="결과값 : "
    var arr=[];
    var ck = document.getElementsByName("ck");
    for (var i=0; i<ck.length ; i++){
        if(ck[i].checked==true){
            arr.push(ck[i].value)
        }

    }

    document.getElementById('text').innerText=arr;
}

  /*문제3*/

  document.getElementById('textarea').addEventListener("keyup",keyup)

  function keyup (){
    var textarea = document.getElementById('textarea').value
    var num = document.getElementById('num')
    num.textContent=textarea.length
  }



  /*문제4*/

  document.getElementById('total1').addEventListener("click",q1)
  function q1(){
    var one = document.getElementById('one').value
    var two = document.getElementById('two').value
    var three = document.getElementById('three')
    var result= Number(one)+Number(two);
    three.value=result;
    }


    document.getElementById('select').addEventListener("blur",q2)
    function q2 (){
        var price=document.getElementById('price').value
        var select=document.getElementById('select').value
        var total2=document.getElementById('total2')

        total2.value=Number(price)*Number(select)

    }



    document.getElementById('button').addEventListener("click",q3)
    function q3 (){
        var arr1=[]
        var fruit = document.getElementsByName("fruit")
        var sum=0
        for(var i=0; i<fruit.length; i++){
            if(fruit[i].checked){
                sum+=Number(fruit[i].value)
                arr1.push(sum)
            }
        }
        document.getElementById('total3').innerText=sum;

    }



    document.getElementById('myform').addEventListener("click",check)
    function check (){
        var id = document.getElementById('id').value;
        var pass = document.getElementById('pass').value;
        if(id==null || id==''){
	console.log(document.getElementById('id').value)
	console.log(id)
            document.getElementById('id').value="아이디를 입력하세요."
            return false;
        } else if (pass==null || pass==''){
           alert("비밀번호를 입력하세요.")
            return false;
        }
    }


 







}