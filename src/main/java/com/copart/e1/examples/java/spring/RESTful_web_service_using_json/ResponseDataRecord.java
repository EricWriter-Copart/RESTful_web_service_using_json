package com.copart.e1.examples.java.spring.RESTful_web_service_using_json;

/**
 * A POJO that holds the data the will be sent
 * with the http response
 *
 */
public class ResponseDataRecord 
{
	String favoriteCar;
	String favoriteColor;
	
	public String getFavoriteCar() {
		return favoriteCar;
	}
	public void setFavoriteCar(String favoriteCar) {
		this.favoriteCar = favoriteCar;
	}
	public String getFavoriteColor() {
		return favoriteColor;
	}
	public void setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}
	@Override
	public String toString() {
		return "BodyOfResponsePojo [favoriteCar=" + favoriteCar + ", favoriteColor=" + favoriteColor + "]";
	}		
}
