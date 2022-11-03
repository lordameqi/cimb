import {
     useSelector,
     useDispatch 
    } from "react-redux";
import { fetchUser } from "../store/action";

const CounterFn = () =>{
    const state = useSelector((state) => state)
    const dispatch = useDispatch()

    const increment = () =>{
        dispatch({
            type:"INCREMENT"
        })
    }

    const decrement = () =>{
        dispatch({
            type: "DECREMENT"
        })
    }

    const customIncrement = () =>{
        dispatch({
            type: "INCREMENT",
            payload:10
        })
    }
    const handleFetchUsers = () =>{
        dispatch(fetchUser())
    }
    return(
        <div className="demo">
        <hr/>
        <h1>Functional Component Counter</h1>
        <h1 id="counter">{state.counter}</h1>
        <button id="decrement" onClick={decrement}>-</button>
        &nbsp;&nbsp;
        <button id="increment" onClick={increment}>+</button>
        &nbsp;&nbsp;
        <button id="decrement" onClick={customIncrement}>+ 10</button>

        <hr/>
        <button onClick={handleFetchUsers}>Get User</button>
        <br/><br/>
        <center>
        <table border='1'>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Username</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                {
                    state.user.map((user,idx)=>(
                        <tr key={idx}>
                            <td>{user.name}</td>
                            <td>{user.username}</td>
                            <td>{user.email}</td>
                        </tr>
                    ))
                }
            </tbody>
        </table>
        </center>
        </div>
    )
}
export default CounterFn;