/**
 * 스터디 추가.
 */
// 구구단
//for(var j = 1; j<10; j++) {
//	for(var i=2; i<10; i++) {
//		
//		document.write(i + '*' + j + '=' + (i*j) +'\t')	
//		}
//	document.write('<br>');
//}

//for(var dan=j; dan<j+3; dan++){
//	document.write('<br>');
//}

for (var k=0; k<=6; k+=3){
	for(var j=1; j<10; j++){
		for (i=1; i<4; i++){
			document.write(i+k + '*' + j + '=' + (i+k)*j + '&nbsp')
		}
		document.write('<br>')	
	}
	document.write('<br>')	
}	
