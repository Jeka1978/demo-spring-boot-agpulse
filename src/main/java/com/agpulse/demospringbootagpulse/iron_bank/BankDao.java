package com.agpulse.demospringbootagpulse.iron_bank;

import com.agpulse.demospringbootagpulse.iron_bank.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface BankDao extends JpaRepository<Bank,Integer> {

}
