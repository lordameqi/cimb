import { Link, Outlet } from "react-router-dom";

export default function About(){
    return(
        <div>
            <h1>About us</h1>
            <p>This is my About us Page</p>
            <Link to="about-company">About the kompany</Link> | {" "}
            <Link to="about-me">About mi</Link>
            <Outlet/>
        </div>
    )
}