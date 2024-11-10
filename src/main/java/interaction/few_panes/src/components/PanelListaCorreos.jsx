
// eslint-disable-next-line react/prop-types
function PanelListaCorreos({correos,seleccionarCorreo}) {
    return (
        <ul>
            {/* eslint-disable-next-line react/prop-types */}
            {correos.map(correo=>(
                <li key={correo.id} onClick={()=>seleccionarCorreo(correo)}>
                {correo.asunto}
                </li>
            ))}
        </ul>
    );
};
export default PanelListaCorreos