import { Component } from "react";

class Skills extends Component{
    render(){
        return(
            <div className="row">
                <div className="media service-card col-lg-6">
                    <div className="service-icon">
                        <img src={process.env.PUBLIC_URL+"assets/images/001-target.svg"} alt="target" />
                    </div>
                    <div className="media-body">
                        <h5 className="service-title">web designing</h5>
                        <p className="service-description">Mauris magna sapien, pharetra consectetur fringilla vitae, interdum sed
                            tortor.</p>
                    </div>
                </div>
                <div className="media service-card col-lg-6">
                    <div className="service-icon">
                        <img src={process.env.PUBLIC_URL+"assets/images/003-idea.svg"} alt="bulb" />
                    </div>
                    <div className="media-body">
                        <h5 className="service-title">Graphic design</h5>
                        <p className="service-description">Mauris magna sapien, pharetra consectetur fringilla vitae, interdum sed
                            tortor.
                        </p>
                    </div>
                </div>
                <div className="media service-card col-lg-6">
                    <div className="service-icon">
                        <img src={process.env.PUBLIC_URL+"assets/images/002-development.svg"} alt="development" />
                    </div>
                    <div className="media-body">
                        <h5 className="service-title">Development</h5>
                        <p className="service-description">Mauris magna sapien, pharetra consectetur fringilla vitae, interdum sed
                            tortor.
                        </p>
                    </div>
                </div>
                <div className="media service-card col-lg-6">
                    <div className="service-icon">
                        <img src={process.env.PUBLIC_URL+"assets/images/004-smartphone.svg"} alt="smartphone" />
                    </div>
                    <div className="media-body">
                        <h5 className="service-title">Mobile design</h5>
                        <p className="service-description">Mauris magna sapien, pharetra consectetur fringilla vitae, interdum sed
                            tortor.
                        </p>
                    </div>
                </div>
            </div>
        )
    }
}

export default Skills;