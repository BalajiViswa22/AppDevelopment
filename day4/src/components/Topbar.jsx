import React from 'react'
import { useSelector } from 'react-redux'
import { selectUser } from '../redux/userSlice'



function Topbar() {
    const user = useSelector(selectUser);
    const username = user.user && user.user.username ? user.user.username : 'Guest';

    return (
        <>
            <div className='topbar'>
                <h1 className='user username-color'>{username }</h1>
            </div>
        </>
    )
}

export default Topbar