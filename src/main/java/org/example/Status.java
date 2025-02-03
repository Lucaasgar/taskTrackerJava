package org.example;

public enum Status {
    TODO("ToDo"),
    IN_PROGRESS("In progress"),
    DONE("Done");

    private final String valor;

    Status(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Status{" +
                "valor='" + valor + '\'' +
                '}';
    }
}
