import { useParams } from "react-router-dom"

export default function Member(){
    let params = useParams()
    return(
        <div>
            <h3>{params.memberName}</h3>
            <p>this is the detail {params.memberName}</p>
        </div>
    )
}