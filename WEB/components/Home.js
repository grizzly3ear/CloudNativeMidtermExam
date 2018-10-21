import React from 'react'
import NavBar from './NavBar'
import SubjectList from './SubjectList'

export default class extends React.Component{
    constructor(props){
        super(props)
        this.state = {

        }
    }
    render(){
        return (
            <div>
                <SubjectList user={this.props.user} setPage={this.props.setPage} />
            </div>
        )
    }
}