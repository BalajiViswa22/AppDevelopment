import React from 'react'
import Layout from '../components/Layout'
import { useSelector } from 'react-redux'
import { selectUser } from '../redux/userSlice'
import Footer from '../components/Footer'

function Dashboard() {
    const user = useSelector(selectUser);
    const username = user.user && user.user.username ? user.user.username : 'Guest';
   
    return (
        <>
           
            <Layout />
            
            <div className='main-wrapper' >
                <div className='welcome-container1'>
                    <h1> Welcome {username} !</h1>
                    
                </div>
            </div>
        </>
    )
}

export default Dashboard