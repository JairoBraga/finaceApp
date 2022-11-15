package com.myFinanceApp.financeApp.service;

import com.myFinanceApp.financeApp.domain.Carteira;
import com.myFinanceApp.financeApp.domain.CarteiraDTO;
import com.myFinanceApp.financeApp.repository.CarteiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarteiraServiceImpl implements CarteiraService{
    @Autowired
    private CarteiraRepository carteiraRepository;

    @Override
    public CarteiraDTO buscarCarteira(Long id) {
        //todo: Adicionar tratamento
        Carteira entity = carteiraRepository.findById(id).orElse(new Carteira());
        CarteiraDTO dto = new CarteiraDTO(entity.getId(), entity.getSaldo(), entity.getInvestimento());
        return dto;
    }

    @Override
    public CarteiraDTO criarCarteira() {
        Carteira carteira = carteiraRepository.save(new Carteira(null,0.0,0.0));
        return new CarteiraDTO(carteira.getId(), carteira.getSaldo(), carteira.getInvestimento());
    }
}
