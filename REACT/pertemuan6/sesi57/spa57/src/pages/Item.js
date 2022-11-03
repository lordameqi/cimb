import { useParams } from "react-router-dom";
import { getItems } from "../Items";

export default function Item(){
    let ha = useParams();
    let hu = getItems();
    let hi = hu.find(
        hi => hi.id === Number(ha.itemID)
    )

    return(
        <div>
            <h3>{hi.name}</h3>
            <p>Power: {hi.power}</p>
        </div>
    )
}