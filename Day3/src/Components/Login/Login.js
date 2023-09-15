import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';

import './Login.css';

function Login() {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const navigate=useNavigate();

  const handleEmailChange = (e) => {
    setEmail(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    alert(`Logged in with email: ${email}`);
  };

  return (
    
    <div className='g'>
    
    <div className="login-container" style={{minHeight:"330px"}}>
      <h2>Login</h2>
  
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label>Email</label>
          <input
            type="email"
            placeholder="Enter your email"
            value={email}
            onChange={handleEmailChange}
            required
          />
        </div>
        <div className="form-group">
          <label>Password</label>
          <input
            type="password"
            placeholder="Enter your password"
            value={password}
            onChange={handlePasswordChange}
            required
          />
        </div>
        <button type="submit" >Login</button>
      </form>
      <p className='mt-4' style={{minWidth:"500px"}}>Not you have an account               <button onClick={()=>navigate("/Signup")} style={{backgroundColor:"transparent",color:"black",border:"none!important"}} >Click Here</button></p>
    </div>
    </div>
  );
}

export default Login;