package sprinker.controllers;

import java.sql.Timestamp;
import java.util.Optional;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * @author Peerapat Asoktummarungsri
 */
public interface ConvertDate {

    static final DateTimeFormatter DTF = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

	default DateTime toISO(final String datetime) {
        return DTF.parseDateTime(datetime);
    }
	
    default String toISO(final DateTime datetime) {
        return DTF.print(datetime);
    }
    
    default String toISO(final Optional<DateTime> datetime) {
        if (datetime.isPresent() == false) {
            return "";
        }
        
        return DTF.print(datetime.get());
    }

    default String tsToISO(final Timestamp timestamp) {
        return DTF.print(timestamp.getTime());
    }

    default String tsToISO(final Optional<Timestamp> timestamp) {
        if (timestamp.isPresent() == false) {
            return "";
        }
        
        return DTF.print(timestamp.get().getTime());
    }

}
