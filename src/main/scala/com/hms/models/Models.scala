package com.hms.models

import java.util.Date


/**
  * Created by vijay on 20/12/16.
  */
case class Hotel(id: Long, name: String, description: String, geoData: GeoData, contactInfo: ContactInfo,
                 address: Address, ratingInfo: RatingInfo, reviewDetails: ReviewDetails, amenities: List[Amenity],
                 photos: List[Photo], rooms: List[Room])

case class GeoData(city: String, state: String, country: String, locality: Option[String], geoPoint: Option[GeoPoint])

case class ContactInfo(phoneNumber: String, mobileNumber: String, email: String, website: Option[String])

case class RatingInfo(starRating: Int, taRating: Option[Double])

case class ReviewDetails(numberOfReviews: Int, reviews: List[Review])

case class Amenity(name: String, description: Option[String], chargeable: Boolean)

case class Review(score: Int, details: String, author: User)

case class Photo(url: String, description: Option[String])

case class Room()

case class Address(line1: String, line2: Option[String], geoData: GeoData)

case class GeoPoint(lat: Double, lng: Double)

case class User(userName: String, passwordHash: String, salt: String, lastLoginTime: Date, registrationDate: Date)
