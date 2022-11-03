
import './App.css';
import { Component, useEffect, useState } from 'react';

// export default class App extends Component{
//   constructor(){
//     super();
//   }

//   render(){
//     return (
//       <div>
//        <Movie movie={{
//         title: "dc",
//         year:2023,
//         rating: 9.2,
//         sinopsis: "bagus"
//        }} 
//        name="Spiderman"
//        />
//       </div>
//     );
//   }
// }

 // //object destructuring
 // const Movie = ({movie,name})=>{
 //   return(
 //     <div>
 //       <h1>{name}</h1>
 //       <h2>{movie.year} - {movie.rating}</h2>
 //       <p>{movie.sinopsis}</p>
 //     </div>
 //   )
 // }

// const App = () => {
//   return(
//     <div className='container'>
//       <Header/>
//       <hr/>
//       <Content/>
//       <hr/>
//       <Footer/>
//     </div>
//   );
// };

// const Header = () =>{
//   return(
//     <div className='header'>
//       <h1>My First React App</h1>
//     </div>
//   )
// }

// const Content = () =>{
//   return(
//     <div className='content'>
//       <p>lorem ipsum bla bla</p>
//     </div>
//   )
// }

// const Footer = () =>{
//   return(
//     <div className='footer'>
//       <p>&copy; My Selp - 2022 </p>
//     </div>
//   )
// }
// export default App;

//hook bversi 1
const App = () =>{
  const [count,setCount] = useState({
    count: 0
  });

  useEffect(() => {
    // alert("Terpanggil use effeft")
    document.title = "count is "+count.count;
  },{count})

  const increment = () =>{
      setCount({
        count: count.count + 1
      })
  }

  const decrement = () =>{
    setCount({
      count: count.count - 1
    })
}

  const reset = () =>{
    setCount({
      count: 0
    })
  }

  return(
    <div>
      <h1>{count.count}</h1>
      <button onClick={reset}>reset</button>
      <button onClick={decrement}>-</button>
      <button onClick={increment}>+</button>
    </div>
  )
}

export default App;

//Hook versi 2
// function CountApp() {  
//   const [count, setCount] = useState(0);  
  
//   return (  
//     <div>  
//       <p>You clicked {count} times</p>  
//       <button onClick={() => setCount(count + 1)}>  
//         Tambah 
//       </button>  
//       <button onClick={() => setCount(count - 1)}>  
//         kurang
//       </button>
//       <button onClick={() => setCount(0)}>  
//         Reset
//       </button>    
//     </div>  
//   );  
// }  
// export default CountApp;  