// let res = ['jhon','wick','jakarta'];

// let[firstname, lastname, city] = res;

// console.log(firstname);

// let firstname2 = res[0];
// let lastname2 = res[1];
// let city2 = res[2];

// console.log("first name : ",firstname,firstname2);
// console.log("last name : ",lastname,lastname2);
// console.log("city : ",city,city2);

// let [tmp1 , tmp2 ]= res;
// console.log(`${tmp1} ${tmp2}`);


// let res = {
//     firstname : 'jhon',
//     lastname: 'Doe',
//     city: 'jakarta'
// }

// let{firstname,lastname,city} =res;

// console.log(firstname);
// console.log(lastname);


// let firstname2 = res.firstname;
// let lastname2 =  res.lastname;
// let city2 = res.city;

// console.log("first name : ",firstname,firstname2);
// console.log("last name : ",lastname,lastname2);
// console.log("city : ",city,city2);

// const findUser = () =>{
//     return ['jhon', 'doe','pekanbaru'];
// }

// let [firstname,lastname,city] = findUser();

// console.log("full name: ",firstname,lastname,city);

// const getStudent = () => {
//     return {
//         name : "tampan",
//         gpa: 8
//     }
// }

// let{name, gpa} = getStudent();

// console.log(`${name} ${gpa}`);

// console.log(">>",this);

// let counter ={
//     val: 0,
//     increment: function(){
//         this.val++;
//     }
// }
// console.log(counter.val);
// counter.increment();
// console.log(counter.val);

// console.log(">> ",this)

// function first(){
//     console.log(">> First",this);
// }

// const second = () =>{
//     console.log(">> seconds",this);
// }

// first();
// second();

// const tambah = (num1, num2) => num1 + num2;
// const kali = (num1, num2) => num1 * num2;

// const formula = (a,b,tambaha,kalii) =>{
//     let hasilKali = kalii(a,b);
//     let hasilTambah= tambaha(hasilKali,10);

//     console.log("hasil formula = "+hasilTambah);
// }


// formula(2,10, tambah, kali);

// let animal = [
//     {name:'fluffy',spesies:'cat'},
//     {name:'carlo',spesies:'cat'},
//     {name:'fishy',spesies:'fish'},
//     {name:'bruno',spesies:'fish'}
// ];

// let names =[];

// for (let index = 0; index < animal.length; index++) {
//     names.push(animal[index].name);
    
// }
// console.log(names);

let animal = [
    {name:'fluffy',spesies:'cat'},
    {name:'carlo',spesies:'cat'},
    {name:'fishy',spesies:'fish'},
    {name:'bruno',spesies:'fish'}
];

let cats =[];

for (let index = 0; index < animal.length; index++) {
    if (animal[index].spesies  == 'cat') {
        cats.push(animal[index]);
    }
    
}
console.log(cats);

let cats2 = animal.filter(animal => animal.spesies == 'cat');
console.log(cats2);

let order = [
    {xtotal: 100},
    {xtotal: 200},
    {xtotal: 300},
]

let total = 0;

for (let index = 0; index < order.length; index++) {
    total+= order[index].xtotal
}
console.log(total);

let total2 = order.reduce((tmp,order)=> tmp + order.xtotal, 0
)

console.log(total2);