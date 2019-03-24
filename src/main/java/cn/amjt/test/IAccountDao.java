package cn.amjt.test;


import cn.amjt.domain.Account;
import cn.amjt.domain.AccountUser;

import java.util.List;

public interface IAccountDao {
    /*List<AccountUser> findAll();*/
    List<Account> findAll();


    List<Account> findAccountByUid(Integer uid);
}
