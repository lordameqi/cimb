import { Component } from "react";
import Penghubung1 from "../Penghubung/Penghubung1";
import Penghubung2 from "../Penghubung/Penghubung2";
import { Route,Routes } from 'react-router-dom';
import Interest from "../Interest/Interest";
import Awards from "../Awards/Awards";
class About extends Component{
    render(){
        return(
            <div className="content-wrapper">
            <aside>
            <div className="profile-img-wrapper">
                <img src="https://s4.anilist.co/file/anilistcdn/character/large/b138100-OqluaSXHMvUV.png" alt="profile" />
            </div>
            <h1 className="profile-name">Rachmad Fadillah</h1>
            <div className="text-center">
                <span className="badge badge-white badge-pill profile-designation">TGP</span>
            </div>
           
            <div className="widget">
                <h5 className="widget-title">personal information</h5>
                <div className="widget-content">
                    <p>BIRTHDAY : 01 Desember 1996</p>
                    {/* <p>WEBSITE : www.example.com</p> */}
                    <p>PHONE : +62 852 6467 9459</p>
                    <p>Location : Bintaro, USA</p>
                    <p>MAIL : rachmad.fadillah@cimbniaga.co.id</p>
                    {/* <button className="btn btn-download-cv btn-primary rounded-pill"> 
                    <img src={process.env.PUBLIC_URL+"assets/images/download.svg"} alt="download" className="btn-img" />DOWNLOAD CV </button> */}
                </div>
            </div>
            <center><h5>Awards & Interest</h5></center>
            <Routes>
                <Route path='/home' element={<><Awards/><Interest/></>}></Route>
                <Route path='/awards' element={<><Awards/></>}></Route>
                <Route path='/interest' element={<><Interest/></>}></Route>

            </Routes>
           {/* Awards */}
           {/* <Awards/> */}
           {/* interest */}
           {/* <Interest/> */}
        </aside>
        <main>
        <section class="intro-section">
                <h2 class="section-title">Hello, Rachmad Fadiilah!</h2>
                <p>I'm Technology Graduates Program Fullstack Dev from CIMB Niaga, working in web development and print
                    media. I enjoy turning complex problems into simple, beautiful and intuitive designs. My job is to
                    build your website so that it is functional and user-friendly but at the same time attractive.
                    Moreover, I add personal touch to your product and make sure that is eye-catching and easy to use.
                    My aim is to bring across your message and identity in the most creative way. I created web design
                    for many famous brand companies.</p>
                <a href="#!" class="btn btn-primary btn-hire-me">HIRE ME</a>
            </section>
            <Penghubung1/>
            <Penghubung2/>
        </main>
        </div>
        )
    }
}

export default About;