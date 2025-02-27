package com.example.voting.controller;

import com.example.voting.model.Vote;
import com.example.voting.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/votes")
public class VoteController {

    @Autowired
    private VoteService voteService;

    @PostMapping
    public ResponseEntity<Vote> castVote(@RequestBody Vote vote) {
        Vote savedVote = voteService.castVote(vote);
        return ResponseEntity.ok(savedVote);
    }
}
