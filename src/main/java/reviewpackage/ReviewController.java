package reviewpackage;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController extends ReviewRepositoryComponent {
	
	@Resource
	private ReviewRepositoryComponent reviewRep;

	@RequestMapping("/netflixtvshows")
	public String fetchReviews(Model model) {
		model.addAttribute("reviewsAsCollection", reviewRep.findAll());
		return "allshows";
	}
	
	@RequestMapping("/individualshows")
	public String greetAgain(@RequestParam("id") long id, Model model) {
		model.addAttribute("singleReview", reviewRep.findOne(id));
		return "individual";
	}


}


