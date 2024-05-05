package com.example.javaDeveloper.controller;

import java.util.concurrent.atomic.AtomicLong;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javaDeveloper.dto.BuyStockInput;
import com.example.javaDeveloper.dto.VersionInput;
import com.example.javaDeveloper.service.QuestionService;
import com.example.javaDeveloper.dto.StairsInput;

@RestController
@RequestMapping("/question")
public class QuestionController {
	private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

	@PostMapping("/buystock")
	public int buyStock(@RequestBody BuyStockInput buyStockInput)  {
		try {
			return questionService.buyStock(buyStockInput.price);
		} catch (Exception e) {
			throw  e;
		}
		
	}

    @PostMapping("/compareVersion")
	public int compareVersion(@RequestBody VersionInput versionInput)  {
		try {
			return questionService.compareVersion(versionInput.version1,versionInput.version2);
		} catch (Exception e) {
			throw e;
		}
		
	}

    @PostMapping("/climbStairs")
	public int climbStairs(@RequestBody StairsInput stairsInput)  {
		try {
			return questionService.climbStairs(stairsInput.stairsSteps);
		} catch (Exception e) {
			throw e;
		}
		
	}
}