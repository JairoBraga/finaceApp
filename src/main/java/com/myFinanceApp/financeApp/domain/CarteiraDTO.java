package com.myFinanceApp.financeApp.domain;

public class CarteiraDTO {
    private Long id;
    private Double saldo;
    private Double investimento;

    public CarteiraDTO() {
    }

    public CarteiraDTO(Long id, Double saldo, Double investimento) {
        this.id = id;
        this.saldo = saldo;
        this.investimento = investimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(Double investimento) {
        this.investimento = investimento;
    }
}
