package MyAccountBook.model.dto;

import MyAccountBook.model.entity.AccountEntity;
import MyAccountBook.model.entity.BaseTime;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor@NoArgsConstructor
@Setter@Getter@ToString@Builder
public class AccountDto  {
    private int ano;
    private String name;
    private int price;
    private LocalDateTime cdate;//생성날짜
    private LocalDateTime udate;//수정날짜

    public AccountEntity toEntity(){
        return AccountEntity.builder()
                .ano(this.ano)
                .name(this.name)
                .price(this.price)
                .build();
    }
}
