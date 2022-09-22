let test123 = getDigitNumber("123");
console.log("getDigitNumber123 ", test123);
function getDigitNumber(num){
    var digits = [];
    num = Math.floor(Math.abs(num));
    console.log(num);
    if(!isNaN(num)){
        while(num!= 0){
            digits.push(num % 10);
            num = Math.floor(num/10);
        }
    }
    // console.log("nums ",num);
    return digits;
}


let test456 = getDigitNumber(456);
console.log("getDigitNumber456 ", test456);

console.log('5 ', getDigitNumber(5));
console.log('-123.456: ', getDigitNumber(-123.456));
console.log('"1000" ', getDigitNumber("1000"));
console.log('"1.000" ', getDigitNumber("1,000"));
console.log('"B37" ', getDigitNumber("B37"));
console.log('"37B" ',getDigitNumber("37B"));