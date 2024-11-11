import React, {useState} from 'react';
import MenuPrincipal from './components/MenuPrincipal';
import ListaDocumentos from './components/ListaDocumentos';
import Documento from './components/Documento';

function App() {
    const [accion, setAccion] = useState('lista');
    const [documentoSeleccionado, setDocumentoSeleccionado] = useState(null);

    const documentos = [
        {nombre: 'Documento 1', contenido: 'Contenido del Documento 1'},
        {nombre: 'Documento 2', contenido: 'Contenido del Documento 2'}
    ];

    const seleccionarAccion = (nuevaAccion) => {
        setAccion(nuevaAccion);
        if (nuevaAccion !== 'ver') {
            setDocumentoSeleccionado(null);
        }
    };

    const seleccionarDocumento = (doc) => {
        setDocumentoSeleccionado(doc);
        setAccion('ver');
    };

    const editarDocumento = (doc) => {
        // Lógica para editar el documento
        alert(`Editando ${doc.nombre}`);
    };

    const eliminarDocumento = (doc) => {
        // Lógica para eliminar el documento
        alert(`Eliminando ${doc.nombre}`);
    };

    return (
        <div>
            <MenuPrincipal seleccionarAcción={seleccionarAccion}/>
            {accion === 'lista' && (
                <ListaDocumentos documentos={documentos} seleccionarDocumento={seleccionarDocumento}/>
            )}
            {accion === 'ver' && documentoSeleccionado && (
                <Documento
                    documento={documentoSeleccionado}
                    editarDocumento={editarDocumento}
                    eliminarDocumento={eliminarDocumento}
                />
            )}
            {accion === 'crear' && <div>Formulario para crear un nuevo documento</div>}
        </div>
    );
}

export default App;
