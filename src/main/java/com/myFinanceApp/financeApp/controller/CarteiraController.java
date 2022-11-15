package com.myFinanceApp.financeApp.controller;

import com.myFinanceApp.financeApp.domain.CarteiraDTO;
import com.myFinanceApp.financeApp.service.CarteiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/carteira")
public class CarteiraController {

    @Autowired
    private CarteiraService carteiraService;

    @GetMapping
    public CarteiraDTO buscarCarteira(@RequestParam Long id){

        return carteiraService.buscarCarteira(id);
    }

    @PostMapping
    public CarteiraDTO novaCarteira(){
       return carteiraService.criarCarteira();
    }

}
