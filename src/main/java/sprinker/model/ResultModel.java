package sprinker.model;

import lombok.AllArgsConstructor;

/**
 * @author Peerapat Asoktummarungsri
 */
@AllArgsConstructor
public class ResultModel<T> {
	
	public final Integer status;
	
	public final String message;
	
	public final T result;
	
	public ResultModel(final Integer status, final String message) {
		this(status, message, null);
	}
	
}
