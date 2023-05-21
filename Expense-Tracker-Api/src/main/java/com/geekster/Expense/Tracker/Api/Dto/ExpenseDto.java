package com.geekster.Expense.Tracker.Api.Dto;

import lombok.Data;

@Data
public class ExpenseDto {
    private String title;
    private String description;
    private String price;
    private String userId;
}
