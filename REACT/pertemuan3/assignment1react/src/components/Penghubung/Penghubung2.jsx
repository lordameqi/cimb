import { Component } from "react";
import Skills from "../Skills/Skills";
import { Route,Routes } from 'react-router-dom';
class Penghubung2 extends Component{
    render() {
        return (
            <section className="services-section">
            <h6 className="section-subtitle">WHAT I DO</h6>
            <h2 className="section-title">Skills</h2>
            <Routes>
                <Route path='/home' element={<><Skills/></>}></Route>
                <Route path='/skills' element={<Skills/>}></Route>
            </Routes>
            {/* <Skills/> */}
        </section>
        );
    }
}

export default Penghubung2;