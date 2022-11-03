import logo from './logo.svg';
import './App.css';
import Home from './pages/Home';
import Navbar from './component/Navbar';
import About from './pages/About';
import AboutCompany from './pages/AboutCompany';
import AboutMe from './pages/AboutMe';
import { Route, Routes } from 'react-router-dom';
import Members from './pages/Members';
import Member from './pages/Member';
import Items from './pages/Items';
import Item from './pages/Item';

function App() {
  return (
    <div className="container">
      <Navbar/>
      <Routes>
        <Route path="/" element={<Home/>}></Route>
        <Route path="/about" element={<About/>}>

          <Route path='about-company' element={<AboutCompany/>}></Route>
          <Route path='about-me' element={<AboutMe/>}></Route>
        </Route>

        <Route path='/members' element={<Members/>}>
          <Route path=':memberName' element={<Member/>}></Route>
        </Route>

        <Route path="/items" element={<Items/>}>
        <Route path=':itemID' element={<Item/>}></Route>
        </Route>
      </Routes>
    </div>
  );
}

export default App;
