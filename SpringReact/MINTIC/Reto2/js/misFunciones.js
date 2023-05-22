function traerInformacionMachine() {
    $.ajax({
        url: "https://g2852af702f0efb-muvaw06cvdsd29a4.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/gym/gym",
        type: "GET",
        datatype: "JSON",
        success: function (respuesta) {
            console.log(respuesta);
            pintarRespuestaMachine(respuesta.items);
        }

    });
}

function pintarRespuestaMachine(items) {

    let myTable = "<table>";
    for (i = 0; i < items.length; i++) {
        myTable += "<tr>";
        myTable += "<td>" + items[i].id + "</td>";
        myTable += "<td>" + items[i].brand + "</td>";
        myTable += "<td>" + items[i].model + "</td>";
        myTable += "<td>" + items[i].category_id + "</td>";
        myTable += "<td>" + items[i].name + "</td>";
        myTable += "<td> <button onclick='borrarElementoMachine(" + items[i].id + ")'>Borrar</button>";
        myTable += "</tr>";
    }
    myTable += "</table>";
    $("#resultado").append(myTable);
}
function guardarInformacionMachine() {
    let myData = {
        id: $("#id").val(),
        brand: $("#brand").val(),
        model: $("#model").val(),
        category_id: $("#category_id").val(),
        name: $("#name").val(),

    };
    let dataToSend = JSON.stringify(myData);
    $.ajax({
        url: "https://g2852af702f0efb-muvaw06cvdsd29a4.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/gym/gym",
        type: "POST",
        data: dataToSend,
        datatype: "JSON",
                    success: function (respuesta) {
            $("#resultado").empty();
            $("#id").val("");
            $("#brand").val("");
            $("#model").val("");
            $("#category_id").val("");
            $("#name").val("");
            traerInformacionMachine();
            alert("se ha guardado el dato")
        }
    });
}

function editarInformacionMachine() {
    let myData = {
        id: $("#id").val(),
        brand: $("#brand").val(),
        model: $("#model").val(),
        category_id: $("#category_id").val(),
        name: $("#name").val(),

    };
    console.log(myData);
    let dataToSend = JSON.stringify(myData);
    $.ajax({
        url: "https://g2852af702f0efb-muvaw06cvdsd29a4.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/gym/gym",
        type: "PUT",
        data: dataToSend,
        contentType: "application/JSON",
        datatype: "JSON",
        success: function (respuesta) {
            $("#resultado").empty();
            $("#id").val("");
            $("#brand").val("");
            $("#model").val("");
            $("#category_id").val("");
            $("#name").val("");
            traerInformacionMachine();
            alert("se ha actualizado")
        }
    });
}
function borrarElementoMachine(idElemento) {
    let myData = {
        id: idElemento
    };

    let dataToSend = JSON.stringify(myData);
    $.ajax({
        url: "https://g2852af702f0efb-muvaw06cvdsd29a4.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/gym/gym",
        type: "DELETE",
        data: dataToSend,
        contentType: "application/JSON",
        datatype: "JSON",
        success: function (respuesta) {
            $("#resultado").empty();
            traerInformacionMachine();
            alert("se ha eliminado")
        }

    });
}


function traerInformacionClient() {
    $.ajax({
        url: "https://g2852af702f0efb-muvaw06cvdsd29a4.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/client/client",
        type: "GET",
        datatype: "JSON",
        success: function (respuesta) {
            console.log(respuesta);
            pintarRespuestaClient(respuesta.items);
        }
    });
}

function pintarRespuestaClient(items) {

    let myTable = "<table>";
    for (i = 0; i < items.length; i++) {
        myTable += "<tr>";
        myTable += "<td>" + items[i].id + "</td>";
        myTable += "<td>" + items[i].name + "</td>";
        myTable += "<td>" + items[i].email + "</td>";
        myTable += "<td>" + items[i].age + "</td>";
        myTable += "<td> <button onclick='borrarElementoClient(" + items[i].id + ")'>Borrar</button>";
        myTable += "</tr>";
    }
    myTable += "</table>";
    $("#resultadoCliente").append(myTable);
}

function guardarInformacionClient() {
    let myDatac = {
        id: $("#idc").val(),
        name: $("#namec").val(),
        email: $("#email").val(),
        age: $("#age").val(),

    };

    let dataToSend = JSON.stringify(myDatac);
    $.ajax({
        url: "https://g2852af702f0efb-muvaw06cvdsd29a4.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/client/client",
        type: "POST",
        data: dataToSend,
        dataType: "text",

        success: function (respuesta) {

            $("#resultadoCliente").empty();
            $("#id").val("");
            $("#name").val("");
            $("#email").val("");
            $("#age").val("");
            traerInformacionClient();
            alert("se ha guardado el dato");
        },
        /*
                error: function (xhr, error) {
                    console.log(error)
                    alert("No se ha guardado nada");
        
                }
        
        */
    });
}



function editarInformacionClient() {
    let myData = {
        id: $("#idc").val(),
        name: $("#namec").val(),
        email: $("#email").val(),
        age: $("#age").val(),

    };
    console.log(myData);
    let dataToSend = JSON.stringify(myData);
    $.ajax({
        url: "https://g2852af702f0efb-muvaw06cvdsd29a4.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/client/client",
        type: "PUT",
        data: dataToSend,
        contentType: "application/JSON",
        datatype: "JSON",

        success: function (respuesta) {
            $("#resultadoCliente").empty();
            $("#idc").val("");
            $("#namec").val("");
            $("#email").val("");
            $("#age").val("");
            traerInformacionClient();
            alert("se ha actualizado")
        }
    });
}

function borrarElementoClient(idElemento) {
    let myData = {
        id: idElemento
    };

    let dataToSend = JSON.stringify(myData);
    $.ajax({
        url: "https://g2852af702f0efb-muvaw06cvdsd29a4.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/client/client",
        type: "DELETE",
        data: dataToSend,
        contentType: "application/JSON",
        datatype: "JSON",
        success: function (respuesta) {
            $("#resultadoCliente").empty();
            traerInformacionClient();
            alert("se ha eliminado")
        }

    });
}

function traerInformacionMessage() {
    $.ajax({
        url: "https://g2852af702f0efb-muvaw06cvdsd29a4.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/message/message",
        type: "GET",
        datatype: "JSON",
        success: function (respuesta) {
            console.log(respuesta);
            pintarRespuestaMessage(respuesta.items);
        }

    });
}

function pintarRespuestaMessage(items) {

    let myTable = "<table>";
    for (i = 0; i < items.length; i++) {
        myTable += "<tr>";
        myTable += "<td>" + items[i].id + "</td>";
        myTable += "<td>" + items[i].messagetext + "</td>";
        myTable += "<td> <button onclick='borrarElementoMessage(" + items[i].id + ")'>Borrar</button>";
        myTable += "</tr>";
    }
    myTable += "</table>";
    $("#resultadoMessage").append(myTable);
}
function guardarInformacionMessage() {
    let myDatam = {
        id: $("#idm").val(),
        messagetext: $("#messagetext").val(),

    };
    let dataToSend = JSON.stringify(myDatam);
    $.ajax({
        url: "https://g2852af702f0efb-muvaw06cvdsd29a4.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/message/message",
        type: "POST",
        data: dataToSend,
        datatype: "JSON",
        success: function (respuesta) {
            $("#resultadoMessage").empty();
            $("#idm").val("");
            $("#messagetext").val("");
            traerInformacionMessage();
            alert("se ha guardado el dato")
        }
    });
}

function editarInformacionMessage() {
    let myData = {
        id: $("#idm").val(),
        messagetext: $("#messagetext").val(),

    };
    console.log(myData);
    let dataToSend = JSON.stringify(myData);
    $.ajax({
        url: "https://g2852af702f0efb-muvaw06cvdsd29a4.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/message/message",
        type: "PUT",
        data: dataToSend,
        contentType: "application/JSON",
        datatype: "JSON",
        success: function (respuesta) {
            $("#resultadoMessage").empty();
            $("#idm").val("");
            $("#messagetext").val("");
            traerInformacionMessage();
            alert("se ha actualizado")
        }
    });
}
function borrarElementoMessage(idElemento) {
    let myData = {
        id: idElemento
    };

    let dataToSend = JSON.stringify(myData);
    $.ajax({
        url: "https://g2852af702f0efb-muvaw06cvdsd29a4.adb.mx-queretaro-1.oraclecloudapps.com/ords/admin/message/message",
        type: "DELETE",
        data: dataToSend,
        contentType: "application/JSON",
        datatype: "JSON",
        success: function (respuesta) {
            $("#resultadoMessage").empty();
            traerInformacionMessage();
            alert("se ha eliminado")
        }

    });
}


