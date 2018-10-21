import React from 'react'
import axios from '../utils/axios'

class Subject extends React.Component {
    constructor(props) {
        super(props)
        this.state = {

        }
    }

    async enrollSubject(subjectId) {
        console.log('====================================');
        console.log(this.props.id + '   ' + subjectId);
        console.log('====================================');
        const { data } = await axios.post('/enroll', {
            studentId: this.props.id,
            subjectId: subjectId,
            year: this.props.year

        }, {
                baseURL: 'http://localhost:8080'
            })
        console.log('finish enroll')
        console.log('====================================');
        console.log({ data });
        console.log('====================================');
    }

    render() {

        return (
            <div className="row">
                <div className="col-md-3"></div>
                {console.log(this.props.data.id)}
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