package utilities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import lombok.val;

/**
 * @author Peerapat Asoktummarungsri
 */
public class MapperCreator {
    
    public static ObjectMapper create() {
        val mapper = new ObjectMapper();
		//mapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		mapper.registerModule(new JodaModule());

        return mapper;
    }
}
