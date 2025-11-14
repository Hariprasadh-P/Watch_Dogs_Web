package com.WatchDogs.Backend.Repository;

import com.WatchDogs.Backend.Model.CreditCardInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WatchRepo extends JpaRepository<CreditCardInfo, Long> {
}
