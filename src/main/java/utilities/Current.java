package utilities;

import java.sql.Timestamp;
import org.joda.time.DateTime;

/**
 * @author Peerapat Asoktummarungsri
 */
public interface Current {

	default Timestamp now() {
		return new Timestamp(DateTime.now().getMillis());
    }

}
