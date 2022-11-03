import { Component } from "react";

class Experience extends Component{
    render(){
        return(
            <div className="row">
            <div className="col-lg-6">
                <h6 className="section-subtitle">RESUME</h6>
                <h2 className="section-title">EDUCATION</h2>
                <ul className="time-line">
                    <li className="time-line-item">
                        <span className="badge badge-primary">2009 - 2012</span>
                        <h6 className="time-line-item-title">SMP</h6>
                        <p className="time-line-item-subtitle">SMPN 10 Pekanbaru</p>
                        <p className="time-line-item-content">Mauris magna sapien, pharetra consectetur fringilla
                            vitae, interdum sed tortor.</p>
                    </li>
                    <li className="time-line-item">
                        <span className="badge badge-primary">2012-2015</span>
                        <h6 className="time-line-item-title">Elektronika Industri</h6>
                        <p className="time-line-item-subtitle">SMKN 2 Pekanbaru</p>
                        <p className="time-line-item-content">Mauris magna sapien, pharetra consectetur fringilla
                            vitae, interdum sed tortor.
                        </p>
                    </li>
                    <li className="time-line-item">
                        <span className="badge badge-primary">2015 - 2020</span>
                        <h6 className="time-line-item-title">Teknik Informatika</h6>
                        <p className="time-line-item-subtitle">UIN SUSKA RIAU</p>
                        <p className="time-line-item-content">Mauris magna sapien, pharetra consectetur fringilla
                            vitae, interdum sed tortor.
                        </p>
                    </li>
                </ul>
            </div>
            <div className="col-lg-6">
                <h6 className="section-subtitle">RESUME</h6>
                <h2 className="section-title">Experience</h2>
                <ul className="time-line">
                    <li className="time-line-item">
                        <span className="badge badge-primary">2021</span>
                        <h6 className="time-line-item-title">IT Support</h6>
                        <p className="time-line-item-subtitle">Telkomsel Region Sumbagteng</p>
                        <p className="time-line-item-content">Mauris magna sapien, pharetra consectetur fringilla
                            vitae, interdum sed
                            tortor.</p>
                    </li>
                    <li className="time-line-item">
                        <span className="badge badge-primary">2022</span>
                        <h6 className="time-line-item-title">Data Analyst </h6>
                        <p className="time-line-item-subtitle">Gojek</p>
                        <p className="time-line-item-content">Mauris magna sapien, pharetra consectetur fringilla
                            vitae, interdum sed
                            tortor.
                        </p>
                    </li>
                    <li className="time-line-item">
                        <span className="badge badge-primary">2022</span>
                        <h6 className="time-line-item-title">Technology Graduate Program</h6>
                        <p className="time-line-item-subtitle">CIMB Niaga</p>
                        <p className="time-line-item-content">Mauris magna sapien, pharetra consectetur fringilla
                            vitae, interdum sed
                            tortor.
                        </p>
                    </li>
                </ul>
            </div>
        </div>
        )
    }
}

export default Experience;