package objectdatapassing.modelattribute;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionForm {
	@RequestMapping(value = "/form.html", method = RequestMethod.GET)
	public ModelAndView getForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}

	@RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
	public ModelAndView putForm(@RequestParam Map<String, String> reqData) {
		Student student1 = new Student();
		String name = reqData.get("studentName");
		String address = reqData.get("studentAddress");
		student1.setName(name);
		student1.setAddress(address);
		ModelAndView model = new ModelAndView("AdmSuccess");
		String msg = "Dr. B.R.Ambedkar National Institute of Technology, Jalandhar";
		model.addObject("msg", msg);
		model.addObject("student", student1);
		return model;

	}
}