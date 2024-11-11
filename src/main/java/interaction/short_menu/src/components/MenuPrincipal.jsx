import React from 'react';

const MenuPrincipal = ({ seleccionarOpcion }) => {
    return (
        <div>
            <button onClick={() => seleccionarOpcion('verSaldo')}>Ver Saldo</button>
            <button onClick={() => seleccionarOpcion('transferirDinero')}>Transferir Dinero</button>
            <button onClick={() => seleccionarOpcion('pagarFacturas')}>Pagar Facturas</button>
            <button onClick={() => seleccionarOpcion('configuración')}>Configuración</button>
        </div>
    );
};

export default MenuPrincipal;
