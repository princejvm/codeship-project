package com.gontuseries.hellocontroller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*If more than one RequestMapping methods reside under a Controller class,
 * then it is called MultiAction Controller Class. 
 */
/*
 * If the call is like "localhost:8098/SpringMVCProjec/abcd"
 * then output comes--> "requested resource not available"
 */
/*RequestMapping annotation works as Handler Mapping and does the work of scanning 
 * the input url and mapping it to exact data generator guy or controller 
 */
/*Controller class does the business logic and database query to fetch data 
 * and generate output data to be displayed or sent to browser and sends it to view resolver
 */
/*View Resolver completes the address of the view part which is the generated output
 * + HTML part to be displayed by getting address as prefix+view name(as returned by controller)
 * +suffix
 * 
 */
/*name of ModelAndView is the view name returned by controller
 * and it should match with the output file generated to be used and the attribute name of
 * the object passed to it works as the argument passed to output file
 * and it's value fetched as ${argument name}
 */
@Controller
@RequestMapping("/greet")
public class HelloController {
	@RequestMapping("/welcome/firstpage")
	public ModelAndView fun() {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "This is first spring MVC project");
		return model;
	}
	@RequestMapping("/contact")
	public ModelAndView contact() {
		return new ModelAndView("HelloPage","msg","email-id-->  princekumarjvmnitj@gmail.com");
	}
}
