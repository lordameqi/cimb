
import './App.css';
import { Component } from 'react';
import Home from './components/Home/Home';
import Experience from './components/Experience/Experience';
import About from './components/About/About';
import Navbar from './components/Navbar/Navbar';
import { Route,Routes } from 'react-router-dom';


export default class App extends Component{
render(){
  return(
    <div>
     <Navbar/>
      <Home />
    
     
    
    </div>
  )
}

}


