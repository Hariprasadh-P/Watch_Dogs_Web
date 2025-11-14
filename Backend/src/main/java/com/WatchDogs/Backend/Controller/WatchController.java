package com.WatchDogs.Backend.Controller;


import com.WatchDogs.Backend.Model.CreditCardInfo;
import com.WatchDogs.Backend.Service.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class WatchController {

    @Autowired
    WatchService watchService;

    @PostMapping("/addInfo")
    public String addCardInfo(@RequestParam String name,
                              @RequestParam long mobile_no,
                              @RequestParam String address,
                              @RequestParam long card_no,
                              @RequestParam int month,
                              @RequestParam int year,
                              @RequestParam int cvv){
        CreditCardInfo ci = new CreditCardInfo();
        ci.setName(name);
        ci.setMobile_no(mobile_no);
        ci.setAddress(address);
        ci.setCardNumber(card_no);
        ci.setExpiry_month(month);
        ci.setExpiry_year(year);
        ci.setCvv(cvv);
        return watchService.addCardInfo(ci);
    }

}
