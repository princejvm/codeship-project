package hellocontroller;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*public class HelloController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage","Hi! This is the first MVC Project");
		
		return modelAndView;
	}
}*/
/*In RequestMapping annotation string--"/apple/{a}" we can 
 * substitute value of a with any string
 */
/*PathVariable annotation is the one needed to bind the value with string 
 * as here binding between username and name
 */
@Controller
public class HelloController {
	@RequestMapping("/welcome/{countryname}/{username}")
	public ModelAndView fun(@PathVariable Map<String,String> path) {
		String name = path.get("username");
		String country = path.get("countryname");
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hello "+name+",you are from "+country);
		return model;
	}
	/*
	 *  @RequestMapping("/welcome/{countryname}/{username}")
	    public ModelAndView fun(@PathVariable("username") String name,@PathVariable("countryname") String country) {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "This is first spring MVC project"+"\n"+ "hello "+name);
		return model;
	}
	 */
}
