import {useEffect, useState} from "react";
import PanelNavegacion from "./components/PanelNavegacion.jsx";
import PanelListaCorreos from "./components/PanelListaCorreos.jsx";
import PanelLecturaYComposicion from "./components/PanelLecturaYComposicion.jsx";

function App() {
    const [carpeta, setCarpeta] = useState('inbox');
    const [correos, setCorreos] = useState([]);
    const [correoSeleccionado, setCorreoSeleccionado] = useState(null);
    useEffect(() => {
        setCorreos([
            {id: 1, asunto: 'Correo 1', cuerpo: 'Contenido del correo 1'},
            {id: 2, asunto: 'Correo 2', cuerpo: 'Contenido del correo 2'}
        ]);
    }, [carpeta]);
    return (
        <div>
            <PanelNavegacion seleccionarCarpeta={setCarpeta}/>
            <PanelListaCorreos correos={correos} seleccionarCorreo={setCorreoSeleccionado}/>
            <PanelLecturaYComposicion correo={correoSeleccionado}/>
        </div>
    );
}

export default App;