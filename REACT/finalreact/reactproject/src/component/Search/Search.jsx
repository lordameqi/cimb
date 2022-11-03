import {Link} from "react-router-dom";
import React, { useEffect, useState } from 'react';

export default function Search(props){

    return(
        <div className="search-container">
        <input value={props.value} onChange={(event)=> 
        
        props.search2(event.target.value)} id="cari"  type="text" name="search" placeholder="Search..." className="search-input" 
        />
         <a href="#" className="search-btn">
                <i className="fas fa-search"></i>      
        </a>
      
     
        {/* <a onClick={()=> 
        
        props.search(
        document.getElementById("cari").value
      )} className="search-btn">
                <i className="fas fa-search"></i> 
                   
        </a> */}
    </div>
  
    )
}