import { Link } from "react-router-dom";

export default function Navbar(){
    return(
        <nav>
            <Link to='/'>Home</Link> | <Link to='/about'>About</Link> | <Link to={'/members'}>Members</Link> |<Link to={'/items'}>Items</Link>
        </nav>
    )
}