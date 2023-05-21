package com.geekster.Expense.Tracker.Api.Repository;

import com.geekster.Expense.Tracker.Api.Model.Expense;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepo extends JpaRepository<Expense,Integer> {
    @Query(value = "select * from expense where user_id= :userId and status_id=1 order by create_date",nativeQuery = true)
    List<Expense> findExpenseByUserId(int userId);

    @Query(value = "select SUM(price) from expense where user_id= :userId and status_id=1",nativeQuery = true)
    long getAllExpenditure(int userId);

    @Modifying
    @Transactional
    @Query(value = "update expense set status_id=2 where expense_id= :expenseId",
            countQuery="select count(*) from user",nativeQuery = true)
    void deleteByPostId(int expenseId);
}
