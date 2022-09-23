// let add = function(x,z){
//     return x +z;
// }

let add = (x,y) => { return x + y} ;


console.log(add(1,5));

let numbers = [2,1,3];

// numbers.sort(function(a,b){
//     return b - a;
// });

numbers.sort((a,b)=>{
    return b - a;
});
console.log(numbers);

let names = ['tofan', 'rahmat', 'veve'];
let panjang = names.map(name => name.length);

console.log(panjang);

names.forEach(element => {
    console.log(element);
});