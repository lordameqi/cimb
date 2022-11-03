import { Link, Outlet } from "react-router-dom";

export default function Members(){
    return(
        <div>
            <h1>Member Page</h1>
            <p>Select a member to be shown</p>
            <Link to='jhon dtoel'>Jhon Doe</Link> | {" "}
            <Link to='doe jane'>Doe Jane</Link>
            <Outlet/>
        </div>
    )
}