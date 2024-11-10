// eslint-disable-next-line react/prop-types
function PanelLecturaYComposicion({correo}) {
    if(!correo) {
        return <div>Selecciona un correo para leer o redactar uno nuevo.</div>;
    }
    return (
        <div>
            {/* eslint-disable-next-line react/prop-types */}
            <h2>{correo.asunto}</h2>
            {/* eslint-disable-next-line react/prop-types */}
            <p>{correo.cuerpo}</p>
        </div>
    );
};
export default PanelLecturaYComposicion;