import logo from './logo.svg';
import './App.css';
import CounterClass from './component/CounterClass';
import CounterFn from './component/CounterFn';

function App() {
  return (
    <div className="App">
      <CounterClass/>
      <CounterFn/>
    </div>
  );
}

export default App;
