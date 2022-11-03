import { Outlet } from "react-router-dom";
import ItemRow from "../component/ItemRow";
import { getItems } from "../Items";

export default function Items(){
    const nilai = getItems();
    return(
        <div>
            <h1>Items Page</h1>
            <p>Select an item to be shown</p>
            <table>
                <tr>
                    <td>Item</td>
                    <td>Action</td>
                </tr>
                {
                    nilai.map(item=>(
                        <ItemRow key={item.id} item={item}/>
                    ))
                }
            </table>
            <Outlet/>
        </div>
    )
}