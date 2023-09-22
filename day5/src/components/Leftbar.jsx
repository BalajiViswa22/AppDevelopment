import React from 'react'
import { useNavigate } from 'react-router-dom'
import { useDispatch } from 'react-redux';
import { logout } from '../redux/userSlice';


function Leftbar() {

    const dispatch= useDispatch();
    const navigate=useNavigate();

    const homeHandler = () =>{
        navigate('/Home')
     }


const dashboardHandler = ()=>{
    navigate('/Dashboard')
}
const settingsHandler = ()=>{
    navigate('/Settings')
}
const usersHandler = () =>{
    navigate('/Users')
}
const logoutHandler = () =>{
    dispatch(logout())
    navigate('/')
}
    return (
        <>
            <div className='left-bar'>
                <div className='left-bar-container'>
                <button className='left-bar-button nav-btn' onClick={homeHandler}>
              
                        Home
                    </button><br/>
                    <button className='left-bar-button nav-btn' onClick={dashboardHandler}>
                        Dashboard
                    </button><br/>
                    <button className='left-bar-button nav-btn' onClick={usersHandler}>
                        Instructional Videos
                    </button><br/>
                    <button className='left-bar-button nav-btn' onClick={settingsHandler}>
                        Workout Plan
                    </button>
                    <button className='left-bar-button-logout nav-btn' onClick={logoutHandler}>
                        Logout
                    </button>

                </div>
            </div>
        </>
    )
}

export default Leftbar