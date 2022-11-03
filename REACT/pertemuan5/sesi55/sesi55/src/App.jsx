import logo from './logo.svg';
// import './App.css';
import 'bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  return (
   <div>
   <Header/>
    <div className='container'>
      <Content/>
    </div>
    <Footer/>
   </div>
  );
}

function Content() {
  return(
    <>
    <div className="p-5 mb-4 bg-light rounded-3 border">
      <div className="container-fluid py-5">
        <h1 className="display-5 fw-bold">First Paragprah in Jumbotron</h1>
        <p className="col-md-8 fs-4">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Aliquet nibh praesent tristique magna. Cras semper auctor neque vitae tempus quam. Cum sociis natoque penatibus et magnis dis parturient. Vestibulum lorem sed risus ultricies tristique nulla aliquet. Volutpat commodo sed egestas egestas fringilla. Leo vel orci porta non. Tortor at auctor urna nunc. Nunc pulvinar sapien et ligula ullamcorper malesuada proin libero. Convallis a cras semper auctor. Duis at consectetur lorem donec massa sapien faucibus. A iaculis at erat pellentesque adipiscing commodo elit at. Maecenas volutpat blandit aliquam etiam erat velit scelerisque. Tincidunt praesent semper feugiat nibh sed pulvinar proin gravida.</p>
        <button className='btn btn-primary btn-lg' type='button' data-bs-toggle='modal' data-bs-target='#exampleModal'>Example Button</button>
      </div>
    </div>

    {/* modal */}
    <div className='modal fade' id="exampleModal" tabIndex="-1" aria-labelledby="exampleModalLabel" aria-hidden='true'>
      <div className='modal-dialog'>
        <div className='modal-content'>
          <div className='modal-header'>
            <h5 className='modal-title' id='exampleModalLabel'>Modal Title</h5>
            <button type='button' className='btn-close' data-bs-dismiss='modal' aria-label='Close'></button>
          </div>
          <div className='modal-body'>
            This is my first modal box
          </div>
          <div className='modal-footer'>
            <button type='button' className='btn btn-secondary' data-bs-dismiss="modal">Close</button>
            <button type='button' className='btn btn-primary' data-bs-dismiss="modal">Save Changes</button>
          </div>
        </div>
      </div>
    </div>
    </>
  );
}

function Header() {
  return(
    <>
    <nav className='py-2 bg-light border-bottom'>
      <div className='container d-flex flex-wrap'>
        <ul className='nav me-auto'>
          <li className='nav-item'>
            <a href='/' className='nav-link link-dark px-2 active' aria-current="page">Home</a>
          </li>
          <li className='nav-item'><a href='/' className='nav-link link-dark px-2'>Features</a></li>
          <li className='nav-item'><a href='/' className='nav-link link-dark px-2'>FAQs</a></li>
          <li className='nav-item'><a href='/' className='nav-link link-dark px-2'>Abouts</a></li>
        </ul>

        <ul className='nav'>
        <li className='nav-item'><a href='/' className='nav-link link-dark px-2'>Login</a></li>
        <li className='nav-item'><a href='/' className='nav-link link-dark px-2'>Sign Up</a></li>
        </ul>
      </div>
    </nav>
    <header className='py-3 mb-4 border-bottom'>
      <div className='container d-flex flex-wrap justify-content-center'>
        <a href='/' className='d-flex align-items-center mb-3 mb-lg-0 me-lg-auto text-dark text-decoration-none'><span className='fs-4'>My First React App</span></a>
        <form className='col-12 col-lg-auto mb-3 mb-lg-0'>
          <input className='form-control' placeholder='Search....' aria-label='Search' type='search' />
        </form>
      </div>
    </header>
    </>
  );
}

function Footer() {
  return(
    <footer className='text-muted py-5 border-top'>
      <div className='container'>
        <p className='mb-1'>this is my first react app in bootstrap</p>
        <p className='mb-0'>New to react? <a>visitlaah</a></p>
      </div>
    </footer>
  );
}

export default App;
