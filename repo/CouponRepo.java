package com.vaibhav.springcloud.couponservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaibhav.springcloud.couponservice.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	
}
