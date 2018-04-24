package studentadmission;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdmissionForm {
	private CountryValidator cv;
    private NameValidator nv;
	/*WebDataBinder extends DataBinder.

      It can be used to register custom formatter, validators and PropertyEditors.

      WebDataBinder.addCustomFormatter(..);
      WebDataBinder.addValidators(..);
      WebDataBinder.registerCustomEditor(..);*/
	
	/*The @InitBinder annotated methods will get called on each HTTP request if we don't specify the 
	 *'value' element of this annotation.

      Each time this method is called a new instance of WebDataBinder is passed to it.

      To be more specific about which objects our InitBinder method applies to,
      we can supply 'value' element of the annotation @InitBinder. The 'value' element is a single or multiple names 
      of command/form attributes and/or request parameters that this init-binder method is supposed to apply to.
      Sample Code-->
      /*@InitBinder("user")
        public void customizeBinding (WebDataBinder binder) {...}*//*
    */
	//return type should always be void and one argument should webdatabinder object
    @InitBinder
    public void initBinder(WebDataBinder binder) {
    	binder.addValidators(cv,nv);
    	binder.setDisallowedFields(new String[] {"stduentMobile"});
    	SimpleDateFormat date = new SimpleDateFormat("yyyy--mm--dd");
    	binder.registerCustomEditor(Date.class,"studentDOB",new CustomDateEditor(date,false));
    	binder.registerCustomEditor(String.class,"studentName",new StudentNameEditor());
    	
    }
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws Exception {
		String e = "a";
		if(e.equalsIgnoreCase("NULL")) {
			throw new NullPointerException("Null Pointer");
		}else if(e.equalsIgnoreCase("IO")) {
			throw new IOException("io");
		}else if(e.equalsIgnoreCase("A")) {
			throw new ArithmeticException("a");
		}

		ModelAndView model1 = new ModelAndView("AdmForm");
		System.out.println("entered");
		return model1;
	}

	@ModelAttribute
    public void addingCommonObjects(Model model1) {
		
		model1.addAttribute("headerMessage", "Dr. B. R. Ambedkar National Institute of Technology, Jalandhar, India");
	}

	/*@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Studnt student, @RequestParam("extra") String e) {
		

		ModelAndView model1 = new ModelAndView("AdmSuccess");
		model1.addObject("e",e);
		//System.out.println(student.getStudentAddress());
		//System.out.println(student.getStudentName());
		//System.out.println(student.getStudentHobby());
		return model1;
	}*/
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Studnt student,BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("hello");
			ModelAndView model = new ModelAndView("AdmForm");
			return model;
		}
		ModelAndView model1 = new ModelAndView("AdmSuccess");
		return model1;
	}
	
}

