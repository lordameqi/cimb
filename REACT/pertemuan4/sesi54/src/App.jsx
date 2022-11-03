import logo from './logo.svg';
import './App.css';
import { Component, useState } from 'react';
import { useEffect } from 'react';


// export default class App extends Component{
//   // constructor(){
//   //   super();
//   //   this.state ={
//   //     date : new Date()
//   //   }
//   // };

//   // tick = () =>{
//   //   this.setState({
//   //     date: new Date()
//   //   })
//   // }
//   //componendidmount menjalan fungsi setelah direload sama kayak onload
//   // componentDidMount(){
//   //   this.timerId = setInterval(() =>{
//   //     this.tick()
//   //   },3000)
//   // }

//   // constructor(){
//   //   super();
//   //   this.state = {
//   //     count: 0,
//   //     user: [],
//   //   }
//   // }

//   constructor(){
//     super();
//     this.state = {
//       todos:[]
//     }
//   }

//   // shouldComponentUpdate(nextProps, nextState){
//   //   if (this.state.user.length !== nextState.user.length) {
//   //     alert("state length berubah");
//   //     return true;
//   //   }
//   //   return false;
//   // }
//   // componentDidUpdate(prevProps, prevState){
//   //   console.log(prevState,'prevState');
//   //   console.log(this.state,'this state');
//   //   if (this.state.user.length !== prevState.user.length) {
//   //     alert("state length berubah");
//   //   }
//   // }

//   // //klu ada eror
//   // componentDidCatch(error,info){
//   //   alert("ada error")
//   // }

//   componentDidMount(){
//       fetch("https://jsonplaceholder.typicode.com/todos")
//       .then(response=> response.json())
//       .then((data) => {
//         this.setState({
//         todos: data.slice(0,20),
//       });
//       console.log(data.slice(0,20))
//     });
//   }

//   changeUser = ()=>{
//     this.setState({
//       user: ["user1"],
//     })
//   }

 

//   render(){
//     return(
//       <div className=''>
//         {/* <h1>Hello World</h1>
//         <h1>{this.state.date.toLocaleTimeString()}</h1> */}
//         {/* <button onClick={this.changeUser}>add user</button> */}
//         {/* <h1>Test</h1> */}
//         {/* <TestError /> */}

//         <table>
//           <tbody>
//             {this.state.todos.map((data,index)=>(
//               <tr key={index}>
//                 <td>{data.id}</td>
//                 <td>{data.title}</td>
//                 <td>{data.completed ? "V" : "X"}</td>
//               </tr>
//             ))}
//           </tbody>
//         </table>
//       </div>
//     )
//   }
// }


// class TestError extends Component{
//   render(){
//     return(
//       <div>
//         <h1>{this.state.nama}</h1>
//       </div>
//     )
//   }
// }

const App = () =>{
  const [todos, setTodos] = useState([]);

  useEffect(()=> {
          fetch("https://jsonplaceholder.typicode.com/todos")
      .then(response=> response.json())
      .then((data) => {
      setTodos(data.slice(0,20));
      console.log(data.slice(0,20));
    });
  },[])
  return(
    <div>
         <table border={1}>
           <tbody>
              {
                todos.map((data, index)=>(
                  <tr key={index}>
                    <td>{data.id}</td>
                    <td>{data.title}</td>
                    <td>{data.completed ? "Y" : "N"}</td>
                  </tr>
                ))
              }
           </tbody>
         </table>
    </div>
  );
}

export default App