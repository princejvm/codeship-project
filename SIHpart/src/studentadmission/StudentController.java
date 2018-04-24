package studentadmission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class StudentController {

   @RequestMapping(value = "/student", method = RequestMethod.GET)
   public ModelAndView student() {
	  ModelAndView model = new ModelAndView();
	  model.addObject("command",new Student());
	  /*
	   * <!-- "<form:form method="POST" action="/SIHpart/addStudent" commandName="user">" -->
         <!-- now while adding object in StudentController class GET request, -->
         <!-- we should use this name "user" ("command" is byDefault) as the key name in model for student object -->
	   */
      return model;
   }
   
   /*@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb")Student student, 
   ModelMap model) {
      model.addAttribute("name", student.getName());
      model.addAttribute("age", student.getAge());
      model.addAttribute("id", student.getId());
      
      return "result";
   }*/
   
   /*@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public ModelAndView addStudent(@ModelAttribute("comment")Student student) {
      ModelAndView model = new ModelAndView("result");
      
      return model;
   }*/
   
   
   //if @RequestParam(String a) Object a ---> Object a does the same work;
   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public ModelAndView addStudent(Student student1) {
      ModelAndView model = new ModelAndView("result");
      model.addObject("comment",student1);
      
      return model;
   }
   
   /*@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public ModelAndView addStudent(@RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("id") int id) {
      ModelAndView model = new ModelAndView("result");
      System.out.println(name);
      model.addObject("name",name);
      model.addObject("age",age);
      model.addObject("id",id);
      return model;
   }*/
}