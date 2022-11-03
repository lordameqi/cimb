import { Component } from "react";
import Experience from "../Experience/Experience";
import Awards from "../Awards/Awards";
import Interest from "../Interest/Interest";
import { Route,Routes } from 'react-router-dom';
class Penghubung1 extends Component{
    render(){
        return(
        <section className="resume-section">
          <h2>Experience & Education</h2>
          {/* <Experience/>  */}
          <Routes>
              <Route path='/home' element={<><Experience/></>}></Route>
              <Route path='/experience' element={<Experience/>}></Route>
          </Routes>
        </section>
        )
    }
}

export default Penghubung1;