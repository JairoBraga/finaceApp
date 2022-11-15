package com.myFinanceApp.financeApp.service;

import com.myFinanceApp.financeApp.domain.CarteiraDTO;

public interface CarteiraService {
    CarteiraDTO buscarCarteira(Long id);
    CarteiraDTO criarCarteira();
}
