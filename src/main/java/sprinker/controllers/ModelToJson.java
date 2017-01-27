package sprinker.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sprinker.model.ResultModel;
import utilities.MapperCreator;

/**
 * @author Peerapat Asoktummarungsri
 */
public interface ModelToJson {

	static final Logger LOG = LoggerFactory.getLogger(ModelToJson.class);
	
    static final ObjectMapper MAPPER = MapperCreator.create();
            
    default String to(final ResultModel<?> model) {
        try {
            return MAPPER.writeValueAsString(model);
        } catch (final JsonProcessingException e) {
			LOG.warn(e.getMessage(), e);
            return e.getMessage();
        }
    }
	
}
