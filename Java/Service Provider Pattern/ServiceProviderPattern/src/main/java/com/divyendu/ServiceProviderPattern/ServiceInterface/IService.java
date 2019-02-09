package com.divyendu.ServiceProviderPattern.ServiceInterface;

/**
 * 
 * Service Interface component of the Service Provider Pattern
 * Have all implementations implement this interface
 * 
 * @author divyendu
 *
 */
public interface IService {
	
	/*
	 * Have all implementation classes mandatorily provide specific implementations of display() as per need
	 */
	public void display();
}