// import {Link} from "react-router-dom";
import Search from "../Search/Search";
import {BrowserRouter , Link, Route, Routes} from 'react-router-dom';

const Header = (props) =>{
    return(
        <>
        {/* <!-- HEADER --> */}
<header>
  <div className="netflixLogo">
    <a id="logo" href="#home">
      <img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/logo.PNG?raw=true" alt="Logo Image" />
      </a>
  </div>      
  <nav className="main-nav">                
    <a href="#home">Home</a>
    <a href="#tvShows">TV Shows</a>
    <a href="#movies">Movies</a>
    <a href="#originals">Originals</a>
    <a href="#">Recently Added</a>
    
    <a target="_blank" href="https://github.com/lordameqi">Portfolio</a>        
  </nav>
  <nav className="sub-nav">
   {/* Search */}
   <Search search2={props.search}/>

{/*    
   { <div className="search-container">
        { <input value={props.value} onChange={(event)=> 
        
        props.search(event.target.value)} id="cari"  type="text" name="search" placeholder="Search..." className="search-input"
        /> }
      
     
        <a onClick={()=> 
        
        props.search(
        document.getElementById("cari").value
      )} className="search-btn">
                <i className="fas fa-search"></i> 
                   
        </a>
    </div> } */}
  
      {/* <input type="text" id="cari" value={props.value} ></input>
      <button onClick={()=>props.search(
        document.getElementById("cari").value
      )}>Search</button> */}
      
  </nav>      
</header>
{/* <!-- END OF HEADER --> */}
        </>
    )
}

export default Header;