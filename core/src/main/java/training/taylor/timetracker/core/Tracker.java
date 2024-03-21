package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;
import training.taylor.timetracker.core.dao.TimeEntryRepository;

import java.util.List;

@Component
public class Tracker {

    private final TimeEntryRepository timeEntryRepository;

    @Autowired
    public Tracker(TimeEntryRepository timeEntryRepository) {
        this.timeEntryRepository = timeEntryRepository;
    }

    public void add(TimeEntry entry) {
        timeEntryRepository.save(entry);
    }

    public void remove(TimeEntry entry) {
        if (entries.contains(entry)) {
            entries.remove(entry);
        }
    }

    public int size() {
        return entries.size();
    }

    public TimeEntry get(int index) {
        return entries.get(index);
    }
}
