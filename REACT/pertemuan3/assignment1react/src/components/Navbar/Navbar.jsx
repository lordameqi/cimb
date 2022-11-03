import { Component } from "react";
import {NavLink, useNavigate} from "react-router-dom";

const Navbar = () =>{
    
        return(
            <ul id='ha'>
            <li><NavLink to="/home">Home</NavLink></li>
            <li><NavLink to="/about">About</NavLink></li>
            <li><NavLink to="/awards">Awards</NavLink></li>
            <li><NavLink to="/experience">Experience</NavLink></li>
            <li><NavLink to="/interest">Interest</NavLink></li>
            <li><NavLink to="/skills">Skills</NavLink></li>
          </ul>
        )
    }

export default Navbar;