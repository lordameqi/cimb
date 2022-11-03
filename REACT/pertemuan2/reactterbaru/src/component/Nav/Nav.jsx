import { Component } from "react";

function TopNav(){
    return(
        <div className="topnav">
        <a>QTEMU</a>
        <a>Create Meetup</a>
        <a>Explore</a>
        <a style={{float : "right"}}>Login</a>
    </div>
    )
}

export default TopNav;