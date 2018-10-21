import React from 'react'
import axios from '../utils/axios'

class Login extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            id: 0,
            password: '',
        }
        this.onSubmit = this.onSubmit.bind(this)
    }

    async onSubmit(){
        const data =await axios.post('/login', {
            id: parseInt(this.state.id),
            password: this.state.password
        },{
            baseURL: 'https://userservice-forgiving-nyala.mybluemix.net'
        });  
        if(data.data.id){

            this.props.setUser(data.data)
        }
        if(this.state.message == 'pass'){
            window.location.href = '/home'
        }
        
    }
    componentDidMount(){
    }

    render() {
        return (
            <div className="container">
                <div className="row">
                    <div className="col-md-4"></div>
                    <div className="col-md-4 login-sec">
                        <br />
                        <br />
                        <br />
                        <br />
                        <br />
                        <h2 className="text-center">Login Now</h2>
                            <div className="form-group">
                                <p style={{color: 'red'}}>{(this.state.message=='fail'?'wrong username or password': '')}</p>
                                <label for="exampleInputEmail1" className="text-uppercase">Username</label>
                                <input type="text" onChange={(e) => {this.setState({id: e.target.value})}} value={this.state.id} className="form-control" placeholder="student id" name="id" />
                            </div>
                            <div className="form-group">
                                <label for="exampleInputPassword1" className="text-uppercase">Password</label>
                                <input type="password" onChange={(e) => {this.setState({password: e.target.value})}} value={this.state.password} className="form-control" placeholder="password" name="password" />
                            </div>
                            <div className="form-check">
                                <button onClick = {this.onSubmit} className="btn btn-primary float-right">Submit</button>
                            </div>

                    </div>

                </div>
            </div>
        )
    }
}
export default Login;