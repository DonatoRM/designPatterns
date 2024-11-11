import React from 'react';

const MenuPrincipal = ({ seleccionarAccion: seleccionarAccion }) => {
    return (
        <div>
            <button onClick={() => seleccionarAccion('crear')}>Crear Documento</button>
            <button onClick={() => seleccionarAccion('lista')}>Lista de Documentos</button>
        </div>
    );
};

export default MenuPrincipal;
