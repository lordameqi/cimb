import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import {useSelector, useDispatch} from 'react-redux';
import { login } from './store/action';

function App() {
  const state = useSelector((state) => state);
  const dispatch = useDispatch();

  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const emailChange = (event) =>{
    setEmail(event.target.value)
  }

  const passwordChange = (event) =>{
    setPassword(event.target.value)
  }

  const doSubmit = (event) =>{
    event.preventDefault();
    dispatch(login(email,password));
    setEmail('');
    setPassword('');
  }

  return (
    <form name="loginForm" onSubmit={doSubmit}>
      <div className="form-group-collection">
        <div className="form-group">
          <label>Email:</label>
          <input type="email" name='email' onChange={emailChange} value={email} />
        </div>

        <div className="form-group">
          <label>Password:</label>
          <input type="password" name='password' onChange={passwordChange} value={password} />
        </div>
      </div>

      <input type="submit" value="Login" />
      <div className="message">
        {state.isLoginPending && <div>Pending...</div>}
        {state.isLoginSuccess && <div>Success...</div>}
        {state.loginError && <div>{state.loginError.message}</div>}
      </div>
    </form>
  );
}

export default App;
