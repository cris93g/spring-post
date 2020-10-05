import React,{useState,useEffect} from 'react';
import axios from 'axios';

function App() {
const [items,setItems] = useState([]);
useEffect(()=>{
    axios.get('/products').then(res=>setItems(res.data))
},[items])
console.log(items)
return(
<div>
    {items ? items.map(item=>{
    return(
    <div>
        <p>{item.name}</p>
    </div>
    )
    }): ''}
</div>
)

}

export default App;
