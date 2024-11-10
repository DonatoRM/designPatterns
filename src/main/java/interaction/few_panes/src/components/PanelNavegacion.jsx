// eslint-disable-next-line react/prop-types
function PanelNavegacion({seleccionarCarpeta}) {
    return (
        <div>
            <button onClick={()=>seleccionarCarpeta('inbox')}>Bandeja de Entrada</button>
            <button onClick={()=>seleccionarCarpeta('sent')}>Enviados</button>
            <button onClick={()=>seleccionarCarpeta('drafts')}>Borradores</button>
        </div>
    );
}
export default PanelNavegacion;