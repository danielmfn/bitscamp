//CRIAR TABELA DE USUARIOS
function criarTabelaUsuario(usuario) {
    
    const json_data = usuario;
    const user = Object.keys(json_data).map((key) => [key, json_data[key]]);

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
                        <tbody>
                            `
                            for (let i in user){
                                `<tr>
                                    <td>${user[i].id}</td>
                                    <td>${user[i].nome}</td>
                                    <td>${user[i].email}</td>
                                    <td>${user[i].categoriaUsuario}</td>
                                </tr>`
                            }
                            `
                        </tbody>
                </table>
            </div>
        </div>
    </div>
    `;

    $("#usuarioResult").html(table);
}