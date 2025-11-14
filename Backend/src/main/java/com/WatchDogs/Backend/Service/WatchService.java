package com.WatchDogs.Backend.Service;

import com.WatchDogs.Backend.Model.CreditCardInfo;
import com.WatchDogs.Backend.Repository.WatchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WatchService {

    @Autowired
    WatchRepo watchRepo;

    public String addCardInfo(CreditCardInfo ci){
        watchRepo.save(ci);
        return "Added Successfully";
    }

}
