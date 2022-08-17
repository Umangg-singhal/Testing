package io.javabrains.ratingsdataservice.resource;

import io.javabrains.ratingsdataservice.model.Rating;
import io.javabrains.ratingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;

    }

}


/*
@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
@RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String  movieId){
    return new Rating(movieId,4);
}
@RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
    List<Rating> ratings = Arrays.asList(
            new Rating("1234" , 4),
            new Rating("5678" , 3)
    );
    UserRating userRating = new UserRating();
    userRating.setUserRating(ratings);
    return userRating;

}
}*/
