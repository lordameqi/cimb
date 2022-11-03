import logo from './logo.svg';
import './App.css';
import Header from './component/Header/Header';
import Movie from './component/Movie/Movie';
import React, { useEffect, useState } from 'react';
import {BrowserRouter , Link, Route, Routes} from 'react-router-dom';

function App() {
  const [usersData,setUsersData]=useState([]);
  const [searchInput, setSearchInput] = useState("war");
  const [searchInput2, setSearchInput2] = useState("war");
  const[detail,setDetail] = useState('');

  const getData= async (searchInput)=>{
    let url =''
    if (searchInput !== '') {
      url = `https://www.omdbapi.com/?s=${searchInput}&apikey=bcace2e0`
    }else{
      url = `https://www.omdbapi.com/?s=${searchInput2}&apikey=bcace2e0`
    }
    
    const reponse = await fetch(url);
    
    const responseJSON = await reponse.json();
    // console.log(responseJSON);
    if(responseJSON.Search){

      setUsersData(responseJSON.Search)
    }
  };
  useEffect(() => {
    getData(searchInput);
    // console.log(searchInput);
 
  },[searchInput]);

 



  return (
  <>
  
     <div className="wrapper">

    {/* <!-- HEADER --> */}
    <Header search={setSearchInput}/>
    {/* <!-- END OF HEADER --> */}

    {/* <!-- MAIN CONTAINER --> */}
    <section className="main-container supreme-container" >
      <div className="location" id="home">
       
        <span>
          <h1 id="home">Popular on Netflix </h1>
          
        </span>
        
        <div className="box">
        {
          usersData.map((movie, index)=>(
            <div key={index} className="hui" data-bs-toggle="modal" data-bs-target="#exampleModal">
            <Movie
            key={index}{...movie}
            isiDetail = {setDetail}
           

            />
            </div>
            
          ))

        }
      </div>
      </div>
    </section>
    
    {/* <!-- Modal --> */}
<div className="modal fade" id="exampleModal" tabIndex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div className="modal-dialog" style={{marginRight: 600}} >
    <div className="modal-content" style={{width: "1000px"}}>
      <div className="modal-header">
        <h5 className="modal-title" id="exampleModalLabel" style={{color: 'red'}}>{detail.Title} - ({detail.Year} )</h5>
        <p style={{color: "pink"}}>{detail.Rated} - {detail.Language}</p>
        <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div className="modal-body">
        <div className='gambar' style={{float:'left'}}>
          <img style={{borderRadius:10}} src={detail.Poster} alt="gambar"/>
        </div>
        <div className='tulisan' style={{float: 'right', marginRight: 40}}>
            <h5 style={{color: 'red'}}>Genre &emsp;&ensp;: {detail.Genre}</h5>k
            <h5 style={{color: 'red'}}>Director &ensp;: {detail.Director}</h5>
            <h5 style={{color: 'red'}}>Actors &emsp;&nbsp;: {detail.Actors}</h5>
            <h5 style={{color: 'red'}}>DVD &emsp;&nbsp;&nbsp;&nbsp;&nbsp;: {detail.DVD}</h5>
            <h5 style={{color: 'red'}}>Earnings &nbsp;: {detail.BoxOffice}</h5>
        </div>
        
      </div>
      {/* <div className="modal-footer">
        <button type="button" className="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="button" className="btn btn-primary">Save changes</button>
      </div> */}
    </div>
  </div>
</div>

    {/* <!-- END OF MAIN CONTAINER --> */}

    {/* <!-- LINKS --> */}
    <section className="link">
      <div className="logos">
        <a href="#"><i className="fab fa-facebook-square fa-2x logo"></i></a>
        <a href="#"><i className="fab fa-instagram fa-2x logo"></i></a>
        <a href="#"><i className="fab fa-twitter fa-2x logo"></i></a>
        <a href="#"><i className="fab fa-youtube fa-2x logo"></i></a>
      </div>
      <div className="sub-links">
        <ul>
          <li><a href="#">Audio and Subtitles</a></li>
          <li><a href="#">Audio Description</a></li>
          <li><a href="#">Help Center</a></li>
          <li><a href="#">Gift Cards</a></li>
          <li><a href="#">Media Center</a></li>
          <li><a href="#">Investor Relations</a></li>
          <li><a href="#">Jobs</a></li>
          <li><a href="#">Terms of Use</a></li>
          <li><a href="#">Privacy</a></li>
          <li><a href="#">Legal Notices</a></li>
          <li><a href="#">Corporate Information</a></li>
          <li><a href="#">Contact Us</a></li>
        </ul>
      </div>
    </section>
    {/* <!-- END OF LINKS --> */}

    {/* <!-- FOOTER --> */}
    <footer>
      <p>&copy 1996-2022 Netflix, Inc.</p>
      <p>Rachmad Fadillah &copy 2022</p>
    </footer>
</div>
  </>
  );
}

export default App;
