package com.WatchDogs.Backend.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCardInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @Column(unique = true, nullable = false)
    private long mobile_no;
    private String address;
    private long cardNumber;
    private int expiry_month;
    private int expiry_year;
    private int cvv;

}
