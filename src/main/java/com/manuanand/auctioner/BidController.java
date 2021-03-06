package com.manuanand.auctioner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller	// This means that this class is a Controller
@RequestMapping(path="/bid") // This means URL's start with /bid (after Application path)
public class BidController {
	@Autowired // This means to get the bean called bidRepository
			   // Which is auto-generated by Spring, we will use it to handle the data
	private BidRepository bidRepository;
	
	
	@GetMapping(path="/")
	public @ResponseBody Iterable<Bid> getAllBids() {
		
		// This returns a JSON or XML with the users
		return bidRepository.findAll();
	}

	@GetMapping(path="/{id}")
	public @ResponseBody Bid getSpecificBid(@PathVariable String id) {
		
		Integer bidId = null;
		try {
			bidId = Integer.parseInt(id);
		} catch (NumberFormatException ex) {
			return null;
		}

		Optional<Bid> bid = bidRepository.findById(bidId);
		if (!bid.isEmpty()) {
			return bid.get();
		} 

		return null;
	}

	@GetMapping(path="/deleteAll")
	public @ResponseBody void deleteAllBids() {
		
		// This returns a JSON or XML with the users
		bidRepository.deleteAll();
	}
}