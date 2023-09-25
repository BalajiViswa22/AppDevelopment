import React from 'react'
import Layout from '../components/Layout'
import { BarChart } from '@mui/x-charts/BarChart';
import { useSelector } from 'react-redux'
import { selectUser } from '../redux/userSlice'
import { BarPlot } from '@mui/x-charts/BarChart';


function Dashboard() {
    const user = useSelector(selectUser);
    const username = user.user && user.user.username ? user.user.username : 'Guest';
    const xAxis=['Day1', 'Day2', 'Day3' ,'Day4','Day5','Day6','Day7'];
    const yAxis=[4,3,5,2,1,4,3]


    return (
        <>
            <Layout/>
            <div className='hello-container'>
               <h1> Hello {username} </h1><br/>
                <p>Today it's a great day to be fit!</p>
            </div>
            <div className='bar-container'>
                    <h2 bar-head>Daily Activity Tracking</h2>
                    <BarChart
                    xAxis={[{ scaleType: 'band', data: xAxis }]}
                    series={[{ data: yAxis }]}
                    width={500}
                    height={300}
                  />
                    
            </div>

            
        </>
    )
}

export default Dashboard