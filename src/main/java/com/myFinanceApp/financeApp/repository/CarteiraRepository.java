package com.myFinanceApp.financeApp.repository;
import com.myFinanceApp.financeApp.domain.Carteira;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CarteiraRepository extends JpaRepository<Carteira, Long> {
}
