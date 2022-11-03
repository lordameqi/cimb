
import './App.css';
import {Component} from 'react';
import PropTypes from 'prop-types';
import HeroName from './components/heroName/heroName';


export default class App extends Component{
  // constructor(){
  //   super()
  //   this.state = {
  //     username : "user"
  //   }
  // }

  constructor(){
    super()
    this.state = {
      username : "hantu",
      counter : 0
    };
  }

  // getUsername(){
  //   return this.state.username;
  // }

  // getUsername = ()=>{
  //   return this.setState({
  //     username : "veve"
  //   });
  // }

    increment = () =>{
      this.setState({
        counter : this.state.counter +1,
      })
    }

    decrement = () =>{
      this.setState({
        counter : this.state.counter -1
      })
    }



  render(){
    return (
      <div>
         {/* <h1>{this.state.username}</h1>
        <h1>{this.state.getUsername}</h1>
        <button onClick={()=>{this.getUsername()}}>sqsqs</button>   */}
        
     {/* <h1>{this.state.counter}</h1>
    <button onClick={this.increment}>+</button>
    <button onClick={this.decrement}>-</button>  */}
        {/* <Nav> */}
        <HeroName name="dimasKanjeng"/>
      </div>
  
    )
  }
}


// class HeroName extends Component{
// render(){
// return <h1>{this.props.name}</h1>

// };
// }


// const types = PropTypes;
// HeroName.propTypes = {
// name: types.string,

// } 