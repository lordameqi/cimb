import axios from "axios";

const getData = async() =>{
    const response = await axios("https://jsonplaceholder.typicode.com/comments")

    console.log(response);

    //untuk filter
    const filter = response.data.filter((data)=> data.postId == 20)
    
}


getData();