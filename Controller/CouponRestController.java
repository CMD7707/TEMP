package com.vaibhav.springcloud.couponservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.springcloud.couponservice.model.Coupon;
import com.vaibhav.springcloud.couponservice.repo.GetCoupon;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

	@Autowired
	GetCoupon getCoupon;
	
	@PostMapping("/create")
	public Coupon create(@RequestBody Coupon coupon)
	{
	   return getCoupon.addCoupon(coupon); 
	}
	
	@GetMapping("/getcoupon/{code}")
	public Coupon getCoupon(@PathVariable String code)
	{
		System.out.println(code);
		return getCoupon.findByCode(code);
	}
}
