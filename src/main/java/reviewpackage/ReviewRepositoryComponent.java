package reviewpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class ReviewRepositoryComponent {

	private Map<Long, Review> reviewsMap = new HashMap<>();
	
//	 from VirtualPet example in hello-spring-mvc
	public ReviewRepositoryComponent() {
		Review girlboss = new Review(1L, "Girlboss", "/images/Girlboss.jpg", "DocuDrama", 2017);
		girlboss.setContent("Girlboss is a Netflix Original, loosely based on a true story about "
				+ "strong-willed Sophia who always wants to do things her own way. Her principals won't allow her to bow down "
				+ "to \"the man\", even if that means alsmot being evicted from her apartment. She strikes it rich, when she "
				+ "finds she's really good at selling vintage clothes on eBay. Leading to launching"
				+ "her own e-comerce site, and eventually opening a brick & mortar store in the namesake, Nasty Gal.");
		girlboss.setMyReview("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt "
				+ "ut labore et dolore magna aliqua. Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi "
				+ "ut aliquip ex ea commodoconsequat. ");
		reviewsMap.put(1L, girlboss);
		
		Review wilfred = new Review(2L, "Wilfred", "/images/wilfred.png", "Comedy", 2011);
		wilfred.setContent("Wilfred is a Netflix Original Comedy show about a deeply depressed man who befriends his neighbors dog, "
				+ "who appears to the man as a man dressed in a got costume who speaks in an australian accent and loves to smoke weed."
				+ "The dog gets him into all sorts of trouble as he tries to be his moral compas but actually gives terrible advice."
				+ "The two get in and out of all sorts of mischeif together.");
		wilfred.setMyReview("hilarious Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt "
				+ "ut labore et dolore magna aliqua. Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi "
				+ "ut aliquip ex ea commodoconsequat. ");
		reviewsMap.put(2L, wilfred);
		
		Review love = new Review(3L, "Love", "/images/love.jpg", "Dramedy", 2016);
		love.setContent("A boy and girl meet in a convenience store. They hit it off and their relationship turns into a \"thing\""
				+ ". They both have issues, but what relationship doesnt? And if this show doesn't make you want to move to LA, you're watching it wrong.");
		love.setMyReview("sweet & sour Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt "
				+ "ut labore et dolore magna aliqua. Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi "
				+ "ut aliquip ex ea commodoconsequat. ");
		reviewsMap.put(3L, love);
		
		Review theOA = new Review(4L, "The OA", "/images/the-oa.jpg", "Psychological Thriller", 2016);
		theOA.setContent("A woman returns home after she went missing for 7 years. She gathers a group of misfits to tell her story to."
				+ " She draws you into her world, retelling of her childhood and of the time she's been gone.");
		theOA.setMyReview("Addicting! Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt "
				+ "ut labore et dolore magna aliqua. Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi "
				+ "ut aliquip ex ea commodoconsequat. ");
		reviewsMap.put(4L, theOA);
		
		Review strangerThings = new Review(5L, "Stranger Things", "/images/stranger-things.png", "Scifi", 2016);
		strangerThings.setContent("Follow a group of pree-teen boys in this murder-mystery-adventure set in the 1980's. Wynona Ryder stars as the "
				+ "mother of the missing boy. Strange things happen in a small town, where a deep mystery is finally uncovered and leaves you with "
				+ "an eerie feeling...");
		strangerThings.setMyReview("wicked addicting Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt "
				+ "ut labore et dolore magna aliqua. Ut enim ad minim veniam,quis nostrud exercitation ullamco laboris nisi "
				+ "ut aliquip ex ea commodoconsequat. ");
		reviewsMap.put(5L, strangerThings);
	}
	
	public Collection<Review> findAll() {
		return reviewsMap.values();
	}
	
	public Review findOne(Long id) {
		return reviewsMap.get(id);
	}
	
	
	
	

}
