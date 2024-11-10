import React from 'react';

const PanelTareas = ({ tareas }) => {
    return (
        <div>
            <h2>Tareas</h2>
            <ul>
                {tareas.map((tarea, index) => (
                    <li key={index}>{tarea}</li>
                ))}
            </ul>
        </div>
    );
};

export default PanelTareas;
