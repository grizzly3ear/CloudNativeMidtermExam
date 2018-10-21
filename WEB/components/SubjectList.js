import React from 'react'
import Subject from './Subject'
import axios from '../utils/axios'

export default class extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            subjects: [],
            message: 'no course to be show or please wait'
        }
        this.getList = this.getList.bind(this)
        this.setMessage = this.setMessage.bind(this)
    }
    async getList() {
        const data = await axios.get(`subject/${this.props.user.id}`, {
            baseURL: 'https://subjectservice-restless-mongoose.mybluemix.net'
        })
        this.setState({
            subjects: data.data
        })

    }
    componentDidMount() {
        this.getList()
    }
    setMessage(message){
        this.setState({
            message: message
        })
    }
    

    render() {
        const subjects = this.state.subjects.map(subject => {
            return (
                <Subject data={subject} key={subject.id} id={this.props.user.id} year={this.props.user.year} setMessage={this.setMessage}  />
            )
        })
        return (
            <div>
                <div className="row">
                    <div className="col-md-3"></div>
                    <div className="col-md-2"><h5>Course Code</h5></div>
                    <div className="col-md-2"><h5>Course Name</h5></div>
                    <div className="col-md-2"><h5>Lecturer</h5></div>
                    <div className="col-md-2"><h5>Seat</h5></div>

                </div>
                {subjects}
                <h2>{this.state.message}</h2>
            </div>
            
        )
    }
}