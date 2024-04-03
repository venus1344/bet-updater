package org.rdxi.betupdater.booker.Odds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OddService {

    @Autowired
    private OddRepo oddRepo;

    public Odd insertOdds(String odds) {
        Odd odd = oddRepo.insert(new Odd());
        return oddRepo.insert(odd);
    }
}
