import {createStore, applyMiddleware} from 'redux';
import thunk from 'redux-thunk';
import logger from 'redux-logger';

const SET_LOGIN_PENDING = 'SET_LOGIN_PENDING';
const SET_LOGIN_SUCCESS = 'SET_LOGIN_SUCCESS';
const SET_LOGIN_ERROR   = 'SET LOGIN ERROR';

const initialState = {
    isLoginPending: false,
    isLoginSuccess: false,
    loginError :null
}

const reducer = (state = initialState, action) =>{
    switch (action.type) {
        case SET_LOGIN_PENDING:
            
            return{
                ...state,
                isLoginPending: action.isLoginPending
            } 
        case SET_LOGIN_SUCCESS:
            return{
                ...state,
                isLoginSuccess: action.isLoginSuccess
            }   
        case SET_LOGIN_ERROR:
            return{
                ...state,
                loginError: action.loginError
            }
        default:
            return state;
    }
}

const store = createStore(reducer,applyMiddleware(thunk, logger))

export default store;