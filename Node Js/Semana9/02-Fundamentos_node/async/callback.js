function hola(nombre, miCallback){
    setTimeout( function () {
        console.log('Hola '+nombre);
        miCallback(nombre);
    }, 1000);
}

