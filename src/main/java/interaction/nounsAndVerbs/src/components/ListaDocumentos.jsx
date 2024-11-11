import React from 'react';

const ListaDocumentos = ({ documentos, seleccionarDocumento }) => {
    return (
        <div>
            <h2>Documentos</h2>
            <ul>
                {documentos.map((doc, index) => (
                    <li key={index} onClick={() => seleccionarDocumento(doc)}>
                        {doc.nombre}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default ListaDocumentos;
