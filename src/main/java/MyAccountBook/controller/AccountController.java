package MyAccountBook.controller;

import MyAccountBook.model.dto.AccountDto;
import MyAccountBook.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;


    @PostMapping("")
    public boolean write(@RequestBody AccountDto accountDto){
        System.out.println("AccountController.write");
        return accountService.write(accountDto);
    }

    @GetMapping("")
    public List<AccountDto> read(){
        System.out.println("AccountController.read");
        return accountService.read();
    }

    @PutMapping("")
    public boolean update(@RequestBody AccountDto accountDto){
        System.out.println("AccountController.update");
        return accountService.update(accountDto);
    }

    @DeleteMapping("")
    public boolean delete(@RequestParam int ano){
        System.out.println("AccountController.delete");
        return accountService.delete(ano);
    }

    @GetMapping("/index")
    public Resource getIndex(){
        return new ClassPathResource("templates/account.html");
    }
}
