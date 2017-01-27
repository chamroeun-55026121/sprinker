package sprinker.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.ResourceBundle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sprinker.model.MetaInfo;
import sprinker.model.ResultModel;

/**
 * @author Peerapat Asoktummarungsri
 */
@RestController
class SystemController implements ModelToJson {

    private final ResourceBundle bundle = ResourceBundle.getBundle("version");

	@RequestMapping(value = "/version/json", method = RequestMethod.GET)
	public String get() throws JsonProcessingException {
		return to(new ResultModel<>(200, "success", 
                new MetaInfo(bundle.getString("version"), bundle.getString("buildtime"))));
	}

}
