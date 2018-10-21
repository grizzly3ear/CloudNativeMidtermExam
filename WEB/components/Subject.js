import React from 'react'
import axios from '../utils/axios'

class Subject extends React.Component {
    constructor(props) {
        super(props)
        this.state = {

        }
    }

    async enrollSubject(subjectId) {
        const { data } = await axios.post('/enroll', {
            studentId: this.props.id,
            subjectId: subjectId,
            year: this.props.year

        }, {
            baseURL: 'https://enrollservice-timely-emu.mybluemix.net'
        })
        if({data} && {data} != ''){
            this.props.setMessage('Enroll Finish!!')
        }
    }

    render() {

        return (
            <div className="row">
                <div className="col-md-3"></div>
                <div className="col-md-2"><h5>{this.props.data.courseCode}</h5></div>
                <div className="col-md-2"><h5>{this.props.data.courseName}</h5></div>
                <div className="col-md-2"><h5>{this.props.data.lecturer}</h5></div>
                <div className="col-md-2"><h5>{this.props.data.seat}</h5></div>
                <button className="btn btn-primary" onClick={() => { this.enrollSubject(this.props.data.id) }} >Enroll!!</button>

            </div>
        )
    }
}
export default Subject