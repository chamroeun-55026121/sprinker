package sprinker.module;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Peerapat Asoktummarungsri
 */
public class PageCriteria {

	public final int limit;
	
	public final int offset;

	@JsonCreator
	public PageCriteria(final @JsonProperty("limit") int limit
						, final @JsonProperty("offset") int offset) {
		this.limit = limit;
		this.offset = offset;
	}

}
