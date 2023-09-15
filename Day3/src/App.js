import React,{useState}from 'react'
import Login from './Components/Login/Login.js';
import Signup from './Components/Signup/Signup.js';
import {BrowserRouter,Routes,Route} from 'react-router-dom';


function App() {
  return (
    <div>
      <BrowserRouter>
    <Routes>
      <Route path="/" element={<Login/>}/>
      <Route path="/signup" element={<Signup/>}/>
      </Routes>
      </BrowserRouter>
    </div>
  )
}

export default App