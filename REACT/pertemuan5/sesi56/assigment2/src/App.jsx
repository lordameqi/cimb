import logo from './aa.svg';
import './App.css';
import { Component, useState } from 'react';
import { useEffect } from 'react';
import ReactDOM from 'react-dom';
import $ from 'jquery';

function App() {
 

  const [todos, setTodos] = useState([]);
  const [cur, setcur] = useState([]);
  const [Namecur, setName] = useState([]);

  useEffect(()=> {
           fetch("https://api.currencyfreaks.com/latest?apikey=3ae81a084ef44a56ad8dccfaa9ca2a69")
      .then(response=> response.json())
      .then((data) => {
      // setTodos(data);
      setcur(Object.values(data.rates));
      setName(Object.keys(data.rates));

      
    });
  },[])

  console.log(cur);
  console.log(Namecur);
  // console.log(todos.rates);

  return (
    <div className="App" style={{ backgroundImage:`url(${logo})` }}>
       <table border='1' id='example'  >
           <thead >
              <tr>
                <th>Currency</th>
                <th>We Buy</th>
                <th>Exchange Rate</th>
                <th>We Sell</th>
              </tr>
           </thead>
           <tbody>
            {
              Namecur.map((v,i)=>(
                
              <tr>
                <td>{v}</td>
                <td>{(cur[i] * 1.05)}</td>
                <td>{cur[i]}</td>
                <td>{(cur[i] * 0.95)}</td>
              </tr>))
            }
           </tbody>
         </table>

     
    </div>
  );

}

export default App;
