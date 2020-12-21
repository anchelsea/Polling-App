package com.example.polls.repository;

import com.example.polls.model.Poll;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PollRepository extends JpaRepository<Poll,Long> {
    Optional<Poll> findbyId(Long pollID);
    Page<Poll> finByCreatedBy(Long userId, Pageable pageale);

    long contByCreatedBy(Long userId);
    List<Poll> findByIdIn(List<Long> pollIds);
    List<Poll> findByIdIn(List<Long> pollIds, Sort sort);
}
