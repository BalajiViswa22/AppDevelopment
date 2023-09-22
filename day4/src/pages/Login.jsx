import React, { useEffect, useState } from 'react'
import { useNavigate, Link } from 'react-router-dom'
import { useDispatch } from 'react-redux';
import { login } from '../redux/userSlice';
import backgroundImage from '../assets/img/bg.jpg';

function Login() {
  const dispatch = useDispatch();
  const navigate = useNavigate();
  const [formdata, setFormdata] = useState({
    username: '',
    password: ''
  })
  const handleChange = (e) => {
    setFormdata({ ...formdata, [e.target.id]: e.target.value })
  }
  const submitHandler = (e) => {

    console.log(formdata.username,formdata.password)
    
    e.preventDefault;
    dispatch(login(formdata.username));
    navigate('/Dashboard')
  }
  const containerStyle = {
    backgroundImage: `url(${backgroundImage})`,
    backgroundRepeat: 'no-repeat',
    backgroundSize: 'cover',
    minHeight: '100vh',
    minWidth: '100vw',
  };
  return (
    <>
      <div className='auth-container' style={containerStyle}>
        <div className='auth-wrapper'>
          <form className='auth-form app-x-shadow' onSubmit={submitHandler}>
            <h1 className='auth-heading1'>Login Form</h1>
            <input type="text" name="username" id="username" value={formdata.username} onChange={handleChange} placeholder='username' className='auth-field'  autoComplete='off'required />
            <input type="password" name="password" id="password" value={formdata.password} onChange={handleChange} placeholder='password' className='auth-field' required />

            <button type='submit' className='auth-btn app-x-shadow'> Login </button>
          </form>
          <div className='auth-links-container'>
            <h2> Don't have an account?</h2>
            <Link to='/Register' className='auth-links'>Signup</Link>
          </div>
        </div>
      </div>
    </>
  )
}

export default Login


