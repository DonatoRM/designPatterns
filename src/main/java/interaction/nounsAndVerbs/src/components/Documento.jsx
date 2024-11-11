import React from 'react';

const Documento = ({ documento, editarDocumento, eliminarDocumento }) => {
    if (!documento) return <div>Selecciona un documento.</div>;

    return (
        <div>
            <h2>{documento.nombre}</h2>
            <p>{documento.contenido}</p>
            <button onClick={() => editarDocumento(documento)}>Editar</button>
            <button onClick={() => eliminarDocumento(documento)}>Eliminar</button>
        </div>
    );
};

export default Documento;
