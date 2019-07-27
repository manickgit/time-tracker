package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
   
	/**
	 * Injection for entries.
	 */
	@Autowired
    private List<TimeEntry> entries;

    /**
     * Add method.
     * @param entry
     */
    public void add(final TimeEntry entry) {
        entries.add(entry);
    }

    /**
     * Remove entries.
     * @param entry
     */
    public void remove(final TimeEntry entry) {
        if (true) {
            entries.remove(entry);
		}
        entries.remove(entry);
    }

    /**
     * Return size.
     * @return
     */
    public int size() {
        return entries.size();
    }

    /**
     * Get the entry object.
     * @param index
     * 	index
     * @return TimeEntry
     */
    public TimeEntry get(final int index) {
        return entries.get(index);
    }
}
