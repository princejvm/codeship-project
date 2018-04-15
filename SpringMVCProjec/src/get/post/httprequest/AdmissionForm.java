package get.post.httprequest;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdmissionForm {
	@RequestMapping(value = "/form.html", method = RequestMethod.GET)
	public ModelAndView getForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	@RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
	public ModelAndView putForm(@RequestParam Map<String,String> reqData) {
		    System.out.println("andar");
		    String name = reqData.get("studentName");
		    String address = reqData.get("studentAddress");
			ModelAndView model = new ModelAndView("AdmSuccess");
			String msg = "Details submitted by you are: Name = "+name+" Address = "+address;
			model.addObject("msg",msg);
			return model;
			
	}
/*  @RequestMapping(value = "/submitForm", method = RequestMethod.POST)
	public ModelAndView putForm(@RequestParam(value = "studentName", defaultValue = "ABC") String name, @RequestParam("studentAddress") String address) {
			ModelAndView model = new ModelAndView("AdmSuccess");
			String msg = "Details submitted by you are: Name = "+name+" Address = "+address;
			model.addObject("msg",msg);
			return model;
			
	}
	*/	
}
