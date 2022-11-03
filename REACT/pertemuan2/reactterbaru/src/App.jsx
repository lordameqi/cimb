import './App.css';
import './Tampan.css';
import TopNav from './component/Nav/Nav';
import Content from './component/Content/Content';
import Footer from './component/Footer/Footer';
function App() {
    return (
        <div className="App">
           {/* TopNav */}
            <TopNav/>

          <Content/>
           <Footer/>
        </div>
    );
}

export default App;
