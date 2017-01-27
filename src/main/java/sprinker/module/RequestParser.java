package sprinker.module;

import javax.servlet.http.HttpServletRequest;
import lombok.val;

/**
 * @author Peerapat Asoktummarungsri
 */
public interface RequestParser {

	default TerminalInfo toTermianlInfo(final HttpServletRequest request) {
		val serialno = request.getHeader("serialno");
		val firmware = request.getHeader("firmware");
		
		return new TerminalInfo(serialno != null ? serialno : "N/A",
								firmware != null ? firmware : "N/A");
	}

}
