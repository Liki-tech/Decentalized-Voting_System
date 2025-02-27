package com.example.voting.service;

import com.example.voting.model.Vote;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

    public Vote castVote(Vote vote) {
        // Logic to save the vote (e.g., save to database)
        // For now, just return the vote object
        return vote;
    }
}
