package com.geekster.Expense.Tracker.Api.Repository;

import com.geekster.Expense.Tracker.Api.Model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepo extends JpaRepository<Status,Integer> {
}
