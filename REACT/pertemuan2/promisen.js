// let myPromise = new Promise((resolve, reject)=>{
//     setTimeout(()=>{
//         let isprocessSucces = false;

//         if (isprocessSucces) {
//             resolve("=> Success");
//         }else{
//             reject(">> Error");
//         }
//     },3000)
// });


// myPromise.then((Response)=>{console.log(Response)}).catch((error)=>{
//     console.error(error)
// });

//cara fetching js api
// let myPromise = new Promise((resolve, reject)=>{
//    fetch("https://jsonplaceholder.typicode.com/comments").then(
//     (response)=>{response.json}).then((data)=>{resolve(data)}).catch((error)=>{reject(error)})
// });


// myPromise.then((Response)=>{console.log(Response)}).catch((error)=>{
//         console.error(error)
//     });

import axios from "axios";

//cara 1
// fetch("https://jsonplaceholder.typicode.com/comments").then(Response => Response.json()).then(Data => {console.log(Data)})

//cara2
axios("https://jsonplaceholder.typicode.com/comments").then(Data => {console.log(Data)})
    // myPromise.then((Response)=>{console.log(Response)}).catch((error)=>{
    //     console.error(error)
    // });