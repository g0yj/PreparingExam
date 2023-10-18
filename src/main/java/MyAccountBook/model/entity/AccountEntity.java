package MyAccountBook.model.entity;

import MyAccountBook.model.dto.AccountDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "account")
@AllArgsConstructor@NoArgsConstructor
@Setter@Getter@ToString@Builder
public class AccountEntity extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ano;
    private String name;
    private int price;

  public AccountDto toDto(){
      return AccountDto.builder()
              .ano(this.ano)
              .name(this.name)
              .price(this.price)
              .cdate(this.getCdate())
              .udate(this.getUdate())
              .build();
  }

}
