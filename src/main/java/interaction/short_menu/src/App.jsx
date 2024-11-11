import React, { useState } from 'react';
import MenuPrincipal from './components/MenuPrincipal.jsx';
import VerSaldo from './components/VerSaldo';
import TransferirDinero from './components/TransferirDinero';
import PagarFacturas from './components/PagarFacturas';
import Configuracion from './components/Configuracion';

function App() {
    const [opcion, setOpcion] = useState('menu');

    const seleccionarOpcion = (nuevaOpcion) => {
        setOpcion(nuevaOpcion);
    };

    return (
        <div>
            {opcion === 'menu' && <MenuPrincipal seleccionarOpcion={seleccionarOpcion} />}
            {opcion === 'verSaldo' && <VerSaldo />}
            {opcion === 'transferirDinero' && <TransferirDinero />}
            {opcion === 'pagarFacturas' && <PagarFacturas />}
            {opcion === 'configuración' && <Configuracion />}
            <button onClick={() => seleccionarOpcion('menu')}>Volver al Menú Principal</button>
        </div>
    );
}

export default App;
