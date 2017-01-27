package utilities;

import java.sql.Timestamp;
import org.joda.time.DateTime;

/**
 * @author Peerapat Asoktummarungsri
 */
public interface TimestampToJoda {

	default DateTime toJoda(final Timestamp ts) {
		return new DateTime(ts.getTime());
    }

}
