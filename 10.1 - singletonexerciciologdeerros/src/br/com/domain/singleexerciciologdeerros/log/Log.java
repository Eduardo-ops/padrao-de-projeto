package br.com.domain.singleexerciciologdeerros.log;

import java.util.ArrayList;
import java.util.List;

public class Log {

    private static Log log = null;
    private List<String> erros = new ArrayList<>();

    private Log() {

    }

    public static Log getLogs() {
        if (log == null) {
            log = new Log();
        }
        return log;
    }

    public static void setLog(Log log) {
        Log.log = log;
    }

    public List<String> getErros() {
        return erros;
    }

    public void setErros(List<String> erros) {
        this.erros = erros;
    }

    public static Log getLog() {
        return log;
    }
}
