package MyAccountBook.service;

import MyAccountBook.model.dto.AccountDto;
import MyAccountBook.model.entity.AccountEntity;
import MyAccountBook.model.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public boolean write(AccountDto accountDto){
        System.out.println("AccountService.write");
        AccountEntity entity= accountRepository.save(accountDto.toEntity());
        if(entity.getAno()>=1){return true;}
        return false;
    }

    public List<AccountDto> read(){
        System.out.println("AccountService.read");
        List<AccountEntity> accountEntities = accountRepository.findAll();
        List<AccountDto> dtoList= new ArrayList<>();
        accountEntities.forEach(e->{
            dtoList.add(e.toDto());
        });
        return dtoList;
    }

    public boolean update( AccountDto accountDto){
        System.out.println("AccountService.update");
        Optional <AccountEntity> optionalAccountEntity= accountRepository.findById(accountDto.getAno());
        if(optionalAccountEntity.isPresent()){
            AccountEntity accountEntity=optionalAccountEntity.get();
            accountEntity.setName(accountDto.getName());
            accountEntity.setPrice(accountDto.getPrice());

        }
        return true;
    }


    public boolean delete(int ano){
        System.out.println("AccountService.delete");
        Optional<AccountEntity> entites= accountRepository.findById(ano);
        if(entites.isPresent()){
            accountRepository.deleteById(ano);
            return true;
        }
       return false;
    }



}
