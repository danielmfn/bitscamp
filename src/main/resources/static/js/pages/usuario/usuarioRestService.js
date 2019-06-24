//FUNÇÃO PARA BUSCAR USUARIO POR ID
function listarUsuario(emailUsuario){
    $.ajax({
        type : 'GET',
        url : '/usuario/'+emailUsuario,
        success : function (result) {
            criarTabelaUsuario(result);
        },
        error: function (error) {
            console.log(error);
        }
    });
}

function buscarUsuariosAll(){
    $.ajax({
        type : 'GET',
        url : '/usuario',
        success : function (result) {
            criarTabelaUsuario(result);
        },
        error: function (error) {
            console.log(error);
        }
    });
}