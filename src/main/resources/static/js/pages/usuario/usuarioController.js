$("#buscarUsuario").on('click', function() {
    let emailUsuario = $('#emailUsuario').val();
    if (emailUsuario != "") {
        $("#usuarioResult").html('');
        listarUsuario(emailUsuario);
    }
});

$("#buscarUsuariosAll").on('click', function() {
    $("#usuarioResult").html('');
    buscarUsuariosAll();
});