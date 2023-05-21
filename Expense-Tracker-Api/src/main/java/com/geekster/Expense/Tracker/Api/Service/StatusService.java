package com.geekster.Expense.Tracker.Api.Service;

import com.geekster.Expense.Tracker.Api.Model.Status;
import com.geekster.Expense.Tracker.Api.Repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {
    @Autowired
    StatusRepo statusRepo;
    public int saveStatus(Status statusObj) {
        Status status=statusRepo.save(statusObj);
        return status.getStatusId();
    }
}
