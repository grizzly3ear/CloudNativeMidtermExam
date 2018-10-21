import axios from 'axios'

const instance = axios.create({
    baseURL: 'http://',
    header: {

    }
})

export default instance