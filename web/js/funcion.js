$(document).ready(function () {

    listarSucursales();
    listarClientes4();
    listarProductos();

});

let xx;
let a;
let precio;


function listarSucursales() {
    $.get("SucursalesController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
 
        for (let i = 0; i < x.length; i++) {

        
            $("#sucursal").append($("<option>", {
                value: x[i],
                text: x[i].direccion

            })
                    );
        }

    });

}

function listarClientes4() {
    $.get("ClientesController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
       
        for (let i = 0; i < x.length; i++) {


            $("#cliente").append($("<option>", {
                value: x[i].idcliente,
                text: x[i].nombre

            })
                    );
        }

    });

}


function listarClientes() {

    $('#cliente option').remove();
    $.get('ClientesController', {opc: 1}, (data) => {
        let x = JSON.parse(data);

        $('#cliente').append(`  <option value="o" disabled selected>Seleccionar Cliente: </option>`);

        x.forEach(
                (nombre) => {

            $('#cliente').append(`<option value="${nombre.cliente}">${nombre.nombres}</option>`);
        }
        );

    });

}

function listarProductos() {

    $.get("ProductosController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        precio = x;
        
        for (let i = 0; i < x.length; i++) {

            $("#productos").append($("<option>", {
                value: x[i].idproducto,
                text: x[i].nombre

            })
          );
        }

    });

}



