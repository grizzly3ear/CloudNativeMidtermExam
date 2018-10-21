import React from 'react'
import Login from '../components/Login'
import NavBar from '../components/NavBar'
import Home from '../components/Home'

export default class extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            user: '',
            page: ''
        }
        this.setUser = this.setUser.bind(this)
    }
    setUser(data){
        this.setState({
            user: data,
            page: 'home'
        })
    }
    setPage(page){
        this.setState({
            page: page
        })
    }
    render(){
        let content = ''
        switch(this.state.page){
            case '': content = <Login setUser = {this.setUser}/>; break;
            case 'home': content = <Home user = {this.state.user} />; break;
        }
        return (<div>
            <NavBar />
            {content}
        </div>)
    }
}