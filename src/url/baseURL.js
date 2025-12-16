import axios from "axios";

const api = axios.create({
    baseURL : 'https://port-0-meetpoint-backend-1272llwvu36eh.sel5.cloudtype.app',
    // baseURL : "http://localhost:8080",
    headers : {
        'Content-Type': 'application/json; charset=UTF-8' 
    },
    withCredentials: true,
});

export default api;
