package com.demo.service.review.yjh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.domain.review.yjh.ReviewDto;
import com.demo.mapper.review.yjh.ReviewMapper;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewMapper mapper;
	
	public int addReview(ReviewDto review) {

		return mapper.insertReview(review);
	}

	public int removeByR_id(int r_id) {
		return mapper.deleteReview(r_id);
	}

	public int modifyReview(ReviewDto review) {
		
		return mapper.updateReview(review);
	}

	public ReviewDto getByR_id(int r_id) {
		
		return mapper.selectReview(r_id);
	}

}