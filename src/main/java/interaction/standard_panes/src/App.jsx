// src/App.jsx
import React, { useState } from 'react';
import PanelProyectos from './components/PanelProyectos';
import PanelTareas from './components/PanelTareas';
import PanelCalendario from './components/PanelCalendario';
import PanelConfiguracion from './components/PanelConfiguracion';

function App() {
    const [proyectoSeleccionado, setProyectoSeleccionado] = useState(null);
    const [tabActivo, setTabActivo] = useState('Proyectos');

    const proyectos = [
        { nombre: 'Proyecto A', tareas: ['Tarea 1', 'Tarea 2'] },
        { nombre: 'Proyecto B', tareas: ['Tarea 3', 'Tarea 4'] },
        { nombre: 'Proyecto C', tareas: ['Tarea 5', 'Tarea 6'] }
    ];

    const seleccionarProyecto = (proyecto) => {
        setProyectoSeleccionado(proyecto);
        setTabActivo('Tareas');
    };

    return (
        <div>
            <nav>
                <button onClick={() => setTabActivo('Proyectos')}>Proyectos</button>
                <button onClick={() => setTabActivo('Tareas')} disabled={!proyectoSeleccionado}>Tareas</button>
                <button onClick={() => setTabActivo('Calendario')}>Calendario</button>
                <button onClick={() => setTabActivo('Configuracion')}>Configuración</button>
            </nav>

            {tabActivo === 'Proyectos' && (
                <PanelProyectos proyectos={proyectos} seleccionarProyecto={seleccionarProyecto} />
            )}
            {tabActivo === 'Tareas' && proyectoSeleccionado && (
                <PanelTareas tareas={proyectoSeleccionado.tareas} />
            )}
            {tabActivo === 'Calendario' && <PanelCalendario />}
            {tabActivo === 'Configuracion' && <PanelConfiguracion />}
        </div>
    );
}

export default App;
