package org.rdxi.betupdater.booker.Leagues;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeagueService {
    @Autowired
    private LeagueRepo leagueRepo;

    public List<League> getLeagues() {
        return leagueRepo.findAll();
    }

    public Optional<League> findLeague(String league) {
        return leagueRepo.findByTitle(league);
    }
}
