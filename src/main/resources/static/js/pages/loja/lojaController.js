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