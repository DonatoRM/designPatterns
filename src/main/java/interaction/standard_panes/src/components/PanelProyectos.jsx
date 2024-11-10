import React from 'react';

const PanelProyectos = ({ proyectos, seleccionarProyecto }) => {
    return (
        <div>
            <h2>Proyectos</h2>
            <ul>
                {proyectos.map((proyecto, index) => (
                    <li key={index} onClick={() => seleccionarProyecto(proyecto)}>
                        {proyecto.nombre}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default PanelProyectos;
