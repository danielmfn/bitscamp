// Função P/ Buscar Usuário Por Id
function listarUsuario(emailUsuario){
    $.ajax({
        method : 'GET',
        url : '/usuario/'+emailUsuario,
        success : function (result) {
            criarTabelaUsuario(result);
        },
        error: function (error) {
            swal("Erro :(", "Não foi possível buscar o usuário: "+emailUsuario, "error");
            console.log(error);
        }
    });
}

// Função P/ Buscar Todos os Usuários
function buscarUsuariosAll(){
    $.ajax({
        method : 'GET',
        url : '/usuario',
        success : function (result) {
            $("#usuarioResult").html('');
            criarTabelaUsuarios(result);
        },
        error: function (error) {
            swal("Erro :(", "Não foi possível buscar os usuário: ", "warning");
            console.log(error);
        }
    });
}

// Função P/ Remover Usuário Por Id
function deletarUsuario(idUsuario) {
    $.ajax({
        method : 'DELETE',
        url : '/usuario/'+idUsuario,
        success : function () {
            swal("Sucesso :)", "Usuário Removido: "+idUsuario, "success");
            buscarUsuariosAll();
        },
        error: function (error) {
            swal("Erro :(", "Não foi possível remover o usuário: "+idUsuario, "error");
            console.log(error);
        }
    });
}

// Função P/ Buscar Usuário P/ Alteração
function listarUsuarioAlteracao(emailUsuario){
    $.ajax({
        method : 'GET',
        url : '/usuario/'+emailUsuario,
        success : function (result) {
            usuarioAlteracaoList(result);
        },
        error: function (error) {
            swal("Erro :(", "Não foi possível buscar o usuário: "+emailUsuario, "error");
            console.log(error);
        }
    });
}

// Função P/ Alterar Usuário Por Id
function alterarUsuario(idUsuarioAlter) {
    $.ajax({
        method : 'GET',
        url : '/usuario/'+idUsuarioAlter,
        success : function (result) {
            usuarioAlteracaoList(result);
        },
        error: function (error) {
            swal("Erro :(", "Não foi possível encontrar o usuário: "+idUsuarioAlter, "error");
            console.log(error);
        }
    });
}