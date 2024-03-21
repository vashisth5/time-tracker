import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;
import training.taylor.timetracker.core.dao.TimeEntryRepository;

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
        // Implement removal logic using timeEntryRepository if needed
    }

    public int size() {
        // Implement size logic using timeEntryRepository if needed
        return 0; // Placeholder value
    }

    public TimeEntry get(int index) {
        // Implement get logic using timeEntryRepository if needed
        return null; // Placeholder value
    }
}

