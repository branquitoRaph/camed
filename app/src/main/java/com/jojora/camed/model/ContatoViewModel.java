package com.jojora.camed.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ContatoViewModel extends AndroidViewModel {

    public ContatoViewModel(@NonNull Application application) {
        super(application);
    }

    /**
     * Método que cria e executa uma requisição ao servidor web para adicionar um novo usuário
     * na base de dados do servidor
     * @param newDescriCategoria descrição de categorias
     * @param newDescriMensagem descrição de mensagem
     * @param newContatoEmail email da mensagem
     * @return um LiveData que vai conter a resposta do servidor quando esta estiver disponível
     */
    public LiveData<Boolean> contato(String newDescriCategoria, String newContatoEmail, String newDescriMensagem) {

        // Cria um container do tipo MutableLiveData (um LiveData que pode ter seu conteúdo alterado).
        MutableLiveData<Boolean> result = new MutableLiveData<>();

        // Cria uma nova linha de execução (thread). O android obriga que chamadas de rede sejam feitas
        // em uma linha de execução separada da principal.
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Executa a nova linha de execução. Dentro dessa linha, iremos realizar as requisições ao
        // servidor web.
        executorService.execute(new Runnable() {

            /**
             * Tudo o que colocármos dentro da função run abaixo será executada dentro da nova linha
             * de execução.
             */
            @Override
            public void run() {

                // Criamos uma instância de ProductsRepository. É dentro dessa classe que estão os
                // métodos que se comunicam com o servidor web.
                CamedRepositorio camedRepositorio = new CamedRepositorio(getApplication());

                // O método login envia os dados de novo usuário ao servidor. Ele retorna
                // um booleano indicando true caso o cadastro de novo usuário tenha sido feito com sucesso e false
                // em caso contrário
                boolean b = camedRepositorio.contato(newDescriCategoria, newContatoEmail, newDescriMensagem);

                // Aqui postamos o resultado da operação dentro do LiveData. Quando fazemos isso,
                // quem estiver observando o LiveData será avisado de que o resultado está disponível.
                result.postValue(b);
            }
        });

        return result;
    }
}
