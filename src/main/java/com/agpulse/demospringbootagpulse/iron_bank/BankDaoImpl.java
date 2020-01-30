//package com.agpulse.demospringbootagpulse.iron_bank;
//
//import com.agpulse.demospringbootagpulse.iron_bank.model.Bank;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import java.util.List;
//
///**
// * @author Evgeny Borisov
// */
//@Repository
//@Transactional
//public class BankDaoImpl implements BankDao {
//
//    @Autowired
//    private EntityManager entityManager;
//
//
//    @Override
//    public List<Bank> findAll() {
////
////       List<Bank> banks = entityManager.createQuery("from Bank where name=:name")
////                .setParameter("name","iron bank")
////                .setMaxResults(20)
////                .setFirstResult(61)
////                .getResultList();
////
////
////        for (Bank bank : banks) {
////            bank.setBalance(100);
////        }
//
//
//        return entityManager.createQuery("from Bank").getResultList();
//    }
//
//    @Override
//    public void save(Bank bank) {
//        entityManager.persist(bank);
//        bank.setBalance(100);
//    }
//}
//
//
//
//
//
//
//
//
