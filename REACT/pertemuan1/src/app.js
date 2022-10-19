// import Navbar from "./components/navbar"
import index from "./index.js";


const App=()=>{
    document.getElementById('root').innerHTML =index();
    // App.innerHTML+= `
    // ${Navbar()}
    // `
}

App()

export default App;