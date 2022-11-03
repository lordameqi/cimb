import { useNavigate } from "react-router";

export default function ItemRow({item}){
    const navigate = useNavigate();

    return(
        <tr>
            <td>{item.name}</td>
            <td>
                <button onClick={() => {navigate(`${item.id}`)}}>Show detail</button>
            </td>
        </tr>
    )
}