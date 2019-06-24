//CRIAR TABELA DE USUARIO
function criarTabelaUsuarios(usuario) {
    let table = `
    <div class="row">
        <div class="col-md-12">
            <div class="p-r-15">
                <table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="tabelaUsuario" width="100%">
                    <thead>
                        <tr>
                            <th>CÓDIGO</th>
                            <th>NOME</th>
                            <th>E-MAIL</th>
                            <th>FUNÇÃO</th>
                        </tr>
                        </thead>
                        <tbody id="usuarioRows">
                        </tbody>
                </table>
            </div>
        </div>
    </div>
    `;
    $("#usuarioResult").html(table);

    for (let i in usuario){
        $("#usuarioRows").append(
        `<tr>
            <td>${usuario[i].id}</td>
            <td>${usuario[i].nome}</td>
            <td>${usuario[i].email}</td>
            <td>${usuario[i].categoriaUsuario.categoriaUsuario}</td>
        </tr>`
        );
    }
    
}

//CRIAR TABELA DE USUARIOS
function criarTabelaUsuario(usuario) {
    let table = `
    <div class="row">
        <div class="col-md-12">
            <div class="p-r-15">
                <table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="tabelaUsuario" width="100%">
                    <thead>
                        <tr>
                            <th>CÓDIGO</th>
                            <th>NOME</th>
                            <th>E-MAIL</th>
                            <th>FUNÇÃO</th>
                        </tr>
                        </thead>
                        <tbody id="usuarioRows">
                        ${
                        `<tr>
                            <td>${usuario.id}</td>
                            <td>${usuario.nome}</td>
                            <td>${usuario.email}</td>
                            <td>${usuario.categoriaUsuario.categoriaUsuario}</td>
                        </tr>`
                        }
                        </tbody>
                </table>
            </div>
        </div>
    </div>
    `;
    $("#usuarioResult").html(table);
    
}