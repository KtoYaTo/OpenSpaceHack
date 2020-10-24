package ru.dwhistle.tracker.backend.db.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import ru.dwhistle.tracker.backend.db.beans.BugReportEntity;

public interface BugReportRepository extends PagingAndSortingRepository<BugReportEntity, Integer> {
}
