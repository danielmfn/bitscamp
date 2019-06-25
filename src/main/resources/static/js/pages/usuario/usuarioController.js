// FUNÇÃO QUE ORDENA POR GRUPO TABELA DE USUÁRIO
$('#usuarioRows tbody').on( 'click', 'tr.group', function () {
    var currentOrder = table.order()[0];
    if ( currentOrder[0] === groupColumn && currentOrder[1] === 'asc' ) {
        table.order( [ groupColumn, 'desc' ] ).draw();
    }
    else {
        table.order( [ groupColumn, 'asc' ] ).draw();
    }
} );

$("#buscarUsuario").on('click', function() {
    let emailUsuario = $("#emailUsuario").val();
    if (emailUsuario != "") {
        $("#usuarioResult").html('');
        listarUsuario(emailUsuario);
    }
});

$("#buscarUsuariosAll").on('click', function() {
    buscarUsuariosAll();
});

$("#removerUsuario").on('click', function() {
    let idUsuarioDelete = $("#idUsuarioDelete").val();
    if (idUsuarioDelete != ""){
        $("#idUsuarioDelete").html('');
        deletarUsuario(idUsuarioDelete);
    }
});

$("#listUsuarioAlt").on('click', function() {
    let idUsuarioAlter = $("#idUsuarioAlt").val();
    if (idUsuarioAlter != ""){
        alterarUsuario(idUsuarioAlter);
        // $("#idUsuarioAlt").html('');
    }

});