import br.com.domain.singleexerciciologdeerros.log.Log;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        // Lista de erros
        List<String> erros = new ArrayList<>();

        // Variáveis que retornam string para realizar simulação de erros causados no sistema
        String erroUm = "Erro 1: Cadastro de Cliente: Já existe um produto com o mesmo nome.";
        String erroDois = "Erro 2: Atualização de Produto: O campo não pode ser vazio";
        String erroTres = "Erro 3: Classificação de Nota Fiscal de Saída: A NF venda deve conter o cliente informado.";

        // Logs será utilizada para visualizar todas os erros armazenados.
        Log logs = Log.getLogs();

        // Adicionando o primeiro erro na lista de erros
        erros.add(erroUm);

        // Pegando a única instância já criada para ser manipulada e usada no programa.
        Log primeiroLog = Log.getLogs();

        // Armazenando os erros no log
        primeiroLog.setErros(erros);

        // Imprimindo todos os erros que se encontram no nosso log
        System.out.println("Teste de armazenamento de erros no log: " + logs.getErros() + "\n");


        erros.add(erroDois);
        Log segundoLog = Log.getLogs();
        segundoLog.setErros(erros);

        erros.add(erroTres);
        Log terceiroLog = Log.getLogs();
        terceiroLog.setErros(erros);

        System.out.println(logs.getErros() + "\n");

        // Primeira comparação de objetos
        if (logs.equals(primeiroLog)) {
            System.out.println("É o mesmo objeto\n");
        }

        //Segunda comparação de objetos
        System.out.println("Primeiro Log" + primeiroLog);
        System.out.println("Segundo Log" + segundoLog);
        System.out.println("Terceiro Log" + terceiroLog);
        System.out.println("Logs" + logs);

    }
}
