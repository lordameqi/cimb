
export const fetchUser = () => {
    return async(dispatch) => {
        const rest = await fetch('https://jsonplaceholder.typicode.com/users')
        const user = await rest.json()
        dispatch({
            type: "SET_USERS",
            payload: user
        })
    }
}