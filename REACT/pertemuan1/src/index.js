import Navbar from "./components/navbar.js"
import Section from "./components/section.js"

const index = () =>{
    return `
    ${Navbar()}
    ${Section("home","dark")}
    ${Section("about","danger")}
    ${Section("gallery","warning")}
    `
}

export default index