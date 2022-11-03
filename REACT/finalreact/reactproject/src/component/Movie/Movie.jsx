import {Link} from "react-router-dom";

const Movie = ({Title, Poster, isiDetail, imdbID,tol}) =>{
  const Detail = async () => {

    fetch(`https://www.omdbapi.com/?i=${imdbID}&apikey=943f16ec`)
    .then(res => res.json())
    .then(data => {isiDetail(data)
    // console.log(data);
    })
    // console.log(fetch(`http://www.omdbapi.com/?i=${imdbID}&apikey=943f16ec`));
}
  
    return(
        <>
        {/* <!-- MAIN CONTAINER --> */}
{/* <section className="main-container" >
  <div className="location" id="home"> */}
      {/* <h1 id="home">Popular on Netflix</h1> */}
      {/* <div className="box"> */}
        {
            // props.movies.map((movie,index)=>(
               <div className="hui" onClick={Detail} data-bs-toggle="modal" data-bs-target="#exampleModal">
                  <span>
                    <img style={{height:240, width: 197}} src={
                    Poster === "N/A" ? 'https://agentestudio.com/uploads/post/image/69/main_how_to_design_404_page.png' : Poster} alt="" />
                  <div className="haha">
                        <p>{Title}</p>
                    </div>
                  </span> 
                </div>
            // ))
        }
      {/* </div> */}
  {/* </div> */}

  {/* <!-- Modal --> */}
{/* <div className="modal fade" id="exampleModal" tabIndex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div className="modal-dialog">
    <div className="modal-content">
      <div className="modal-header">
        <h5 className="modal-title" id="exampleModalLabel" style={{color: 'red'}}>Modal title</h5>
        <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div className="modal-body">
        <h1 style={{color: 'red'}}>swi</h1>k
      </div> */}
      {/* <div className="modal-footer">
        <button type="button" className="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="button" className="btn btn-primary">Save changes</button>
      </div> */}
    {/* </div>
  </div>
</div> */}

  {/* // </section> */}
{/* <!-- END OF MAIN CONTAINER --> */}

{/* <!-- LINKS --> */}
{/* <section className="link">
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
</section> */}
{/* <!-- END OF LINKS --> */}

{/* <!-- FOOTER --> */}
{/* <footer>
  <p>&copy 1996-2022 Netflix, Inc.</p>
  <p>Rachmad Fadillah &copy 2022</p>
</footer> */}
        </>
    )
}

export default Movie;