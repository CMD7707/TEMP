package com.vaibhav.springcloud.couponservice.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.springcloud.couponservice.model.Coupon;

@Service
public class GetCoupon  {

@Autowired	
private CouponRepo couponRepo;

public Coupon findByCode(String code)
{
	List <Coupon> coupons = new ArrayList<>();
	couponRepo.findAll().forEach(coupons::add);
	System.out.println(coupons);
	return coupons.stream().filter(coupon->coupon.getCode().equals(code)).findAny().orElse(null);
}

public Coupon addCoupon(Coupon coupon)
{
	return couponRepo.save(coupon);
}
}